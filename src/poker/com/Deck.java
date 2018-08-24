package poker.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	/**
	 * deckInit()을 통해 채워지게 될 배열
	 */
	List<Card> Deck = new ArrayList<Card>();

	/**
	 * 카드 생성을 위한 4개의 모양, 13개의 숫자값 이후 deckInit() 을 통해 52장이 카드가 생성됌 각 카드는 모양과 숫자에 해당하는
	 * 정수값을 추가로 가짐
	 */
	private final String[] cardShape = { "♣", "♥", "♦", "♠" };
	private final int[] cardShapePoint = { 1, 2, 3, 4 };
	private final String[] cardNum = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
	private final int[] cardNumPoint = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };

	/**
	 * 카드의 생성자를 호출하며 총 52장의 카드 클래스를 상단의 Deck 참조배열에 집어넣음
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
	 * 덱의 인덱스를 섞음
	 */
	public void deckShuffle() {
		Collections.shuffle(Deck);
	}

	/**
	 * 생성된 덱에서 인덱스 0번의 카드 클래스를 return
	 * return 한 클래스는 덱에서 삭제됨.
	 * @Card
	 */
	public Card getCard() {
		Card temp = Deck.get(0);
		Deck.remove(0);
		return temp;
	}
	
	/**
	 * For Debuging
	 * 
	 * 정수값을 입력하면 해당하는 인덱스의 카드 클래스를 return
	 * return 한 클래스는 덱에서 삭제됨.
	 * @param Int
	 * @return Card
	 */
	public Card getCard(int n) {
		Card temp = Deck.get(n);
		Deck.remove(n);
		return temp;
	}

	/**
	 * 덱의 카드를 인덱스 순서대로 콘솔에 출력.
	 * @param d1
	 */
	public void deckPrint(List<Card> d1) {
		for (int i = 0; i < d1.size(); i++) {
			System.out.println(d1.get(i));
		}
	}

}
