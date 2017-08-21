package production.dustbin;

import java.util.ArrayList;
import java.util.Random;

public class Deck {

	Random r = new Random();
	
	private static String[] suits = { "Hearts", "Clubs", "Spades", "Diamonds" };
	
	private static String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
	
	private Card[] deck;
	
	
	public Deck() {
		int randomRank;
		int randomSuit;
		Card card;
		deck = new Card[52];
		
		for(int index = 0; index < deck.length; index++ ) {
			randomRank = 1 + r.nextInt(11);
			randomSuit = 1 + r.nextInt(3);
			card = new Card(randomRank, randomSuit);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
//	public Deck() {
//		int index;
//		int index2;
//		Card card;
//		
//		for(index = 0; index < 4; index++) {
//			for(index2 = 0; index < 12; index++) {
//				cards.add(new Card(index, index2));
//			}
//		}
//	
//	
//		int randomSuit = 1 + r.nextInt(3);
//		int randomRank = 1 + r.nextInt(11);
//		
//		for(int i = 0; i < cards.size(); i++) {
//			cards.set(i, new Card(randomSuit, randomRank));
//			System.out.print(cards.get(i));
//		}
//	}
	

	
	
}


