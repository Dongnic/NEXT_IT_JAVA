
public class BT4 {
	//BT3번을 풀었을 때만 풀어보세요.
	public static void main(String[] args) {
		Merchant merchant= new Merchant(10000, 10, 1000);
		
		// 10000, 10, 1000이 나올거 같지만  0이 나옵니다.  Merchant의 생성자(int,int,int)를 수정하세요
		System.out.println("상인1이 현재 갖고있는 돈 : " + merchant.getMoney());
		System.out.println("상인1이 현재 갖고있는 사과 개수 : " + merchant.getAppleCount());
		System.out.println("상인1의 사과 가격 : " + merchant.getApplePrice());
		
	}
	
}
