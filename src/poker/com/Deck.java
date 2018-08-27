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

	/*
	 * 덱 생성 : Card 클래스 생성자에 멤버필드의 값을 넣어 총 52장의 카드(객체)를 생성하여 List<Card> Deck 배열에 추가
	 */
	public void deckInit() {
		for (int i = 0; i < cardShape.length; i++) {
			for (int j = 0; j < cardNum.length; j++) {
				Card card = new Card(cardShape[i], cardShapePoint[i], cardNum[j], cardNumPoint[j]);
				Deck.add(card);
			}
		}
	}

	// 덱 셔플 : List<Card> Deck 배열의 배치를 랜덤화
	public void deckShuffle() {
		Collections.shuffle(Deck);
	}

	// 덱 카드 한장 뽑기 : List<Card> Deck 의 인덱스 0번째 카드를 return Deck 의 인덱스 0번 삭제
	public Card getCard() {
		Card card;
		card = Deck.get(0);
		Deck.remove(0);

		return card;
	}

	// 카드 출력 : List<Card> Deck 의 카드들을 순서대로 출력
	public void deckPrint(List<Card> d1) {
		for(int i = 0; i < d1.size(); i++) {
//			System.out.println(d1.get(i));
		}
		System.out.print(Deck);
	}
//	commit
	
}
