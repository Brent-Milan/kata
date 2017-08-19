package production.poker;

public class Card {

	private String[] suits = { "Hearts", "Clubs", "Spades", "Diamonds" };
	
	private String[] values = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
	
	
	//these could probably be 'short', but it is ugly to type over and over
	private int rank;
	
	private int suit;
	
	public Card(int suit, int rank ) {
		this.suit = suit;
		this.rank = rank;
	}
	
	
	
} //end class
