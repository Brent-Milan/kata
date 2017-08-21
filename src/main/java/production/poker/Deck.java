package production.poker;

import java.util.Random;

public class Deck {
	
	Card[] cards;
	
	Random r = new Random();
	
	
	public Deck() {
		cards = new Card[52];
		Card card;
		int randomRank;
		int randomSuit;
		
		for(int index = 0; index < cards.length; index++) {
			randomRank = 1 + r.nextInt(12);
			randomSuit = 1 + r.nextInt(3);
			
			String rankValue = rankEvaluator(randomRank);
			String suitType = suitEvaluator(randomSuit);
			
			card = new Card(rankValue, suitType);
			cards[index] = card;
		}
		
	}
	
	
	public static String rankEvaluator(int randomRank) {
		switch(randomRank) {
			case 1: 
				return "1";
				break;
			case 2: 
				return "2";
				break;
			case 3: 
				return "3";
				break;
			case 4: 
				return "4";
				break;
			case 5: 
				return "5";
				break;
			case 6: 
				return "6";
				break;
			case 7: 
				return "7";
				break;
			case 8: 
				return "8";
				break;
			case 9: 
				return "9";
				break;
			case 10: 
				return "10";
				break;
			case 11: 
				return "Jack";
			case 12: 
				return "Queen";
				break;
			case 13:
				return "Ace";
				break;
			default:
				return "error";
		}
	}
	
	
}
