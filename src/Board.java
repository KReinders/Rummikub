import java.util.ArrayList;
import java.util.List;

public class Board {
	List<Tile> allTiles = createAllTiles();
	
	public Board(){}
	
	private List<Tile> createAllTiles() {
		List<Tile> allTiles = new ArrayList<Tile>(106);
		for (Color color : Color.values()) {
			for (Number number : Number.values()) {
				for (int i = 0; i < 2; i++) {
					allTiles.add(new NumTile(color, number));
				}
			}
		}
		for (int i = 0; i < 2; i++) {
			allTiles.add(new JokerTile());
		}
		return allTiles;
	}
}
