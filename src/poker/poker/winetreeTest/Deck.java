package poker.poker.winetreeTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	List<Card> Deck = new ArrayList<Card>();

	private final String[] cardShape = { "♣", "♥", "♦", "♠" };
	private final int[] cardShapePoint = { 1, 2, 3, 4 };
	private final String[] cardNum = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
	private final int[] cardNumPoint = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };


	/**
	 * 클래스 Card에 멤버필드의 값을 넣어
	 * 총 52장의 카드(객체)를 생성 후
	 * 멤버필드에 있는 List<Card> Deck 배열에 추가
	 */
	public void deckInit() {
		for (int i = 0; i < cardShape.length; i++) {
			for (int j = 0; j < cardNum.length; j++) {
				Card card = new Card(cardShape[i], cardShapePoint[i], cardNum[j], cardNumPoint[j]);
				Deck.add(card);
			}
		}
	}

	/**
	 * 덱 셔플 : List<Card> Deck 배열의 배치를 랜덤화
	 */
	public void deckShuffle() {
		Collections.shuffle(Deck);
	}

	/**
	 * 덱카드 한장 뽑기 : List<Card> Deck의 index 0번째 카드를 card에 담은 후 
	 * Deck의 index 0번째 객체 삭제
	 * @return Card
	 */
	public Card getCard() {
		Card card;
		card = Deck.get(0);
		Deck.remove(0);
		return card;
	}
	
	public Card getCard(int n) {
		Card card;
		card = Deck.get(n); 
		Deck.remove(n);
		return card;
	}
	
	/**
	 * 카드 출력 : List<Card> Deck 의 카드들을 순서대로 출력
	 * @param List<Card> d1
	 */
	public void deckPrint(List<Card> d1) {
		for (int i = 0; i < d1.size(); i++) {
			 System.out.println(d1.get(i));
		}
	}

}
