package poker.com;

public class Main {

	public static void main(String[] args) {
		
		Deck deck = new Deck();
		
		deck.Deck.size();
		deck.getCard();
		deck.deckShuffle();
		
		deck.deckInit();
//		deck.deckShuffle();
		
//		for (int i = 0; i < deck.Deck.size(); i++) {
//			System.out.println(deck.Deck.get(i));
//		}
//		System.out.println();
		
		Card c = deck.getCard();
		System.out.println(c);
		
		
	}
}
