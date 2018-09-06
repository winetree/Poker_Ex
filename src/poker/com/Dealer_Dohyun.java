package poker.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dealer_Dohyun {
	
	Deck DECK;
	Rule RULE;
	
	List<Card> myDeck;
	int myCash;
	
	List<Card> comDeck;
	int comCash;
	
	public void result() {
			System.out.println("\t\t\t  AVENGERS POKER입니다");
		setMoney();
		getCard();
		getCard();
		getCard();
		System.out.println("");
		printDeck(myDeck);
		pickCard();
		
			}
		
	
	public Dealer_Dohyun() {
		DECK = new Deck();
		RULE = new Rule();
		DECK.deckInit();
		DECK.deckShuffle();
		myDeck = new ArrayList<Card>();
		myDeck = new ArrayList<Card>();
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
			if (myCash <10000) {
				System.out.println("\t\t  10000원 이상의 금액으로 배팅해주세요\n");
			}else if(myCash>=10000) {
				System.out.println("\t\t  입력된 배팅 금액은 " + myCash + "원 입니다.");
				break;
			}
		}
		return myCash;
	}
	
	public void getCard() {
		myDeck.add(DECK.getCard());
	}
	
	public Card_Dohyun pickCard() {
		//return myDeck.get(n - 1);
		
		List<Card_Dohyun> myDeck = new ArrayList<Card_Dohyun>();

		for(int i = 0; i < myDeck.size(); i ++) {
			System.out.println(i + 1+ "번째 카드 : " + myDeck.get(i));
		}
		
		System.out.println("카드를 선택하세요");
		int i = input();
		
		Card_Dohyun temp = myDeck.get(i - 1);
		System.out.println(temp);
		return temp;
		}
	public void printDeck(List<Card> d1) {
		System.out.println(d1);
	}
	
	
	
//	public Card_Dohyun aaa() {
//		myDeck.add(deck.getCard());
//		myDeck.add(deck.getCard());
//		myDeck.add(deck.getCard());

	
	
	public void bbb(Card c) {
		
		
		
	}
	
	
	public int com() {
		Deck_Dohyun deck = new Deck_Dohyun();
		 
		deck.deckInit();
		deck.deckShuffle();

		List<Card_Dohyun> comDeck = new ArrayList<Card_Dohyun>();
		
		comDeck.add(deck.getCard());
		comDeck.add(deck.getCard());
		comDeck.add(deck.getCard());
		comDeck.add(deck.getCard());
		comDeck.add(deck.getCard());
		
		Card_Dohyun pickedCard = Test(comDeck);
		
		System.out.println(pickedCard);
		for(int i = 0; i < comDeck.size(); i ++) {
		}
		return comDeck.size();
		}

	public Card_Dohyun Test(List<Card_Dohyun> d1) {
		int num = (int)(Math.random() * 5);
		return d1.get(num);
	}
//	public Card_Dohyun compare() {
//		int a =rule.compareCard(aaa, Test(num));
//		return null;
//		
//	}
	
	
	
	}
