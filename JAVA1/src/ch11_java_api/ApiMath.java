package ch11_java_api;

import java.util.Random;

public class ApiMath {

	public static void main(String[] args) {
		final double PI = 3.141592;
		
		//반올림
		long roundPI = Math.round(PI);
		System.out.println(roundPI);
		
		// 소수 넷째 자리에서 반올림하여 3.142
		double fourPI = (double)Math.round(PI * 1000) / 1000;
		System.out.println(fourPI);
		
		// 올림
		double ceilPI = Math.ceil(PI);
		System.out.println(ceilPI);   // 4.0
		// 버림
		double floorPI = Math.floor(PI);
		System.out.println(floorPI);  // 3.0
		
		// 절댓값
		int minus = -10;
		System.out.println(Math.abs(minus)); // 10
		
		// 제곱
		// 3의 4제곱
		double powVal = Math.pow(3, 4);
		System.out.println(powVal);
		
		// 로직으로 제곱 구현
		
		// 제곱근(루트)
		int anyNum = 144;
		System.out.println(Math.sqrt(anyNum));		
		
		// 랜덤 생성
		
		// 랜덤은 따로 Random 클래스 존재
		// 따로 객체를 생성해야 하는 불편함이 있다
		Random random = new Random();
		
		//.nextInt(n);
		// 0부터 n-1까지 중 랜덤한 정수 리턴
		int randInt = random.nextInt(10);
		System.out.println(randInt);
		
		// 10 ~ 20 사이의 랜덤정수
		randInt = random.nextInt(11)+10;
		System.out.println(randInt);
		
		//랜덤 실수 
		// 0~1까지 랜덤 실수
		System.out.println(random.nextDouble());
		
		// 랜덤 T/F
		System.out.println(random.nextBoolean());
		
		// 10% 확률로 당첨
		randInt = random.nextInt(100) + 1;
		// randInt 1~100
		if(randInt <= 10) {
			System.out.println("당첨");
		}else {
			System.out.println("꽝");
		}
		
		// 35% 확률
		if(randInt <= 35) {
			System.out.println("당첨");
		}else {
			System.out.println("꽝");
		}
		
		// 시드설정
		random.setSeed(7);
		for(int i=0;i<6;i++) {
			System.out.println(random.nextInt(45)+1);
		}
		
	}

}
