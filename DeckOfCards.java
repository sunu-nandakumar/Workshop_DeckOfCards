package deckOfCards;

import java.util.HashSet;
import java.util.Set;

public class DeckOfCards {

		// method for creating the deck of 52 cards
	public static String[] setup(String[] suit, String[] rank, String[] cardCombo) {
		Set<String> uniqueCards = new HashSet<String>();
		//First loop goes through the suit array 
		for (int i = 0; i < suit.length; i++) {
			// loop goes through the rank array
			for (int j = 0; j < rank.length; j++) {
				cardCombo[rank.length * i + j] = suit[i] + rank[j];
			}
		}
		int count = 0;
		while (count < 52) {
			uniqueCards.add(cardCombo[count]);
			count++;
		}
		cardCombo = uniqueCards.toArray( new String[0] );
		for(int i=0; i<cardCombo.length;i++) {
			System.out.println(cardCombo[i]);
		}
		return cardCombo;
	}

	public static void main(String[] args) {
		String[] suit = { "Clubs", "Hearts", "Diamonds", "Spade" };
		String[] rank = { "Ace", "Kings", "Queen", "Jack", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
		String[] cardCombo = new String[52];
	
		// calling the setup method to create the deck
		setup(suit, rank, cardCombo);
		
		
		
		
	}

}
