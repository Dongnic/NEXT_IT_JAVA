package ch06_method;

public class Recursion_Function {

	public static void main(String[] args) {
		// 재귀함수
		// 메소드를 반복 실행하고 싶을 때 사용 
		
		// 5
		// 4
		// 3
		// 2
		// 1
		
		recursionPrint(15);
		System.out.println("=====================");
		
		// 어딨지? [단축키 Ctrl + H] 매우 많이 쓰임
		// 팩토리얼
		long total_pac = 1; // ㅋㅋ 
		for(int i = 15; i > 0; i--) {
			total_pac *= i;
		}
		System.out.println("결과: " + total_pac);
		
		System.out.println(calFac(5));
		
		// 자귀함수를 이용한 팩토리얼 구하는 메소드
		 System.out.println(recurFac(10));
			
			
	}// main

	static long recurFac(int num) {
		if(num == 1){
			return 1;
		}
			return num * recurFac(num-1);		
		}
	static long calFac(int num) {
		long total_pac = 1; // ㅋㅋ 
		for(int i = num; i > 0; i--) {
			total_pac *= i;
		}
		return total_pac;
	}
	
	static void recursionPrint(int num) {
		// num을 출력 후 num - 1 값을 다시 recursionPrint() 메소드에 넣음  	
		System.out.println(num);
		if(num == 0)
		{
			return; // void이기 때문에 리턴 값은 없지만 메소드 종료
		}
		recursionPrint(num - 1);
	}
}
