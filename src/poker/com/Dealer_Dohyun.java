package poker.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dealer_Dohyun {
	
	public void aaa() {
	Deck_Dohyun deck = new Deck_Dohyun();
	
	deck.deckInit();
	deck.deckShuffle();

	List<Card_Dohyun> myDeck = new ArrayList<Card_Dohyun>();
	
	myDeck.add(deck.getCard());
	myDeck.add(deck.getCard());
	myDeck.add(deck.getCard());
	myDeck.add(deck.getCard());
	myDeck.add(deck.getCard());

	for(int i = 0; i < myDeck.size(); i ++) {
		System.out.println(i + 1+ "번째 카드 : " + myDeck.get(i));
	}
	
	System.out.println("카드를 선택하세요");
	Scanner scan = new Scanner(System.in);
	int i = scan.nextInt();
	
	Card_Dohyun temp = myDeck.get(i - 1);
	System.out.println(temp);
	}
	
	}
