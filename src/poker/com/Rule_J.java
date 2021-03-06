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
	public int calculateDeck(List<Card> d1) {
		int a = 0;
		// System.out.println(d1);
		int[] shpArr = deckShpUnpack(d1);
		int[] numArr = deckNumUnpack(d1);
		Arrays.sort(shpArr);
		Arrays.sort(numArr);

		for (int i = 0; i < shpArr.length; i++) {
			System.out.print(shpArr[i]);
		}
		System.out.println();
		for (int i = 0; i < shpArr.length; i++) {
			System.out.print(numArr[i]);
		}
		System.out.println();

		if (royalStraightFlush(shpArr, numArr)) {
			System.out.println("로얄스트레이트플러시");
		} else if (backStraightFlush(numArr, shpArr)) {
			System.out.println("백스트레이트플러쉬");
		} else if (backStraight(numArr)) {
			System.out.println("백스트레이트");
		} else if (straightFlush(shpArr, numArr)) {
			System.out.println("스트레이트플러시");
		}else if (fourCard(numArr)) {
			System.out.println("포카드");
		}else if (flush(shpArr)) {
			System.out.println("플러시");
		} else if (mountain(numArr)) {
			System.out.println("마운틴");
		} else if (backStraight(numArr)) {
			System.out.println("백스트레이트");
		} else if (straight(numArr)) {
			System.out.println("스트레이트");
		} else if (triple(numArr)) {
			System.out.println("트리플");
		} else {
			System.out.println("해당되는것이 없어용");
		}

		return a;
	}

	/**
	 * Parameter List<Card> d1 을 해체하여 cardNumPoint를 int[] 배열에 전부 담아 return
	 * 
	 * @param List<Card>
	 *            d1
	 * @return shpArr
	 */
	public int[] deckShpUnpack(List<Card> d1) {
		int[] shpArr = new int[d1.size()];
		for (int i = 0; i < d1.size(); i++) {
			shpArr[i] = d1.get(i).getCardShapePoint();
		}
		return shpArr;
	}

	/**
	 * Parameter List<Card> d1 을 해체하여 각 카드의 cardShapePoint를 int[] 배열에 전부 담아 return
	 * 
	 * @param List<Card>
	 *            d1
	 * @return numArr
	 */
	private int[] deckNumUnpack(List<Card> d1) {
		int[] numArr = new int[d1.size()];
		for (int i = 0; i < d1.size(); i++) {
			numArr[i] = d1.get(i).getCardNumPoint();
		}
		return numArr;
	}

	/**
	 * 플러쉬 판단 shpArr 배열의 값이 모두 같다면 true를, 아닐 경우 false를 return
	 * 
	 * @param sint[]
	 *            shpArr)
	 * @return true
	 */
	private boolean flush(int[] shpArr) {
		//
		// if(shpArr.length < 5) {
		// return false;
		// }
		for (int i = 1; i < shpArr.length; i++) {
			if (shpArr[i - 1] != shpArr[i]) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 마운틴 판단 numArr 배열이 9, 10, 11, 12, 13 을 모두 가지고 있다면 true를 아닐 경우 false를 return
	 * 
	 * @param int[]
	 *            numArr
	 * @return true
	 */
	private boolean mountain(int[] numArr) {
		for (int i = 0; i < numArr.length; i++) {

			if (numArr[i] != i + 9) {
				return false;
			}
		}
		// System.out.println("마운틴입니다");
		return true;
	}

	/**
	 * 로얄스트레이트플러쉬 판단 flush(shpArr) && mountain(numArr)가 true라면 true를, 아닐 경우 false를
	 * return
	 * 
	 * @param int[]
	 *            shpArr
	 * @param int[]
	 *            numArr
	 * @return true
	 */
	private boolean royalStraightFlush(int[] shpArr, int[] numArr) {

		if (flush(shpArr) && mountain(numArr)) {
			return true;
		}
		return false;
	}

	/**
	 * 백스트레이트 판단 numArr 배열이 1, 2, 3, 4, 13을 모두 가지고 있다면 true를, 아닐 경우 false를 return
	 * 
	 * @param int[]
	 *            numArr
	 * @return true
	 */
	private boolean backStraight(int[] numArr) {
		for (int i = 0; i < numArr.length; i++) {
			if (numArr[i] == i + 1) {
				if (numArr[4] == 13) {
					return true;
				}
				return false;
			}
		}
		return false;
	}

	/**
	 * 백스트레이트플러쉬 판단 flush(shpArr) && backStraight(numArr)가 true라면 true를, 아닐 경우
	 * false를 return
	 * 
	 * @param int[]
	 *            numArr
	 * @param int[]
	 *            shpArr
	 * @return true;
	 */
	private boolean backStraightFlush(int[] numArr, int[] shpArr) {
		if (flush(shpArr) && backStraight(numArr)) {

			return true;
		}
		return false;
	}

	/**
	 * 스트레이트 판단 numArr 배열의 값이 연속되어 있으면 true를, 아닐 경우 false를 return 연속의 예 : [1, 2, 3,
	 * 4, 5] or [3, 4, 5, 6, 7] or [9, 10, 11, 12, 13]
	 * 
	 * @param numArr
	 * @return
	 */
	public boolean straight(int[] numArr) {
		// 1, 2, 3, 4, 5
		for (int i = 1; i < numArr.length; i++) {

			if (numArr[i - 1] != numArr[i] - 1) {
				return false;
			}

			// if (numArr[4]-numArr[3]==1) {
			// if (numArr[i+1] - numArr[i]==1) {
			// return true;
			// }
			// }
		}

		return true;
	}

	/**
	 * 스트레이트 플러쉬 판단 flush(shpArr) && straight(numArr)가 true라면 true를, 아닐 경우 false를
	 * return
	 * 
	 * @param int[]
	 *            shpArr
	 * @param int[]
	 *            numArr
	 * @return true
	 */
	private boolean straightFlush(int[] shpArr, int[] numArr) {
		if (flush(shpArr) && straight(numArr)) {
			return true;
		}
		return false;
	}
	
	/**
	 * 트리플 판단
	 * numArr 배열의 값 중 3개가 서로 같다면 true를, 
	 * 아닐 경우 false를 return
	 * @param int[] numArr
	 * @return true
	 */
	private boolean triple(int[] numArr) {
		for (int i = 1; i < numArr.length; i++) {
			if (numArr[i-1]==numArr[i] && numArr[i]==numArr[i+1]) {
				return true;
			}
		}
		return false;
	}
	
	
	/**
	 * 포카드 판단
	 * numArr 배열의 값 중 4개가 서로 같은 값을 가질 경우 true를, 
	 * 아닐 경우 false를 return
	 * @param numArr
	 * @return
	 */
	private boolean fourCard(int[] numArr) {
		for (int i = 1; i < numArr.length - 2; i++) {
			if (numArr[i-1]==numArr[i] && numArr[i]==numArr[i+1] && numArr[i+1]==numArr[i+2]) {
				return true;
			}
		}
		return false;
	}
//	1,1,2,3,3  //3,4,4,5,5 // 1,1,2,2,3 //
	public boolean twoPair(int[] numArr) {
		for (int i = 1; i < numArr.length-2; i++) {
			if (numArr[i-1]==numArr[i]&&numArr[i]==numArr[i+1]){
				return true;
			}
		}
		return false;
	}
	
	
}
