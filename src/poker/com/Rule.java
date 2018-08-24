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

	public int sameShpCount(int[] shpArr) {
		int startIdx = 1;
		
		for(int i = 1; i < shpArr.length; i ++) {
			if(shpArr[startIdx - 1] == shpArr[i]) {
				startIdx ++;
			} else if(startIdx >= 3 && startIdx < i) {
				startIdx = 0;
			}
		}
		
		return startIdx - 1;
	}
}
