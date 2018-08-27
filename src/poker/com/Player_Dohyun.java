package poker.com;

import java.util.Scanner;

public class Player_Dohyun {
	
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
	public void first() {
		System.out.println("AVENGERS POKER입니다");
		gamemake();
	}
	private void gamemake() {
		System.out.println("");
		System.out.println("제작자 : 박한솔 외 3명\n");
		betting();
	}
	private void betting() {
		System.out.println("배팅금액을 설정하세요");
		System.out.println("최소배팅금액은 10000원 입니다");
		int a =input();
		if(a<=10000) {
			 System.out.println("10000원 이상의 금액으로 배팅해주세요");
			 input(); 
		}
		System.out.println("입력된 배팅 금액은 " +a+ "원 입니다.");
	}
}
