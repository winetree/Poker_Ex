package poker.com;

import java.util.*;

public class Main_Jiho {
	
	public static void main(String[] args) {
		
		Deck deck = new Deck();
		
		deck.deckInit();
		deck.deckShuffle();
		
//		deck.deckPrint(deck.Deck);
		
		System.out.println(deck.Deck);
		
		List<Card> myDeck = new ArrayList<Card>();
		

		myDeck.add(deck.getCard());
		myDeck.add(deck.getCard());
		myDeck.add(deck.getCard());
		myDeck.add(deck.getCard());
		myDeck.add(deck.getCard());
		
		System.out.println(deck.Deck);
		
		System.out.println(myDeck.get(0));
		
		int i = myDeck.get(0).getCardNumPoint();
		System.out.println(i);
		
		Rule_Jiho rule = new Rule_Jiho();
		
		rule.Cal(myDeck);
		
		
		
	}

}
