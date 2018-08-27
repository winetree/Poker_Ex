package poker.com;

import java.util.Arrays;
import java.util.List;

public class Rule {

	/**
	 * Card c1이 c2보다 클 경우 true, 아닐 경우 false
	 *
	 * @param Card c1
	 * @param Card c2
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


	public void Calculation(List<Card> d1) {
		int[] numArr = DeckNumUnpack(d1);
		int[] shpArr = DeckShpUnpack(d1);
		Arrays.sort(numArr);
		Arrays.sort(shpArr);

		for (int i = 0; i < numArr.length; i++) {
			System.out.print("[ " + numArr[i] + " / ");
			System.out.print(shpArr[i] + " ]");
		}

		if (sameShpChk(shpArr)) {
			System.out.println("모양이 같아요");
		}

		if (royalStraightFlush(shpArr, numArr)) {
			System.out.print("로얄 스트레이스 플러쉬");
		} else if (backStraightFlush(shpArr, numArr)) {
			System.out.print("백 스트레이스 플러쉬");
		} else if (straightFlush(shpArr, numArr)) {
			System.out.print("스트레이스 플러쉬");
		} else if (fourCard(shpArr, numArr)) {
			System.out.print("포카드");
		} else if (fullHouse(shpArr, numArr)) {
			System.out.print("풀 하우스");
		} else if (sameShpChk(shpArr)) {
			System.out.print("플러쉬");
		}  else {
			System.out.println("아직 없는 덱 ");
		}
	}

	/**
	 * 덱 안의 카드의 getCardNumPoint() method를 통한 카드의 정보를 int[] 배열에 담아 return
	 *
	 * @param List<Card> d1
	 * @return int[]
	 */
	public int[] DeckNumUnpack(List<Card> d1) {
		int[] temp = new int[d1.size()];
		for (int i = 0; i < d1.size(); i++) {
			temp[i] = d1.get(i).getCardNumPoint();
		}
		return temp;
	}

	/**
	 * 덱 안의 카드의 getCardShpPoint() method를 통한 카드의 정보를 int[] 배열에 담아 return
	 *
	 * @param List<Card> d1
	 * @return int[]
	 */
	public int[] DeckShpUnpack(List<Card> d1) {
		int[] temp = new int[d1.size()];
		for (int i = 0; i < d1.size(); i++) {
			temp[i] = d1.get(i).getCardShapePoint();
		}
		return temp;
	}

	/**
	 * deckNumUnpack 메소드로 int[] 로 변환된 shpArr 배열이 모두 같은 값을 가졌는지는 확인하여 맞으면 true, 아니면 false 반환
	 * 동시에 플러쉬 판단여부를 판단
	 * @param int[] shpArr
	 * @return boolean
	 */
	public boolean sameShpChk(int[] shpArr) {
		for (int i = 1; i < shpArr.length; i++) {
			if (shpArr[i - 1] != shpArr[i]) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 정수 배열로 해체되어 들어온 Deck이 로얄 스트레이트 플러쉬인지 여부를 판단
	 *
	 * @param int[] shpArr
	 * @param int[] numArr
	 * @return boolean
	 */
	public boolean royalStraightFlush(int[] shpArr, int[] numArr) {
		if (sameShpChk(shpArr) &&
						numArr[0] == 9 &&
						numArr[1] == 10 &&
						numArr[2] == 11 &&
						numArr[3] == 12 &&
						numArr[4] == 13
		) {
			return true;
		}
		return false;
	}

	/**
	 * 정수 배열로 해체되어 들어온 Deck이 백 스트레이트 플러쉬인지 여부를 판단
	 *
	 * @param int[] shpArr
	 * @param int[] numArr
	 * @return boolean
	 */
	public boolean backStraightFlush(int[] shpArr, int[] numArr) {
		if (sameShpChk(shpArr) &&
						numArr[0] == 1 &&
						numArr[1] == 2 &&
						numArr[2] == 3 &&
						numArr[3] == 4 &&
						numArr[4] == 13) {
			return true;
		}
		return false;
	}

	/**
	 * 정수 배열로 해체되어 들어온 Deck이 스트레이트 플러쉬인지 여부를 판단
	 *
	 * @param int[] shpArr
	 * @param int[] numArr
	 * @return boolean
	 */
	public boolean straightFlush(int[] shpArr, int[] numArr) {
		int temp = numArr[2];

		if (sameShpChk(shpArr) &&
						numArr[0] == temp - 2 &&
						numArr[1] == temp - 1 &&
						numArr[3] == temp + 1 &&
						numArr[4] == temp + 2) {
			return true;
		}
		return false;
	}

	/**
	 * 정수 배열로 해체되어 들어온 Deck이 포카드인지 여부를 판단
	 *
	 * @param int[] shpArr
	 * @param int[] numArr
	 * @return boolean
	 */
	public boolean fourCard(int[] shpArr, int[] numArr) {
		int cnt = 0;
		int idx = 0;

		for (int i = 1; i < numArr.length; i++) {
			if (cnt >= 3) {
				return true;
			} else if (numArr[idx] == numArr[i]) {
				cnt++;
			} else {
				idx = i;
				cnt = 0;
			}
			if (cnt >= 3) {
				return true;
			}
		}
		return false;
	}
	/**
	 * 정수 배열로 해체되어 들어온 Deck이 풀하우스인지 여부를 판단
	 *
	 * @param int[] shpArr
	 * @param int[] numArr
	 * @return boolean
	 */
	public boolean fullHouse(int[] shpArr, int[] numArr) {
		if (numArr[0] == numArr[1] &&
						numArr[1] == numArr[2] &&
						numArr[2] == numArr[3] &&
						numArr[4] == numArr[5]) {
			return true;
		} else if (numArr[0] == numArr[1] &&
						numArr[2] == numArr[3] &&
						numArr[3] == numArr[4] &&
						numArr[4] == numArr[5]) {
			return true;
		}
		return false;
	}


}
