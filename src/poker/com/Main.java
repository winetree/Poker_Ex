package poker.com;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Deck deck = new Deck();

		List<Card> DECK = deck.deckInit();

		List<Card> myDeck = new ArrayList<Card>();

		myDeck.add(deck.getCard(DECK));
		myDeck.add(deck.getCard(DECK));
		myDeck.add(deck.getCard(DECK));
		myDeck.add(deck.getCard(DECK));
		myDeck.add(deck.getCard(DECK));

		Rule rule = new Rule();

		rule.Calculation(myDeck);

	}
}

