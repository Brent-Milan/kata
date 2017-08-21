package production.poker;

public class Card {

	private String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades"};
	
	private String[] ranks = { "Ace", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
	
	private String suit;
	private String rank;
	
	//constructor
	public Card(String rank, String suit) {
		this.rank = rank;
		this.suit = suit;
	}
	
	public String getSuit() {
		return suit;
	}
	
	public String getRank() {
		return rank;
	}
}
