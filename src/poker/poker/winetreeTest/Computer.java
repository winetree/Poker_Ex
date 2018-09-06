package poker.poker.winetreeTest;

public class Computer extends Player {

	public Card pickCard(int n) {
		return super.getDeck().get(n + 1);
	}

	public void pickBet() {
		super.setBet(3);
	}

}
