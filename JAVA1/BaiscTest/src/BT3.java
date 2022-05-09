
public class BT3 {
	public static void main(String[] args) {
		Merchant merchant= new Merchant(); 
		
		//상인 객체를 만들었고, 임의대로 재산 10000,  개수 10,   개당가격 1000 으로 하려고 한다.
		//그런데 실수로 다음과 같이 만들었다.
		merchant.money=10000;
		merchant.appleCount=-10;       // appleCount에 -를 입력해버렸다.
		merchant.applePrice=1000;
		
		// 이렇게 외부에서  -를 입력해서 money, appleCount, applePrice에 원하지 않는 값이  들어가는 일이 있을 수있다.
		// money,appleCount, applePrice에 0보다 큰 값만 들어 가도록  Merchant 클래스를 수정해보자.
		// hint : get/set,  접근제한자 
		
		
		
	}
}
