package poker.com;

import java.util.*;

public class Main_J {

	public static void main(String[] args) {
		
		Deck deck = new Deck();
		
		deck.deckInit();

		Rule_J rule = new Rule_J();
		
		List<Card> myDeck = new ArrayList<Card>();
		
		myDeck.add(deck.getCard());
		myDeck.add(deck.getCard());
		myDeck.add(deck.getCard());
		myDeck.add(deck.getCard());
		myDeck.add(deck.getCard());

//		System.out.println(myDeck);
		
//		rule.calculateDeck(myDeck);
//		System.out.println(myDeck);
		
		int[] aa = {1,2,3,4,13};
//		System.out.println(rule.mountain(aa));
//		rule.backStraight(aa);
		
	}
}
