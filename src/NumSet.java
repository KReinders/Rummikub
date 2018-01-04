import java.util.List;
import java.util.Optional;

public class NumSet extends Set {
	private List<Tile> set;
	
	private NumSet(List<Tile> tiles) {
		set = tiles;
	}
	
	public static Optional<NumSet> makeSet(List<Tile> list) {
		if (list.size() < 3){
			System.out.println("size: " + list.size());
			return Optional.empty();
		}
		
		Optional<NumTile> prevTile = Optional.empty();
		int i = 1;

		final int len = list.size();
		
		for (Tile tile : list) {
			if (tile instanceof NumTile) {
				if (prevTile.isPresent()) {
					if (prevTile.get().next().equivalent(tile)) { 
						prevTile = Optional.of((NumTile) tile);
					} else {
						System.out.println("Unequivalent");
						return Optional.empty();
					}
				} else {
					prevTile = Optional.of((NumTile) tile);
				}
				if (((NumTile) tile).number.getVal() < i || ((NumTile) tile).number.getVal() > (Number.values().length - len + i)) {
					System.out.println("joker exception");
					return Optional.empty();
				}
			} else {
				if(prevTile.isPresent()) {
					prevTile = Optional.of(prevTile.get().next());
				}
			}
			i++;
		}	
		
		return Optional.of(new NumSet(list));
	}
	public List<Tile> getSet(){
		return set;
	}
}
