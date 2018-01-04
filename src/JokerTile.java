public class JokerTile extends Tile {
		
		@Override
		public String toString() {
			return "JOKER";
		}

		@Override
		public boolean equivalent(Tile tile) {
			return true;
		}
	}