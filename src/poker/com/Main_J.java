package poker.com;

import java.util.*;

public class Main_J {

	public static void main(String[] args) {
		
		Deck deck = new Deck();
		
		Rule_J rule = new Rule_J();
		deck.deckInit();
//		deck.deckShuffle();
		deck.getCard();
		
		List<Card> myDeck = new ArrayList<Card>();
		
		myDeck.add(deck.getCard());
		myDeck.add(deck.getCard());
		myDeck.add(deck.getCard());
		myDeck.add(deck.getCard());
		myDeck.add(deck.getCard());

//		System.out.println(myDeck);
		
//		rule.calculateDeck(myDeck);
//		System.out.println(myDeck);
		
		int[] aa = {5,6,6,6,6};
		
		List<Card> dd = new ArrayList<Card>();
		dd.add(deck.getCard());
		dd.add(deck.getCard());
		dd.add(deck.getCard());
		dd.add(deck.getCard());
		dd.add(deck.getCard());
		deck.deckPrint(dd);
		
//		boolean isc = rule.fourCard(aa);
//		System.out.println(isc);
		
	}
}
