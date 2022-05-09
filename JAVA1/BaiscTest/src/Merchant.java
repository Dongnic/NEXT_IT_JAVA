

//Merchant = 상인   
public class Merchant {
 
	public int money ;     //상인이 가지고 있는 돈
	public int appleCount ;     //상인이 가지고 있는 사과개수
	public int applePrice; //사과 한개당 가격 
	
	public Merchant() {
		
	}
	
	//이 생성자는 BT4와 관련된 내용입니다.
	//생성자입니다. 생성자의 선언부는 고치지말고  실행부만 수정해서 BT4의 메인메소드에서 출력값이 10000, 10, 2000 이 나오도록 하세요.
	public Merchant(int money, int apple, int applePrice) {
		if(money > 0 && apple >0 && applePrice > 0) {
			money=money;
			appleCount=appleCount;
			applePrice=applePrice;
		}else {
			System.out.println("0보다 작은 값은 올수 없습니다.");
		}
	}
	
	
	//BT5 매개변수로 팔 사과 갯수를 받아  상인이 가지고 있는돈, 가지고있는 사과가 올바르게 변경되도록 메소드를 작성하세요.
	public void sellApple(int count) {
		
	}
	
	
}






