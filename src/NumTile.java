public class NumTile extends Tile {
		Color color;   // Joker is fifth and has number 0;
		Number number; // between 1 and 13
		
		public NumTile(Color color, Number number){
			this.color=color;
			this.number=number;
		}
		
		public boolean equivalent(Tile tile) {
			return (tile instanceof JokerTile || ((NumTile) tile).color == color && ((NumTile) tile).number == number);
		}
		
		public NumTile next() {
			return new NumTile(color,number.next());
		}

		@Override
		public String toString() {
			switch(color) {
			case BLACK:
				return "Z-" + number.getVal(); //"\u001b[30m" + number + "\u001b[0m";
			case BLUE:
				return "B-" + number.getVal(); //"\u001b[34m" + number + "\u001b[0m";
			case ORANGE:
				return "O-" + number.getVal(); //"\u001b[33m" + number + "\u001b[0m";
			case RED:
				return "R-" + number.getVal(); //"\u001b[31m" + number + "\u001b[0m";
			default:
				return "";
			}
			
		}
	}