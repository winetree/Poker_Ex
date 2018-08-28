package poker.com;

import java.util.*;

public class GameMake {

	public int input() {
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}

	public void testGame() {

		int result = 0;

		while (true) {

			if (result == 12) {
				break;
			}

			Deck deck = new Deck();

			List<Card> DECK = deck.deckInit();

			List<Card> myDeck = new ArrayList<Card>();

			myDeck.add(deck.getCard(DECK));
			myDeck.add(deck.getCard(DECK));
			myDeck.add(deck.getCard(DECK));
			myDeck.add(deck.getCard(DECK));
			myDeck.add(deck.getCard(DECK));

			Rule rule = new Rule();

			result = rule.Calculation(myDeck);

			DECK = null;
			rule = null;
			myDeck = null;
		}
	}

}
