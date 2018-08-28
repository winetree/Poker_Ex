package poker.com;

/**
 * <Strong>Trump Card Class</Strong><br>
 * 한 장의 카드가 되는 클래스로 카드의 모양과 숫자 정보를 String과 int로 담고 있음
 * @author winetree
 * @Version 1.0
 */

public class Card {
	
	/**
	 * 유저가 보게되는 카드의 모양과, 숫자값
	 */
	private String cardShape;
	private String cardNum;

	/**
	 * 내부 연산에 사용되는 카드위 모양, 숫자의 절대 int 값
	 */
	private int cardShapePoint;
	private int cardNumPoint;
	
	/**
	 * Card 클래스의 생성자. 클래스를 호출하면서 parameter 값에 의해 카드의 정보가 모두 입력되어 Deck 클래스의 List<Card> Deck 에 저장
	 * @param String cardShape
	 * @param int cardShapePoint
	 * @param String cardNum
	 * @param int cardNumPoint
	 */
	public Card(String cardShape, int cardShapePoint, String cardNum, int cardNumPoint) {
		this.cardShape = cardShape;
		this.cardShapePoint = cardShapePoint;
		this.cardNum = cardNum;
		this.cardNumPoint = cardNumPoint;
	}
	
	/**
	 * 디버깅을 위한 카드의 4가지 정보를 모두 String으로 반환해주는 Method
	 * @return String
	 */
	public String getCardInfo() {
		return "Shape : " + cardShape + " / Number : " + cardNum +  " / ShapePoint : " + cardShapePoint +  " / NumberPoint : " + cardNumPoint; 
	}
	
	/**
	 * member field 의 cardShapePoint 를 return 
	 * @return int cardShapePoint
	 */
	public int getCardShapePoint() {
		return this.cardShapePoint;
	}
	/**
	 * member field 의 cardShape 를 return
	 * @return String cardShape
	 */
	public String getCardShape() {
		return this.cardShape;
	}
	
	/**
	 * member field 의 cardNumPoint 를 return
	 * @return int cardNumPoint
	 */
	public int getCardNumPoint() {
		return this.cardNumPoint;
	}
	/**
	 * member field 의 cardNum 을 return
	 * @return String cardNum
	 */
	public String getCardNum() {
		return this.cardNum;
	}
	
	
	/**
	 * 유저에게 카드 정보를 출력해주기 위한 Method
	 * @return String cardShape + cardNum
	 */
	@Override
	public String toString() {
		return cardShape + cardNum;
	}
}