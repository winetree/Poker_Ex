package poker.com;

import java.util.Arrays;
import java.util.List;

/**
 * Five Card Poker Game Logic
 * @author winetree
 * @Version 1.31
 */

public class Rule {

	/**
	 * c1의 점수가 c2보다 높을 경우 true, 아닐 경우 false <br>
	 * 연산은 카드 클래스의 cardShapePoint 를 우선 비교하고 이 값이 같은 경우에만 cardNumPoint 를 비교.
	 * @param Card c1
	 * @param Card c1
	 * @return boolean
	 */
	public boolean compareCard(Card c1, Card c2) {
		boolean isc = false;
		if (c1.getCardShapePoint() > c2.getCardShapePoint()) {
			isc = true;
		} else if (c1.getCardShapePoint() == c2.getCardShapePoint()) {
			if (c1.getCardNumPoint() > c2.getCardNumPoint()) {
				isc = true;
			}
		}
		return isc;
	}

	/**
	 * <Strong>포커 게임 로직의 총괄 Method </Strong><br>
	 * <p> Parameter로 들어온 List<Card>를 기본배열 변환하고 각 private method를 통해
	 * 족보를 판단 </p>
	 * <p> 가장 낮은 족보를 0으로 기준점을 잡고 한단계씩 족보가 높을 경우 1씩 더하여 정수값을 return </p>
	 * @param List<Card> d1
	 */
	public int Calculation(List<Card> d1) {
		int[] numArr = DeckNumUnpack(d1);
		int[] shpArr = DeckShpUnpack(d1);
		Arrays.sort(numArr);
		Arrays.sort(shpArr);

		if (royalStraightFlush(shpArr, numArr)) {
			System.out.println("로얄 스트레이스 플러쉬");
			return 12;
		} else if (backStraightFlush(shpArr, numArr)) {
			System.out.println("백 스트레이스 플러쉬");
			return 11;
		} else if (straightFlush(shpArr, numArr)) {
			System.out.println("스트레이스 플러쉬");
			return 10;
		} else if (fourCard(numArr)) {
			System.out.println("포카드");
			return 9;
		} else if (fullHouse(numArr)) {
			System.out.println("풀 하우스");
			return 8;
		} else if (flush(shpArr)) {
			System.out.println("플러쉬");
			return 7;
		} else if (mountain(numArr)) {
			System.out.println("마운틴");
			return 6;
		} else if (backStraight(numArr)) {
			System.out.println("백 스트레이트");
			return 5;
		} else if (straight(numArr)) {
			System.out.println("스트레이트");
			return 4;
		} else if (triple(numArr)) {
			System.out.println("트리플");
			return 3;
		} else if (twoPair(numArr)) {
			System.out.println("투 페어");
			return 2;
		} else if (onePair(numArr)) {
			System.out.println("원 페어");
			return 1;
		} else {
			System.out.println("탑 카드");
		}
		return 0;
	}

	/**
	 * Parameter List<Card> 배열에서 각 Card 클래스의 cardNumPoint 를 꺼내어 배열로 return
	 * @param List<Card> d1
	 * @return int[]
	 */
	private int[] DeckNumUnpack(List<Card> d1) {
		int[] temp = new int[d1.size()];
		for (int i = 0; i < d1.size(); i++) {
			temp[i] = d1.get(i).getCardNumPoint();
		}
		return temp;
	}

	/**
	 * Parameter List<Card> 배열에서 각 Card 클래스의 cardShapePoint 를 꺼내어 배열로 return
	 * @param List<Card> d1
	 * @return int[]
	 */
	private int[] DeckShpUnpack(List<Card> d1) {
		int[] temp = new int[d1.size()];
		for (int i = 0; i < d1.size(); i++) {
			temp[i] = d1.get(i).getCardShapePoint();
		}
		return temp;
	}

	/**
	 * flush(shpArr) && mountain(numArr)가 == true 를 만족하면 true를, 아닐 경우 false를 return
	 * @param int[] shpArr
	 * @param int[] numArr
	 * @return boolean
	 */
	private boolean royalStraightFlush(int[] shpArr, int[] numArr) {
		if (flush(shpArr) && mountain(numArr)) {
			return true;
		}
		return false;
	}

	/**
	 * flush(shpArr) && backStraight(numArr) == true 를 만족하면 true를, 아닐 경우 false를 return
	 * @param int[] shpArr
	 * @param int[] numArr
	 * @return boolean
	 */
	private boolean backStraightFlush(int[] shpArr, int[] numArr) {
		if (flush(shpArr) && backStraight(numArr)) {
			return true;
		}
		return false;
	}

	/**
	 * flush(shpArr) && straight(numArr) == true 를 만족하면 true를, 아닐 경우 false를 return
	 * @param int[] shpArr
	 * @param int[] numArr
	 * @return boolean
	 */
	private boolean straightFlush(int[] shpArr, int[] numArr) {
		if (flush(shpArr) && straight(numArr)) {
			return true;
		}
		return false;
	}

	/**
	 * numArr 배열에서 4개의 값이 서로 같을 경우 true를, 아닐 경우 false를 return
	 * @param int[] numArr
	 * @return boolean
	 */
	private boolean fourCard(int[] numArr) {
		// int cnt = 0;
		// int idx = 0;
		// for (int i = 1; i < numArr.length; i++) {
		// if (cnt >= 3) {
		// return true;
		// } else if (numArr[idx] == numArr[i]) {
		// cnt++;
		// } else {
		// idx = i;
		// cnt = 0;
		// }
		// if (cnt >= 3) {
		// return true;
		// }
		// }
		for (int i = 0; i <= numArr.length - 4; i++) {
			if (numArr[i] == numArr[i + 1] && numArr[i + 1] == numArr[i + 2] && numArr[i + 2] == numArr[i + 3]) {
				return true;
			}
		}
		return false;
	}

	/**
	 * numArr 배열에서 3개의 값이 서로 같고 또 다른 2개의 값이 서로 같을 경우 true를, 아닐 경우 false를 return
	 * @param int[] numArr
	 * @return boolean
	 */
	private boolean fullHouse(int[] numArr) {
		if (numArr[0] == numArr[1] && numArr[1] == numArr[2] && numArr[3] == numArr[4]) {
			return true;
		} else if (numArr[0] == numArr[1] && numArr[2] == numArr[3] && numArr[3] == numArr[4]) {
			return true;
		}
		return false;
	}

	/**
	 * shpArr 배열의 값들이 모두 서로 같을 경우 true를, 아닐 경우 false를 return
	 * @param int[] shpArr
	 * @return boolean
	 */
	private boolean flush(int[] shpArr) {
		for (int i = 1; i < shpArr.length; i++) {
			if (shpArr[i - 1] != shpArr[i]) {
				return false;
			}
		}
		return true;
	}
	/**
	 * numArr 배열이 9, 10, 11, 12, 13 을 포함하고 있을 경우 true를, 아닐 경우 false를 return
	 * @param numArr
	 * @return boolean
	 */
	private boolean mountain(int[] numArr) {
		if (numArr[0] == 9 && numArr[1] == 10 && numArr[2] == 11 && numArr[3] == 12 && numArr[4] == 13) {
			return true;
		}
		return false;
	}

	/**
	 * numArr 배열이 1, 2, 3, 4, 13 을 포함하고 있을 경우 true를, 아닐 경우 false를 return
	 * @param int[] numArr
	 * @return boolean
	 */
	private boolean backStraight(int[] numArr) {
		if (numArr[0] == 1 && numArr[1] == 2 && numArr[2] == 3 && numArr[3] == 4 && numArr[4] == 13) {
			return true;
		}
		return false;
	}

	/**
	 * numArr 배열이 순차적으로 진행될 경우 true를, 아닐 경우 false를 반환<br>
	 * 순차적 진행의 예시 : { 1, 2, 3, 4, 5 } or { 5, 6, 7, 8, 9 } or { 7, 8, 9, 10, 11 }
	 * @param int[] numArr
	 * @return boolean
	 */
	private boolean straight(int[] numArr) {
		int temp = numArr[2];
		if (numArr[0] == temp - 2 && numArr[1] == temp - 1 && numArr[3] == temp + 1 && numArr[4] == temp + 2) {
			return true;
		}
		return false;
	}

	/**
	 * numArr 배열에서 3개의 값이 서로 같다면 true를, 아닐 경우 false를 return
	 * @param numArr
	 * @return boolean 
	 */
	private boolean triple(int[] numArr) {
		if (numArr[0] == numArr[1] && numArr[1] == numArr[2]) {
			return true;
		} else if (numArr[1] == numArr[2] && numArr[2] == numArr[3]) {
			return true;
		} else if (numArr[2] == numArr[3] && numArr[3] == numArr[4]) {
			return true;
		}
		return false;
	}

	/**
	 * numArr 배열에서 2개의 값이 서로 같고, 또 다른 2개의 값이 서로 같다면 true를, 아닐 경우 false를 return
	 * @param numArr
	 * @return boolean
	 */
	private boolean twoPair(int[] numArr) {
		if (numArr[0] == numArr[1] && numArr[2] == numArr[3]) {
			return true;
		} else if (numArr[1] == numArr[2] && numArr[3] == numArr[4]) {
			return true;
		} else if (numArr[0] == numArr[1] && numArr[3] == numArr[4]) {
			return true;
		}
		return false;
	}

	/**
	 * numArr 배열에서 2개의 값이 서로 같다면 true를, 아닐 경우 false를 return
	 * @param numArr
	 * @return boolean
	 */
	private boolean onePair(int[] numArr) {
		for (int i = 1; i < numArr.length; i++) {
			if (numArr[i - 1] == numArr[i]) {
				return true;
			}
		}
		return false;
	}

}