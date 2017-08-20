package production.poker;

import java.util.ArrayList;
import java.util.Random;

public class Deck {

	private ArrayList<Card> cards = new ArrayList<Card>();
	
	Random r = new Random();
	
	public Deck() {
//		int index1;
//		int index2;
		Card card;
		
		for(int index = 0; index < 4; index++) {
			for(int index2 = 0; index < 12; index++) {
				cards.add(new Card(index, index2));
			}
		}
	}
	
	
}
