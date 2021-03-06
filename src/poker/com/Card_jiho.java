package poker.com;

public class Card_jiho {
	/**
	 * 유저가 보게되는 카드의 모양과, 숫자값
	 */
	private String cardShape;
	private String cardNum;

	/**
	 * 내부 연산에 사용되는 카드위 모양,숫자의 절대 int 값
	 */
	private int cardShapePoint;
	private int cardNumPoint;

	/**
	 * Card 클래스의 생성자 , 클래스를 호출하면서 parameter 값에 의해 카드의 정보가 모두 입력되요.
	 * 
	 * @param cardShape
	 * @param cardShapePoint
	 * @param cardNum
	 * @param cardNumPoint
	 */
	public Card_jiho(String cardShape, int cardShapePoint, String cardNum, int cardNumPoint) {
		this.cardShape = cardShape;
		this.cardShapePoint = cardShapePoint;
		this.cardNum = cardNum;
		this.cardNumPoint = cardNumPoint;
	}

	/**
	 * 디버깅을 위한 카드의 4가지 정보를 모두
	 * 
	 * @return String 카드정보
	 */
	public String getCardInfo() {
		return "Shape :" + cardShape + "/Number:" + cardNum + "/ShapePoint :" + cardNumPoint;
	}

	/**
	 * 외부클래스(Rule)에서 카드 모양의int 값을 얻기위한 Method
	 * 
	 * @return
	 */
	public int getCardNumPoint() {
		return this.cardNumPoint;
	}

	/**
	 * 유저에게 카드 정보를 출력해주기 위한Method List.get(i) 로 호출시 이 Method 를 통해 String 으로 반환
	 * 
	 * @return String 카드모양+카드넘버
	 */
	@Override
	public String toString() {
		return "Shape : " + cardShape + "/ Number :" + cardNum;
	}
}
