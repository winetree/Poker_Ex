package poker.avengers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import poker.com.Card;
import poker.com.Deck;
import poker.com.Rule;

public class Dealer {
	Deck DECK;
	Rule RULE;

	List<Card> myDeck;
	int myCash;

	List<Card> comDeck;
	int comCash;

	public void result() {
		System.out.println("\t\t\t  AVENGERS POKER입니다");
		setMoney();
		gameInit();
		getCard(myDeck);
		getCard(myDeck);
		getCard(myDeck);
		getCard(comDeck);
		getCard(comDeck);
		getCard(comDeck);
		System.out.println("");
		printDeck(myDeck);
		Card temp = pickCard();
		Card comCard = Test(comDeck);
		Rule rule = new Rule();
		boolean compare = rule.compareCard(temp, comCard);
		if (compare) {
			System.out.println("당신이 선공입니다");
			System.out.println("배팅을 선택해주세요");
		} else {
			System.out.println("컴퓨터가 선공입니다");
		}
		 int select = setMoney();
		
		
	}

	public Dealer() {
		DECK = new Deck();
		RULE = new Rule();
		DECK.deckInit();
		DECK.deckShuffle();
		myDeck = new ArrayList<Card>();
		comDeck = new ArrayList<Card>();
	}

	public int input() {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		return a;
	}

	public int setMoney() {
		while (true) {
			myCash = 0;
			System.out.println("\t\t\t   배팅금액을 설정하세요");
			System.out.println("\t\t      최소배팅금액은 10000원 입니다");
			this.myCash = input();
			if (myCash < 10000) {
				System.out.println("\t\t  10000원 이상의 금액으로 배팅해주세요\n");
			} else if (myCash >= 10000) {
				System.out.println("\t\t  입력된 배팅 금액은 " + myCash + "원 입니다.");
				break;
			}
		}
		return myCash;
	}

	public void getCard(List<Card> d1) {
		d1.add(DECK.getCard());
	}

	public Card pickCard() {
		// return myDeck.get(n - 1);

		for (int i = 0; i < myDeck.size(); i++) {
			System.out.println(i + 1 + "번째 카드 : " + myDeck.get(i));
		}

		System.out.println("카드를 선택하세요");
		int i = input();

		Card temp = myDeck.get(i - 1);
		System.out.println("당신이 선택한 카드는 " + temp+ " 입니다");
		return temp;
	}

	public void printDeck(List<Card> d1) {
	}
	
	public void gameInit() {
		
		DECK.deckInit();
		DECK.deckShuffle();
	}

	public Card Test(List<Card> d1) {
		int num = (int) (Math.random() * 3);
		Card com = d1.get(num);
		System.out.println("컴퓨터가 선택한 카드는 " + com + " 입니다");
		return com;
	}
	
	{
	setMoney(2, myCash);
	}
	
	public void setMoney(int n, int cash) {
		switch (n) {
		case 1 : cash -= cash/2; break;
		case 2 : cash -= cash/4; break;
		case 3 : cash -= cash; break;
		case 4 : cash -= cash/5; break;
		}
	}

	public int BetSelect() {
		System.out.println("1. 콜");
		System.out.println("2. 하프");
		System.out.println("3. 올인");
		System.out.println("4. 다이");
		int n = input();
		switch(n) {
		case 1 : n = 1; break;
		case 2 : n = 2; break;
		case 3 : n = 3; break;
		case 4 : n = 4; break;
		}
		return n;
	}

}
