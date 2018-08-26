package poker.com;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Deck deck = new Deck();

		List<Card> DECK = deck.deckInit();

		System.out.println(DECK);

		List<Card> myDeck = new ArrayList<Card>();

		myDeck.add(deck.getCard(DECK, 7));
		myDeck.add(deck.getCard(DECK, 7));
		myDeck.add(deck.getCard(DECK, 7));
		myDeck.add(deck.getCard(DECK, 7));
		myDeck.add(deck.getCard(DECK, 7));

		deck.deckPrint(myDeck);

		Rule rule = new Rule();

		rule.Calculation(myDeck);

	}
}

