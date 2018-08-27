package poker.com;

import java.util.*;

public class Main_J {

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
//		System.out.println(deck.Deck);
		Rule_J rule = new Rule_J();
		
		List<Card> myDeck = new ArrayList<Card>();
		List<Card> comDeck = new ArrayList<Card>();
		
		
		myDeck.add(deck.getCard());
		myDeck.add(deck.getCard());
		myDeck.add(deck.getCard());
		myDeck.add(deck.getCard());
		myDeck.add(deck.getCard());

		
		comDeck.add(deck.getCard());
		comDeck.add(deck.getCard());
		comDeck.add(deck.getCard());
		comDeck.add(deck.getCard());
		comDeck.add(deck.getCard());
		
//		System.out.println(deck.Deck);
//		System.out.println(myDeck);
//		System.out.println(comDeck);
		
//		int a = rule.pointDeck(myDeck);
//		int b = rule.pointDeck(comDecsk);
		
//		rule.compareCard(myDeck.get(0), comDeck.get(0));
//		rule.pointDeck(deck.Deck);
		
		rule.pointDeck(myDeck);
//		rule.sameShpCheck(deck.Deck.get(0).getCardNumPoint());
	}
}
