package poker.com;

import java.util.*;

public class Rule_J {
	// 카드비교 : Card c1과 c2의 모양이 같을 경우 높은숫자의 카드 return
	// 모양이 다를 경우 높은 점수 모양의 카드 return
	// c1의 카드 점수가 c2보다 높을경우 true를 아닐경우 false

	/**
	 * 카드 c1이 c2보다 높을경우 true, 아닐 경우 false
	 * 
	 * @param Card
	 *            c1
	 * @param Card
	 *            c2
	 * @return boolean
	 */
	public boolean compareCard(Card c1, Card c2) {
		boolean isc = false;
		System.out.println(c1 + " / " + c2);

		if (c1.getCardShapePoint() > c2.getCardShapePoint()) {
			isc = true;
		} else if (c1.getCardShapePoint() == c2.getCardShapePoint()) {
			if (c1.getCardNumPoint() > c2.getCardNumPoint()) {
				isc = true;
			}
		}
		System.out.println(isc);
		return isc;
	}

	/**
	 * 덱 비교 : Deck d1의 족보별 점수 return
	 * 
	 * @param d1
	 * @return int
	 */
	public int pointDeck(List<Card> d1) {
		int a = 0;
		// System.out.println(d1);
		// pm7:45 아무 기능 안넣음 이건 나중에할거
		deckShpUnpack(d1);
		deckNumUnpack(d1);
		return a;

		
	}

	/**
	 * Parameter List<Card> d1 을 해체하여 cardNumPoint를 int[] 배열에 전부 담아 return
	 * @param List<Card> d1
	 * @return shpArr
	 */
	private int[] deckShpUnpack(List<Card> d1) {
		int[] shpArr = new int[d1.size()];
		
		for (int i = 0; i < d1.size(); i++) {
			shpArr[i] = d1.get(i).getCardShapePoint();
		}
		
		for (int i = 0; i < d1.size(); i++) {
			System.out.println(i+1+"번째 카드의 점수: "+shpArr[i]);
		}
		
		return shpArr;
	}
	
	/**
	 * Parameter List<Card> d1 을 해체하여 각 카드의 cardShapePoint를 
	 * int[] 배열에 전부 담아 return 
	 * @param List<Card> d1
	 * @return numArr
	 */
	private int[] deckNumUnpack(List<Card> d1) {
		int[] numArr = new int[d1.size()];
		
		for (int i = 0; i < d1.size(); i++) {
			numArr[i] = d1.get(i).getCardNumPoint();
		}
		for (int i = 0; i < numArr.length; i++) {
//			System.out.println(numArr[i]);
		}
		return numArr;
	}
	
	//private로 하기
	public boolean sameShpCheck(int[] shpArr) {
		boolean d = false;
	
		
		return d;
	}

	
	
	
}
