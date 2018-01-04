import java.util.List;
import java.util.Optional;

public class ColSet extends Set {
	private List<Tile> set;
	
	private ColSet(List<Tile> tiles) {
		set = tiles;
	}
	
	public static Optional<ColSet> makeSet(List<Tile> list) {
		if (list.size() < 3 || list.size() > 4){
			System.out.println("size: " + list.size());
			return Optional.empty();
		}
		
		boolean[] colors = {false, false, false, false}; // B O R Z
		Optional<Number> number = Optional.empty();
		
		for (Tile tile : list) {
			if (tile instanceof NumTile) {
				if (!(colors[((NumTile) tile).color.ordinal()]^=true)) return Optional.empty();
				if (number.isPresent() && number.get() != ((NumTile) tile).number) return Optional.empty();
				number = Optional.of(((NumTile) tile).number);
			}
		}
		return Optional.of(new ColSet(list));
	}
	public List<Tile> getSet(){
		return set;
	}
}