package poker.com;

public class Rule_Dohyun {

	public boolean compareCard(Card c1, Card c2) {
		boolean isc = false;
		System.out.println(c1 + " / " + c2);
		
		if(c1.getCardShapePoint() > c2.getCardShapePoint()) {
			isc = true;
		} else if(c1.getCardShapePoint() == c2.getCardShapePoint()) {
			if(c1.getCardNumPoint() > c2.getCardNumPoint()) {
				isc = true;
			}
		}
		System.out.println(isc);
		return isc;	
}
	public void shape() {
		
	}
	public void num() {
		
	}
	
}
