package poker.com;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Deck deck = new Deck();

		List<Card> DECK = deck.deckInit();
		deck.deckShuffle(DECK);

		System.out.println(DECK);

		List<Card> myDeck = new ArrayList<Card>();

		myDeck.add(deck.getCard(DECK, 7));
		myDeck.add(deck.getCard(DECK, 7));
		myDeck.add(deck.getCard(DECK, 7));
		myDeck.add(deck.getCard(DECK, 7));
		myDeck.add(deck.getCard(DECK, 7));

		System.out.println(myDeck);

		deck.deckPrint(myDeck);

		Rule rule = new Rule();

		//dd
		rule.Calculation(myDeck);
		rule.pointCard(myDeck.get(0), myDeck.get(1));

	}
}

