package poker.com;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_COLOR_BURNPeer;

public class Help {
Player_Dohyun PD = new Player_Dohyun();
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
					PD.first();
					break;
				} else {
					System.out.println("\t\t\t   잘못된 입력값입니다");
					System.out.println("\t\t\t    다시 입력 바랍니다\n");
				}
			} catch (InputMismatchException e) {
				System.out.println("\t\t\t  숫자만 입력해주세요\n");
			}
		}
	}

	public void help() {
		System.out.println("\t\t\t\t도움말 입니다");
		System.out.println("\t\t\t포커게임에 대한 소개는 1번");
		System.out.println("\t\t     포커게임에 대한 족보 소개는 2번");
		int result = input();
		if (result == 1) {
			poker();
		} else if (result == 2) {
			rule();
		} else {
			System.out.println("\t\t\t잘못된 입력값입니다.");
			input();
		}
	}

	public void poker() {
		System.out.println("\t\t\t포커게임에 대한 소개입니다");
		System.out.println("\t    AVENGERS POKER의 경우는 FIVE STUD POKER방식이며");
		System.out.println("\t\t딜러에게 유저가 총 5장의 카드를 받아 조합하여\n\t\t 높은 카드조합의 유저가 승리하는 방식입니다\n");
		System.out.println("\t\t\t  도움말이 더 필요하십니까?");
		System.out.println("\t\t\t         1.예 2.아니오");
		int n = input();
		if (n == 1) {
			help();
		} else if (n == 2) {
			PD.first();
		} else {
			System.out.println("범위 밖의 값입니다.");
		}
	}


	private void rule() {
		System.out.println("\t\t\t포커게임 족보에 대한 소개입니다");
		System.out.println("\t\t\t   Avenger Poker의 족보에는\n\t\t\t  총 13가지의 종류가 있습니다");
		System.out.println("\t\t\t     1.로얄스트레이트 플러시\n\t\t\t      2.백스트레이트 플러시\n\t\t\t       3.스트레이트 플러시\n\t\t\t\t     4.포카드\n\t\t\t\t    5.풀하우스\n\t\t\t\t     6.플러시\n\t\t\t\t     7.마운틴\n\t\t\t\t  8.백스트레이트\n\t\t\t\t   9.스트레이트\n\t\t\t\t     10.트리플\n\t\t\t\t     11.투페어\n\t\t\t\t     12.원페어\n\t\t\t\t\t13.탑");
		System.out.println("\t\t\t알고싶은 족보의 번호를 눌러주세요");
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
		}

	}

	private void Top() {
		System.out.println("13번 탑에 대한 소개입니다\n");
		System.out.println("탑은 모양과 상관 없이 \n똑같은 값인 카드가 없고 아무런 조합이 없을 시 \n자신의 덱에서 가장 높은 카드를 탑 이라고 합니다.\n");
		System.out.println("다른 족보의 설명을 듣고싶으시다면 1번 게임을 실행하고 싶으시면 2번을 눌러주세요");
		int n = input();
		if (n == 1) {
			rule();
		} else if (n == 2) {
			PD.getClass();
		} else {
			System.out.println("범위 밖의 값입니다.");
		}
	}

	private void OnePair() {
		System.out.println("12번 원페어에 대한 소개입니다\n");
		System.out.println("원페어는 모양과 상관 없이 \n똑같은 값인 카드가 두장이 있으면 원페어 입니다\n");
		System.out.println("다른 족보의 설명을 듣고싶으시다면 1번 게임을 실행하고 싶으시면 2번을 눌러주세요");
		int n = input();
		if (n == 1) {
			rule();
		} else if (n == 2) {
			PD.first();
		} else {
			System.out.println("범위 밖의 값입니다.");
		}
	}

	private void TwoPair() {
		System.out.println("11번 투페어에 대한 소개입니다\n");
		System.out.println("투페어는 모양과 상관 없이 \n똑같은 값인 카드가 두장씩 2종류가 있으면 투페어 입니다\n");
		System.out.println("다른 족보의 설명을 듣고싶으시다면 1번 게임을 실행하고 싶으시면 2번을 눌러주세요");
		int n = input();
		if (n == 1) {
			rule();
		} else if (n == 2) {
			PD.first();
		} else {
			System.out.println("범위 밖의 값입니다.");
		}
	}

	private void Triple() {
		System.out.println("10번 트리플에 대한 소개입니다\n");
		System.out.println("트리플은 모양과 상관 없이 \n똑같은 값인 카드가 세장이 있으면 트리플 입니다\n");
		System.out.println("다른 족보의 설명을 듣고싶으시다면 1번 게임을 실행하고 싶으시면 2번을 눌러주세요");
		int n = input();
		if (n == 1) {
			rule();
		} else if (n == 2) {
			PD.first();
		} else {
			System.out.println("범위 밖의 값입니다.");
		}
	}

	private void BackStrate() {
		System.out.println("8번 백스트레이트에 대한 소개입니다\n");
		System.out.println("백스트레이트는 5장의 카드가 모양과 상관없이 \n카드의 값이 역순인 A,2,3,4,5 카드의 조합이 되면 백스트레이트 입니다\n");
		System.out.println("다른 족보의 설명을 듣고싶으시다면 1번 게임을 실행하고 싶으시면 2번을 눌러주세요");
		int n = input();
		if (n == 1) {
			rule();
		} else if (n == 2) {
			PD.first();
		} else {
			System.out.println("범위 밖의 값입니다.");
		}
	}

	private void Strate() {
		System.out.println("9번 스트레이트에 대한 소개입니다\n");
		System.out.println("스트레이트는 5장의 카드가 모양과 상관없이 \n카드의 값이 2~10의 숫자중 순서대로 5장이라면 스트레이트 입니다\n");
		System.out.println("다른 족보의 설명을 듣고싶으시다면 1번 게임을 실행하고 싶으시면 2번을 눌러주세요");
		int n = input();
		if (n == 1) {
			rule();
		} else if (n == 2) {
			PD.first();
		} else {
			System.out.println("범위 밖의 값입니다.");
		}
	}

	private void Mountain() {
		System.out.println("7번 마운틴에 대한 소개입니다\n");
		System.out.println("마운틴은 5장의 카드가 모양과 상관없이 \n높은 값인 10,J,Q,K,A의 카드의 조합이 마운틴입니다\n");
		System.out.println("다른 족보의 설명을 듣고싶으시다면 1번 게임을 실행하고 싶으시면 2번을 눌러주세요");
		int n = input();
		if (n == 1) {
			rule();
		} else if (n == 2) {
			PD.first();
		} else {
			System.out.println("범위 밖의 값입니다.");
		}
	}

	private void Flush() {
		System.out.println("6번 플러시에 대한 소개입니다\n");
		System.out.println("플러시는 카드의 값 상관 없이 \n5장의 모양이 모두 같다면 플러시입니다\n");
		System.out.println("다른 족보의 설명을 듣고싶으시다면 1번 게임을 실행하고 싶으시면 2번을 눌러주세요");
		int n = input();
		if (n == 1) {
			rule();
		} else if (n == 2) {
			PD.first();
		} else {
			System.out.println("범위 밖의 값입니다.");
		}
	}

	private void FullHouse() {
		System.out.println("5번 풀하우스에 대한 소개입니다\n");
		System.out.println("풀하우스는 5장의 카드가 모양과 상관없이\n같은 값인 카드 3장과 같은 값인 카드 2장의 조합이 풀하우스입니다\n");
		System.out.println("다른 족보의 설명을 듣고싶으시다면 1번 게임을 실행하고 싶으시면 2번을 눌러주세요");
		int n = input();
		if (n == 1) {
			rule();
		} else if (n == 2) {
			PD.first();
		} else {
			System.out.println("범위 밖의 값입니다.");
		}
	}

	private void FourCard() {
		System.out.println("4번 포카드에 대한 소개입니다\n");
		System.out.println("포카드는 5장의 카드가 모양과 상관없이\n같은 값인 카드가 네장인 조합이 포카드입니다\n");
		System.out.println("다른 족보의 설명을 듣고싶으시다면 1번 게임을 실행하고 싶으시면 2번을 눌러주세요");
		int n = input();
		if (n == 1) {
			rule();
		} else if (n == 2) {
			PD.first();
		} else {
			System.out.println("범위 밖의 값입니다.");
		}
	}

	private void StrateFlush() {
		System.out.println("3번 스트레이트 플러시에 대한 소개입니다\n");
		System.out.println("스트레이트 플러시는 5장의 카드가 전부 똑같은 모양이면서\n카드의 값이 2~10의 숫자중 순서대로 5장이라면 스트레이트플러시입니다\n");
		System.out.println("다른 족보의 설명을 듣고싶으시다면 1번 게임을 실행하고 싶으시면 2번을 눌러주세요");
		int n = input();
		if (n == 1) {
			rule();
		} else if (n == 2) {
			PD.first();
		} else {
			System.out.println("범위 밖의 값입니다.");
		}
	}

	private void BackStrateFlush() {
		System.out.println("2번 백스트레이트 플러시에 대한 소개입니다\n");
		System.out.println("백스트레이트 플러시는 5장의 카드가 전부 똑같은 모양이면서 \n카드의 값이 역순인 A,2,3,4,5 카드의 조합이 되면 백스트레이트입니다\n");
		System.out.println("다른 족보의 설명을 듣고싶으시다면 1번 게임을 실행하고 싶으시면 2번을 눌러주세요");
		int n = input();
		if (n == 1) {
			rule();
		} else if (n == 2) {
			PD.first();
		} else {
			System.out.println("범위 밖의 값입니다.");
		}
	}

	private void RoyalStrateFlush() {
		System.out.println("1번 로얄스트레이트 플러시에 대한 소개입니다\n");
		System.out.println("로얄스트레이트 플러시는 5장의 카드가 전부 똑같은 모양이면서 \n제일 높은 값인 10,J,Q,K,A의 카드의 조합이 로얄스트레이트 플러시입니다\n");
		System.out.println("다른 족보의 설명을 듣고싶으시다면 1번 게임을 실행하고 싶으시면 2번을 눌러주세요");
		int n = input();
		if (n == 1) {
			rule();
		} else if (n == 2) {
			PD.first();
		} else {
			System.out.println("범위 밖의 값입니다.");
		}
	}

}