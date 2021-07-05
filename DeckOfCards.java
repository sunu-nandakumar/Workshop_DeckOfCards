package deckOfCards;

public class DeckOfCards {

	public static void setup() {
		String[] suit = {"Clubs", "Hearts", "Diamonds", "Spade"};
		String[] rank = { "Ace", "Kings", "Queen", "Jack", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
		String[] cardCombo = new String [52];
		
		for(int i=0; i<4;i++) {
			for(int j=0; j<13;j++) {
				cardCombo[rank.length*i+j] = suit[i] + rank[j];
			}
		}
		for (int i=0; i<cardCombo.length;i++) {
			System.out.println(cardCombo[i]);
		}
	}
	
	public static void main(String[] args) {
		setup();

	}

}
