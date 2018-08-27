package poker.com;

import java.util.*;

public class Rule_J {
	// 카드비교 : Card c1과 c2의 모양이 같을 경우 높은숫자의 카드 return
	// 모양이 다를 경우 높은 점수 모양의 카드 return
	// c1의 카드 점수가 c2보다 높을경우 true를 아닐경우 false
	
	/**
	 * 카드 c1이 c2보다 높을경우 true, 아닐 경우 false
	 * @param Card c1
	 * @param Card c2
	 * @return boolean
	 */
	public boolean pointCard(Card c1, Card c2) {
		boolean isc = false;
		System.out.println(c1 + " / " + c2);

		if (c1.getCardShapePoint() > c2.getCardShapePoint()) {
			isc = true;
		} else if (c1.getCardShapePoint() == c2.getCardShapePoint()) {
			if (c1.getCardNumPoint() > c2.getCardNumPoint()) {
				isc =  true;
			}
		}
		System.out.println(isc);
		return isc;
	}

	/**
	 * 덱 비교 : Deck d1의 족보별 점수 return
	 * @param d1
	 * @return int
	 */
	public int pointDeck(List<Card> d1) {

		int a = 0;
		return a;
	}

}
