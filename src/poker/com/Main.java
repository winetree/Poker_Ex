package poker.com;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Deck deck = new Deck();
		
		deck.deckInit();
		deck.deckShuffle();
		/*
		List<Card> myDeck = new ArrayList<Card>();
		
		myDeck.add(deck.getCard());
		myDeck.add(deck.getCard());
		myDeck.add(deck.getCard());
		myDeck.add(deck.getCard());
		myDeck.add(deck.getCard());*/
		
		
		
/*		for (int i = 0; i < deck.Deck.size(); i++) {
			System.out.println(deck.Deck.get(i));
		}
		System.out.println();*/
		
//		Card c = deck.getCard();
		
//		deck.deckPrint();
//System.out.println(c);
		
//		deck.deckPrint(deck.Deck);
//		Rule rule = new Rule();
//		rule.pointCard(deck.Deck);
//		System.out.println(Deck);
		Rule rule = new Rule();
		rule.pointCard(deck.Deck.get(0));
	}
}
