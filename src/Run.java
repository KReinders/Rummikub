import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Run {
	public void run() {
		// Tile t1 = new NumberedTile(Color.BLACK,1);
		// if (t1 instanceof NumberedTile) System.out.println(((NumberedTile)t1).color);
		List<Tile> allTiles = createAllTiles();
		//System.out.println(allTiles[93].toString());
		
		Collections.shuffle(allTiles);

		//System.out.println(allTiles[93].toString());
		
		List<Set> sets = new ArrayList<Set>();
		
		List<Tile> hand = new ArrayList<Tile>();

		/*List<Tile> startSet = new ArrayList<Tile>();
		startSet.add(new NumTile(Color.RED, Number.ONE));
		startSet.add(new JokerTile());
		startSet.add(new NumTile(Color.BLUE, Number.ONE));
		startSet.add(new NumTile(Color.BLACK, Number.ONE));
		
		List<Tile> startSet2 = new ArrayList<Tile>();
		startSet.add(new NumTile(Color.RED, Number.ONE));
		startSet.add(new JokerTile());
		startSet.add(new JokerTile());
		startSet.add(new NumTile(Color.RED, Number.FOUR));
		
		startSet.add(new NumTile(Color.RED, Number.FOUR));
		startSet.add(new NumTile(Color.RED, Number.FIVE));
		startSet.add(new NumTile(Color.RED, Number.SIX));
		Optional<ColSet> optSet = ColSet.makeSet(startSet);
		System.out.println(optSet.isPresent());
		if (optSet.isPresent()) sets.add(optSet.get());
		
		hand.add(new NumTile(Color.BLACK, Number.SEVEN));
		hand.add(new NumTile(Color.ORANGE, Number.ELEVEN));
		hand.add(new NumTile(Color.RED, Number.THREE));
		hand.add(new NumTile(Color.BLUE, Number.TWO));*/
		
		initializeGame();
		
		draw(sets, hand);
	}
	
	
	
	private void initializeGame() {
		// TODO Auto-generated method stub
		
	}

	private void draw(List<Set> sets, List<Tile> hand) {
		System.out.println("------------------------------------------------------------------------\nBOARD");
		drawSets(sets);
		drawHand(hand);
	}

	private void drawSets(List<Set> sets) {
		int i = 1;
		for (Set tiles : sets) {
			System.out.print(i + ": ");
			for (Tile tile : tiles.getSet()) {
				System.out.print(tile.toString() + " ");
				
				//Optional<Tile> tile_ = Optional.ofNullable(tile);
				//tile_.ifPresent(tile__ -> System.out.print(tile__.toString() + " "));
			}
			System.out.println("");
			i++;
		}
	}

	private void drawHand(List<Tile> hand) {
		int i = 1;
		System.out.println("\nHAND");
		for (Tile tile : hand) {
			System.out.print(i + ": " + tile.toString() + "  ");
			i++;
		}
		System.out.print("\n");
	}

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

