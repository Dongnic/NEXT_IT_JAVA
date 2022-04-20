package ch05_control_flow;

public class Function {

	public static void main(String[] args) {
		
		// 랜덤한 수 얻기
		System.out.println(Math.random());
		// Math.random()은 0 ~ 1 사이의 랜덤실수를 리턴  
		
		int randomInt = (int) Math.random(); // 형변환을 해줘야 함 (0 출력)
		int randomInt10 = (int) (Math.random() * 10);
		// *10은 0 <= ~ < 10 사이의 랜덤실수를 리턴 후 정수형으로 출력
		// 즉, 0 ~ 9 중 랜덤 정수가 출력
		
		int randomInt50 = (int) (Math.random() * 50) + 1;
		// + 1을 해주는 이유는 50까지면 50은 빼고 출력이기 때문
		// 즉, 범위는 1 ~ 50
		System.out.println(randomInt);
		System.out.println(randomInt10);
		System.out.println(randomInt50);
	}

}
