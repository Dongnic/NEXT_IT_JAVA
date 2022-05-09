
public class BT5 {
	//BT3,4 푼 사람만
	public static void main(String[] args) {
		Merchant merchant= new Merchant(10000, 10, 1000);
		merchant.sellApple(5); //Merchant 클래스의 sellApple메소드를 보세요.
		System.out.println("남은 사과 개수 : " + merchant.getAppleCount());
		System.out.println("상인이 가지고 있는 돈 : " + merchant.getMoney());
	}
	
}
