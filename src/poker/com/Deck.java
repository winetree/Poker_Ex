package poker.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	/**
	 * 카드 생성을 위한 4개의 모양, 13개의 숫자값 이후 deckInit() 을 통해 52장이 카드가 생성됌 각 카드는 모양과 숫자에 해당하는
	 * 정수값을 추가로 가짐
	 */
	private final String[] cardShape = { "♣", "♥", "♦", "♠" };
	private final int[] cardShapePoint = { 1, 2, 3, 4 };
	private final String[] cardNum = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };
	private final int[] cardNumPoint = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
	
	/**
	 * List<Card> 를 생성하여 deckMake 메소드를 통해 52장의 카드를 받은 후 shuffle 메소드를 통해 셔플 한 뒤 return
	 * @return List<pre> <Card> </pre> 
	 */
	public List<Card> deckInit() {
		List<Card> Deck = new ArrayList<Card>();
		deckMake(Deck);
		deckShuffle(Deck);
		return Deck;
	}

	/**
	 * 덱에 52장의 새로운 카드를 추가
	 * @param List<Card>
	 */
	private void deckMake(List<Card> d1) {
		for (int i = 0; i < cardShape.length; i++) {
			for (int j = 0; j < cardNum.length; j++) {
				Card card = new Card(cardShape[i], cardShapePoint[i], cardNum[j], cardNumPoint[j]);
				d1.add(card);
			}
		}
	}
	
	/**
	 * Parameter List 배열의 인덱스를 랜덤으로 섞음
	 * @param List<Card>
	 */
	private void deckShuffle(List<Card> d1) {
		Collections.shuffle(d1);
	}

	/**
	 * Parameter 로 들어온 덱에서 인덱스 0번의 카드를 반환하고 반환한 카드는 덱에서 제거
	 * @param List
	 * @return Card
	 */
	public Card getCard(List<Card> d1) {
		Card temp = d1.get(0);
		d1.remove(0);
		return temp;
	}
	
	/**
	 * for debugging
	 * 덱에서 특정한 카드를 잡아 반환
	 * @param d1
	 * @param n
	 * @return
	 */
	public Card getCard(List<Card> d1,int n) {
		Card temp = d1.get(n + 1);
		d1.remove(n + 1);
		return temp;
	  }

	public void deckPrint(List<Card> d1) {
		for (int i = 0; i < d1.size(); i++) {
			System.out.println(d1.get(i));
		}
	}

}
