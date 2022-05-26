package project01.model;

public class PokerCardVO {
	String cardtype;      // 카드 타입 (클로버, 다이아)
	int cardnumber;       // 카드 숫자 ( 1 ~ 10 )
	boolean check = true; // 카드 사용 여부 
	
	// 기본 생성자 
	public PokerCardVO() {
		
	}
	
	public PokerCardVO(String cardtype, int cardnumber, boolean check) {
		this.cardtype = cardtype;
		this.cardnumber = cardnumber;
		this.check = check;
	}
	
	public String getCardtype() {
		return cardtype;
	}
	public void setCardtype(String cardtype) {
		this.cardtype = cardtype;
	}
	public int getCardnumber() {
		return cardnumber;
	}
	public void setCardnumber(int cardnumber) {
		this.cardnumber = cardnumber;
	}
	public boolean isCheck() {
		return check;
	}
	public void setCheck(boolean check) {
		this.check = check;
	}
	@Override
	public String toString() {
		return "[" + cardtype + " : " +cardnumber + "]";
	}
}
