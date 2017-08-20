package production.poker;

import java.util.ArrayList;
import java.util.Random;

public class Deck {

	private ArrayList<Card> cards = new ArrayList<Card>();
	
	Random r = new Random();
	
	public Deck() {
		int index;
		int index2;
		Card card;
		
		for(index = 0; index < 4; index++) {
			for(index2 = 0; index < 12; index++) {
				cards.add(new Card(index, index2));
			}
		}
	
	
		int randomSuit = 1 + r.nextInt(3);
		int randomRank = 1 + r.nextInt(11);
		
		for(int i = 0; i < cards.size(); i++) {
			cards.set(i, new Card(randomSuit, randomRank));
		}
	}
	
}
