package poker.com;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_COLOR_BURNPeer;

public class Help {

	/**
	 * 도움말 입력입니다.
	 */
	public int input() {
		Scanner scan = new Scanner(System.in);
		int result = scan.nextInt();
		while (true) {
			try {
			} catch (Exception e) {
				System.out.println("잘못된 값입니다");
			}
			return result;
		}
	}

	public void hel() {
		while (true) {
			try {
				System.out.println("\t\t     도움말은 333번을 눌러주세요");
				System.out.println("\t\t     게임실행은 1번을 눌러주세요");
				int result = input();
				if (result == 333) {
					help();
					break;
				} else if (result == 1) {
					break;
				} else {
					System.out.println("\t\t\t   잘못된 입력값입니다");
					System.out.println("\t\t\t    다시 입력 바랍니다\n");
				}
			} catch (InputMismatchException e) {
				System.out.println("숫자만 입력해주세요 ㅠㅠ");
			}
		}
	}

	public void help() {
		System.out.println("\t\t\t\t도움말 입니다");
		System.out.println("\t\t\t포커게임에 대한 소개는 1번");
		System.out.println("\t\t      포커게임에 대한 족보 소개는 2번");
		System.out.println("\t\t포커게임에 대한 진행방식에 대한 소개는 3번");
		int result = input();
		if (result == 1) {
			poker();
		} else if (result == 2) {
			rule();
		} else if (result == 3) {
			play();
		} else {
			System.out.println("\t\t\t잘못된 입력값입니다.");
			input();
		}
	}

	public void poker() {
		System.out.println("\t\t\t포커게임에 대한 소개입니다");
		System.out.println("\t    AVENGERS POKER의 경우는 FIVE STUD POKER방식이며");
		System.out.println("\t\t딜러에게 유저가 총 5장의 카드를 받아 조합하여\n\t\t 높은 카드조합의 유저가 승리하는 방식입니다");
		System.out.println("\n도움말이 더 필요하십니까?");
		System.out.println("1.예 2.아니오");
		int n = input();
		if (n == 1) {
			help();
		} else if (n == 2) {
			play();
		} else {
			System.out.println("범위 밖의 값입니다.");
		}
	}

	private void play() {

	}

	private void rule() {
		System.out.println("\t\t\t포커게임 족보에 대한 소개입니다");
		System.out.println("\t\t\t   Avenger Poker의 족보에는\n\t\t\t  총 13가지의 종류가 있습니다");
		System.out.println(
				"1.로얄스트레이트 플러시\n2.백스트레이트 플러시\n3.스트레이트 플러시\n4.포카드\n5.풀하우스\n6.플러시\n7.마운틴\n8.백스트레이트\n9.스트레이트\n10.트리플\n11.투페어\n12.원페어\n13.탑");
		System.out.println("알고싶은 족보의 번호를 눌러주세요");
		int n = input();
		if (n == 1) {
			RoyalStrateFlush();
		} else if (n == 2) {
			BackStrateFlush();
		} else if (n == 3) {
			StrateFlush();
		} else if (n == 4) {
			FourCard();
		} else if (n == 5) {
			FullHouse();
		} else if (n == 6) {
			Flush();
		} else if (n == 7) {
			Mountain();
		} else if (n == 8) {
			BackStrate();
		} else if (n == 9) {
			Strate();
		} else if (n == 10) {
			Triple();
		} else if (n == 11) {
			TwoPair();
		} else if (n == 12) {
			OnePair();
		} else if (n == 13) {
			Top();
		} else {
			System.out.println("해당되지 않는 값입니다.다시 입력해주세요");
			System.out.println(n == input());
		}

	}

	private void Top() {

	}

	private void OnePair() {

	}

	private void TwoPair() {

	}

	private void Triple() {

	}

	private void BackStrate() {

	}

	private void Strate() {

	}

	private void Mountain() {

	}

	private void Flush() {

	}

	private void FullHouse() {

	}

	private void FourCard() {

	}

	private void StrateFlush() {

	}

	private void BackStrateFlush() {

	}

	private void RoyalStrateFlush() {
		System.out.println("1번 로얄스트레이트 플러시에 대한 소개입니다");
		System.out.println("로얄스트레이트 플러시는 5장의 카드가 전부 똑같은 모양이면서 \n제일 높은 값인 10,J,Q,K,A의 카드의 조합이 로얄스트레이트 플러시입니다\n");
		System.out.println("다른 족보의 설명을 듣고싶으시다면 1번 게임을 실행하고 싶으시면 2번을 눌러주세요");
		int n = input();
		if (n == 1) {
			rule();
		} else if (n == 2) {
			play();
		} else {
			System.out.println("범위 밖의 값입니다.");
		}
	}

}