package poker.com;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Deck deck = new Deck();
		
		deck.deckInit();
		deck.deckShuffle();
		
		List<Card> myDeck = new ArrayList<Card>();
		
		
		myDeck.add(deck.getCard());
		myDeck.add(deck.getCard());
		myDeck.add(deck.getCard());
		myDeck.add(deck.getCard());
		myDeck.add(deck.getCard());
		
		deck.deckPrint(myDeck);
		
		
	}
}
