package poker.com;

public class Card_Dohyun {

	private String cardShape;
	private String cardNum;

	private int cardShapePoint;
	private int cardNumPoint;

	public Card_Dohyun(String cardShape, int cardShapePoint, String cardNum, int cardNumPoint) {
		this.cardShape = cardShape;
		this.cardShapePoint = cardShapePoint;
		this.cardNum = cardNum;
		this.cardNumPoint = cardNumPoint;
	}

	public String getCardInfo() {
		return "Shape : " + cardShape + " / Number : " + cardNum + " / ShapePoint : " + cardShapePoint + " / NumPoint : " + cardNumPoint;
	}

	public int getCardShapePoint() {
		return this.cardShapePoint;
	}

	public int getCardNumPoint() {
		return this.cardNumPoint;
	}
	
	@Override
	public String toString () {
		return cardShape + cardNum;
	}
}