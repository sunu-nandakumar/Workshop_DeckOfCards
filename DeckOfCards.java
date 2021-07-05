package deckOfCards;

public class DeckOfCards {

	// method for creating the deck of 52 cards
	public static String[] setup(String[] suit, String[] rank, String[] cardCombo) {
//First loop goes through the suit array 
		for (int i = 0; i < suit.length; i++) {
			// loop goes through the rank array
			for (int j = 0; j < rank.length; j++) {
				cardCombo[rank.length * i + j] = suit[i] + rank[j];
			}
		}
//		Printing the CardCombo array
		for (int i = 0; i < cardCombo.length; i++) {
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
