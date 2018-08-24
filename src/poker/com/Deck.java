package poker.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	List<Card> Deck = new ArrayList<Card>();

	private final String[] cardShape = { "♣", "♥", "♦", "♠" };
	private final int[] cardShapePoint = { 1, 2, 3, 4 };
	private final String[] cardNum = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
	private final int[] cardNumPoint = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };

	public void deckInit() {
		for (int i = 0; i < cardShape.length; i++) {
			for (int j = 0; j < cardNum.length; j++) {
				Card card = new Card(cardShape[i], cardShapePoint[i], cardNum[j], cardNumPoint[j]);
				Deck.add(card);
			}
		}
	}

	public void deckShuffle() {
		Collections.shuffle(Deck);
	}

	public Card getCard() {
		Card temp = Deck.get(0);
		Deck.remove(0);
		return temp;
	}

}
