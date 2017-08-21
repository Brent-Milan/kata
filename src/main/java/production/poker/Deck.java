package production.poker;

import java.util.Random;

public class Deck {
	
	Card[] deck;
	
	Random r = new Random();
	
	
	public Deck() {
		deck = new Card[52];
		Card card;
		int randomRank;
		int randomSuit;
		
		for(int index = 0; index < deck.length; index++) {
			randomRank = 1 + r.nextInt(11);
			randomSuit = 1 + r.nextInt(3);
			
			card = new Card(randomRank, randomSuit);
			deck[index] = card;
		}
		
	}
	
	
	
	
	
}
