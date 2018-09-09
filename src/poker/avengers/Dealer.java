package poker.avengers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.management.timer.Timer;

import poker.com.Card;
import poker.com.Deck;
import poker.com.Rule;

public class Dealer {

	private Deck DECK;
	private Rule RULE;
	private Help HELP;

	private List<Card> myDeck;
	private int myCash;

	private List<Card> comDeck;
	private int comCash;

	private int sumCash;

	public Dealer() {
		// 게임 초기화
		DECK = null;
		RULE = null;
		myDeck = null;
		comDeck = null;

		// 룰과 덱 클래스 생성
		DECK = new Deck();
		RULE = new Rule();
		HELP = new Help();

		// 덱 초기화 및 셔플
		DECK.deckInit();
		DECK.deckShuffle();

		// 사용자 덱과 컴퓨터 덱 초기화
		myDeck = new ArrayList<Card>();
		comDeck = new ArrayList<Card>();

		// 사용자 돈과 컴퓨터 돈 초기화
		this.myCash = 100000;
		this.comCash = 100000;
	}

	public void gameMake() {
		while (true) {
			System.out.println("\t\t\t  AVENGERS POKER입니다");
			System.out.println("도움말은 1번을 입력하세요 나머지 값을 입력하면 게임시 시작됩니다.");
			if(input() == 1) {
				HELP.help();
			}

			System.out.println("\t\t\t  Game을 시작하겠습니다. \n");
			System.out.println("\t\t\t당신이 가진 돈은 " + myCash + " 원 입니다.\n");
			setMoney();

			// 내 덱과 컴퓨터의 덱에 3장의 카드를 추가
			for (int i = 0; i < 3; i++) {
				getCard(myDeck);
				getCard(comDeck);
			}

			printDeck(myDeck);

			System.out.println("\t\t 공개할 카드를 한장 선택하세요.");
			Card myCard = chooseCard(myDeck);
			Card comCard = chooseComCard(comDeck);

			System.out.println("당신이 선택한 카드는 : " + myCard);
			System.out.println("컴퓨터가 선택한 카드는 : " + comCard);
			boolean cardWinner = RULE.compareCard(myCard, comCard);

//			if (cardWinner) {
//				System.out.println("당신이 먼저 턴을 가져가요.");
//			} else {
//				System.out.println("컴퓨터가 먼저 턴을 가져가요.");
//			}

			System.out.println("카드를 받기 위해 돈을 베팅하세요");
			setMoney();
			System.out.println("사용자가 카드 한장을 받습니다.");
			getCard(myDeck);
			System.out.print("플레이어의 카드 : " + myDeck + " \n");
			System.out.println("현재 최종 판돈은 : " + sumCash + "원 입니다.");

			System.out.println("컴퓨터가 베팅합니다.");
			sumCash += 30000;
			System.out.println("컴퓨터가 카드 한장을 받습니다.");
			getCard(comDeck);
			System.out.println("현재 최종 판돈은 : " + sumCash + "원 입니다.");

			System.out.println("카드를 받기 위해 돈을 베팅하세요");
			setMoney();
			System.out.println("사용자가 카드 한장을 받습니다.");
			getCard(myDeck);
			System.out.println("현재 최종 판돈은 : " + sumCash + "원 입니다.");

			sumCash += 30000;
			System.out.println("컴퓨터가 카드 한장을 받습니다.");
			getCard(comDeck);
			System.out.println("현재 최종 판돈은 : " + sumCash + "원 입니다.");

			System.out.println("최종 베팅금액을 설정하세요.");
			setMoney();
			System.out.println("컴퓨터가 50000원을 베팅하였습니다.");
			sumCash += 50000;
			System.out.println("현재 최종 판돈은 : " + sumCash + "원 입니다.");
			
			System.out.print("플레이어의 카드 : " + myDeck + " ");
			int myPoint = RULE.Calculation(myDeck);
			System.out.print("컴퓨터의 카드 : " + comDeck + " ");
			int comPoint = RULE.Calculation(comDeck);

			if (myPoint > comPoint) {
				System.out.println("플레이어 승리");
				myCash += sumCash;
			} else if (myPoint < comPoint) {
				System.out.println("컴퓨터 승리");
			} else {
				System.out.println("비겼네여 판돈은 딜러가 먹튀했습니다");
			}
			
		}
	}

	public void die() {

	}

	public void call() {
		myCash -= 10000;
	}

	public Card chooseCard(List<Card> d1) {
		int n = input();
		return d1.get(n - 1);
	}

	public void printDeck(List<Card> d1) {
		System.out.println("\t\t 당신이 가지고 있는 카드는 다음과 같습니다.");
		for (int i = 0; i < d1.size(); i++) {
			System.out.println("\t" + (i + 1) + "번째 카드 : " + d1.get(i));
		}
	}

	public void getCard(List<Card> d1) {
		d1.add(DECK.getCard());
	}

	public void result() {

	}

	public int input() {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		return a;
	}

	public void setMoney() {
		while (true) {
			System.out.println("\t\t\t   배팅금액을 설정하세요");
			System.out.println("\t\t      최소배팅금액은 10000원 입니다");
			int n = input();
			sumCash += n;
			myCash -= n;
			if (n < 10000) {
				System.out.println("\t\t  10000원 이상의 금액으로 배팅해주세요\n");
			} else if (myCash >= 10000) {
				System.out.println("\t\t  입력된 배팅 금액은 " + sumCash + "원 입니다.");
				System.out.println("\t\t  당신의 남은 금액은 " + myCash + "원 입니다.");
				break;
			}
		}
	}

	public Card pickCard() {
		// return myDeck.get(n - 1);

		for (int i = 0; i < myDeck.size(); i++) {
			System.out.println(i + 1 + "번째 카드 : " + myDeck.get(i));
		}

		System.out.println("카드를 선택하세요");
		int i = input();

		Card temp = myDeck.get(i - 1);
		System.out.println("당신이 선택한 카드는 " + temp + " 입니다");
		return temp;
	}

	public void gameInit() {

		DECK.deckInit();
		DECK.deckShuffle();
	}

	public Card chooseComCard(List<Card> d1) {
		int num = (int) (Math.random() * 3);
		Card com = d1.get(num);
		return com;
	}

	{
		setMoney(2, myCash);
	}

	public void setMoney(int n, int cash) {
		switch (n) {
		case 1:
			cash -= cash / 2;
			break;
		case 2:
			cash -= cash / 4;
			break;
		case 3:
			cash -= cash;
			break;
		case 4:
			cash -= cash / 5;
			break;
		}
	}

	public int BetSelect() {
		System.out.println("1. 콜");
		System.out.println("2. 하프");
		System.out.println("3. 올인");
		System.out.println("4. 다이");
		int n = input();
		switch (n) {
		case 1:
			n = 1;
			break;
		case 2:
			n = 2;
			break;
		case 3:
			n = 3;
			break;
		case 4:
			n = 4;
			break;
		}
		return n;
	}

}
