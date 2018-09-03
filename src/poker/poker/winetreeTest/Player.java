package poker.poker.winetreeTest;

import java.util.ArrayList;
import java.util.List;

public abstract class Player {
	
	private int CASH;
	private List<Card> DECK;
	
	public Player() {
		CASH = 10000;
		DECK = new ArrayList<Card>();
	}
	
	public void setCash(int CASH) {
		this.CASH = this.CASH + CASH;
	}
	
	public int getCash() {
		return this.CASH;
	}
	
	public List<Card> getDeck() {
		return this.DECK;
	}
	
	public int setBet(int n) {
		switch(n) {
		case 1 : this.CASH -= 1000; return 1000;
		case 2 : this.CASH -= 2000; return 2000;
		case 999 : return -1;
		}
		
		return 0;
	}
	
	

}
