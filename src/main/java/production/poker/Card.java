package production.poker;

public class Card {

	//these could probably be 'short', but it is ugly to type over and over
	private int rank;
	private int suit;
	
	//constructor
	public Card(int suit, int rank ) {
		this.suit = suit;
		this.rank = rank;
	}
	
	
	
	/*****************************
	 * Getter Methods
	 ****************************/
	
	public int getRank() {
		return rank;
	}

	public int getSuit() {
		return suit;
	}
	
	/*******************************
	 * MISC
	 ******************************/
//	@Override
//	public String toString() {
//		return ranks[rank] + " of " + suits[suit];
//	}
	
	public static String rankAsString(int rank) {
		return ranks[rank];
	}
	
} //end class
