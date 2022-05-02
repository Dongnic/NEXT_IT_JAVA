package ch09_class;

// 유용한 함수들을 제공하는 클래스 
public class utilClass {
	
	/**
	 * 입력한 실수를 소수 n번째 자리로 리턴해주는 함수 
	 * @param num 반올림하고자 하는 실수
	 * @param n   소수 n번째 자리까지 리턴
	 * @return    반올림된 실수 리턴 
	 */
	public static double weRound(double num, int n) {
		// Math.round()는 소수 첫째자리에서
		// 반올림한 정수를 리턴
		// ex) Math.round(3.141592) = 3
		
		// 소수 첫째짜리까지 나오게 하는 방법 
		// x 10 을 하여
		// Math.round(31.41592) = 31
		// 10으로 나누면 3.1 
		
		// 소수 둘째짜리 
		// x 100 후 값을 100으로 나눈다 3.14 
		
		// 결국 자리수 n = 10의 n승을 곱한뒤 Math.round() 후 10의 n승으로 나눔
		
		int one = 1;
		for(int i = 0; i < n; i++) {
			one *= 10;
		}
		num *= one;
		long temp = Math.round(num);
		double result = (double)temp / one;
	
		return result;
	}
			
	
	
	
}
