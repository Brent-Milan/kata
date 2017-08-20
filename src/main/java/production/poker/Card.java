package production.poker;

public class Card {

	private static String[] suits = { "Hearts", "Clubs", "Spades", "Diamonds" };
	
	private static String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
	
	
	//these could probably be 'short', but it is ugly to type over and over
	private int rank;
	
	private int suit;
	
	//constructor
	public Card(int suit, int rank ) {
		this.suit = suit;
		this.rank = rank;
	}
	
	@Override
	public String toString() {
		return ranks[rank] + " of " + suits[suit];
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

	public static String rankAsString(int rank) {
		return ranks[rank];
	}
	
} //end class
