public enum Number{
		ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, ELEVEN, TWELVE, THIRTEEN;
		
		public int getVal() {
			return this.ordinal()+1;
		}
		
		public Number next() {
	        return Number.values()[(this.ordinal()+1) % Number.values().length];
	    }
	}