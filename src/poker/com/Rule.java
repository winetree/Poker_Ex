package poker.com;

import java.util.Arrays;
import java.util.List;

public class Rule {

	public void Calculation(List<Card> d1) {
		int[] numArr = DeckNumUnpack(d1);
		int[] shpArr = DeckShpUnpack2(d1);
		Arrays.sort(numArr);
		Arrays.sort(shpArr);

		for (int i = 0; i < numArr.length; i++) {
			System.out.print("[ " + numArr[i] + " / ");
			System.out.print(shpArr[i] + " ]");
		}

		if(royalStraightFlush(shpArr,numArr)) {
			System.out.print("로얄 스트레이스 플러쉬");
		}


	}

	public int[] DeckNumUnpack(List<Card> d1) {
		int[] temp = new int[d1.size()];
		for (int i = 0; i < d1.size(); i++) {
			temp[i] = d1.get(i).getCardNumPoint();
		}
		return temp;
	}

	public int[] DeckShpUnpack2(List<Card> d1) {
		int[] temp = new int[d1.size()];
		for (int i = 0; i < d1.size(); i++) {
			temp[i] = d1.get(i).getCardShapePoint();
		}
		return temp;
	}

	/**
	 * 다섯장의 카드가 같은 모양인지를 분별
	 *
	 * @param shpArr
	 * @return
	 */
	public boolean sameShpChk(int[] shpArr) {
		for (int i = 1; i < shpArr.length; i++) {
			if (shpArr[i - 1] != shpArr[i]) {
				return false;
			}
		}
		return true;
	}

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
}
