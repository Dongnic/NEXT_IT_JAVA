package ch06_method;

import java.util.Scanner;

public class Method_Study {

	public static void main(String[] args) {
		// 함수 = function = method
		// method 클래스에 종속된 함수
		// function 클래스에 독립적인 함수
		
		// 1부터 100까지 다 더하면 결과는?
		int sumNum = 0;
		for(int i = 1; i <= 100; i++) {
			sumNum += i;
		}
		System.out.println("1부터 100까지 합 : " + sumNum);
		
		// 30부터 60까지 다 더하면 결과는?
		sumNum = 0;
		for(int i = 30; i >= 0; i--) {
			sumNum += 30 + i;
		}
		System.out.println("30부터 60까지 합 : " + sumNum);
		
		// 25부터 50까지 다 더하면 결과는?
		sumNum = 0;
		for(int i = 25; i >= 0; i--) {
			sumNum += 25 + i;
		}
		System.out.println("25부터 50까지 합 : " + sumNum);
		
		System.out.println("=======================");
		
		// 70부터 90까지 더하기 Method 이용 
		printSum(70, 90);
		printSum(returnSum(1,10), 56);
		// 함수를 쓰면 좋은 점
		// 실행부의 코드가 간결해진다
		// 중복된 코드를 한 곳에서 관리할 수 있으므로
		// 수정할 때 용이하다
		
		// 리턴 값이 존재하는 함수 만들기
		// 리턴 값이 존재하는 함수는
		// 실행결과를 변수에 담을 수 있다.
		// 변수 타입은 해당 함수의 리턴 타입과 일치해야 한다.
		int sum = returnSum(70, 90);
		System.out.println(sum);
		// 리턴 값을 변수에 저장하지 않아도 상관없음 
		System.out.println("합 : " + returnSum(70, 90));
	
		System.out.println("=======================");

		// System.out.println()을 print()로 만들어쓰기
		print("카카시");
		printInt(returnSum(1,10));
		
		System.out.println("=======================");
		
		// Math.abs() 만들기
		int abs = absolute(-100);
		System.out.println(abs);
		
		System.out.println("=======================");
		
		// 이름, 국어, 영어, 수학 점수를 입력받아서
		// 이름, 국어, 영어, 수학, 평균, 등급을
		// 출력해주는 메소드(gradeCard)를 만드시오
		// 90점 이상 A 80점 이상 B 그외 C
		
		gradeCard("유동준", 90, 90, 10);
		
		System.out.println("=======================");
		eachAdd("123456789");
		eachAdd(123456789);
		// 
		playPoketmon();
	}
	
	static void playPoketmon() {
		// 포켓몬스터 
		Scanner sc = new Scanner(System.in);
		int enermyHp = 100;
		outer: while(true) {
			System.out.println("야생의 파이리를 만났습니다.");
			System.out.println("행동을 선택해주세요");
			System.out.println("1. 공격 | 2. 도망");
			System.out.print(">>> ");
			
			int command = Integer.parseInt(sc.nextLine());
			
			if(command == 1) {
				while(true) {
					System.out.println("공격 방법 선택");
					System.out.println("1. 백만볼트 | 2. 전광석화 | 3. 이전 선택지로");
					System.out.print(">>> ");
					
					int attack = Integer.parseInt(sc.nextLine());
					
					if(attack == 1) {
						System.out.println("####백만볼트#### -20");
						enermyHp -= 20;
					}else if(attack == 2) {
						System.out.println("%%%%전광석화%%%% -10");
						enermyHp -= 10;
					}else if(attack == 3) {
						// 내부 while문 종료 후 다음 반복문 계속 실행 
						break;
					}else {
						System.out.println("1, 2, 3 중에 입력하세요");
					}
					if(enermyHp <= 0) {
						System.out.println("파이리를 잡았다!");
						System.exit(0); // 프로그램 종료
//						break outer; // 해당 이름(outer)반복문 종료
						return; // 메소드 종료 
					}
				}
			}else if(command == 2) {
				System.out.println("도망쳤다!");
				break;
			}else {
				System.out.println("1, 2, 3 중에 입력하세요");
			}
			
		}
	}
	
	static void eachAdd(String num) {
		int exampleResult = 0;
		for(int i = 0; i < num.length(); i++) {
		exampleResult += Integer.parseInt(num.substring(i, i+1));
		}	
		System.out.println("문자열 합 : " + exampleResult);
	}
	static void eachAdd(int num) {
		String text = num + "";
		int exampleResult = 0;
		for(int i = 0; i < text.length(); i++) {
			exampleResult += Integer.parseInt(text.substring(i, i+1));
		}		
		System.out.println("문자열 합 : " + exampleResult);
	}
	
 	static void gradeCard(String name, int korScore, int engScore, int mathScore) { // 파라미터 명을 변수명처럼 상세하게 
		
		double sum = (korScore+engScore+mathScore) / 3.0;
//		long roungAvg = Math.round(sum); // 반올림
		double roundAvg = weRound(sum, 2);
		String grade = "";
		  if(sum >= 90) {
			  grade = "A";
		  }else if(sum >= 80) {
			  grade = "B";
		  }else {
			  grade = "C";
		  }
		System.out.println("이름: "+ name + "\n" + "국어: " + korScore + "\n" + "영어: " + engScore 
				    + "\n" +  "수학: "+ mathScore + "\n"+ "평균: "+ roundAvg + "\n"+ "등급: " + grade);
	}
	
	/**
	 * 입력한 실수를 소수 n번째 자리로 리턴해주는 함수 
	 * @param num 반올림하고자 하는 실수
	 * @param n   소수 n번째 자리까지 리턴
	 * @return    반올림된 실수 리턴 
	 */
	static double weRound(double num, int n) {
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
			
	static int absolute(int num) {
		if(num < 0) {
			num *= -1;
		}
		return num;
	}
	
	static void print(String text) {
		System.out.println(text);
	}
	static void printInt(int intText) {
		
		System.out.println(intText);
	}
	/*
	 메소드 오버로딩(Overloading)
	 함수명은 유지한 채, 파라미터의 타입
	 또는 파라미터의 개수를 다르게 받아
	 처리할 수 있도록 하는 방법  
	 */
	static void print(int text) {  // 변수명 상관없음
		System.out.println(text);
	}

	static void printSum(int fromNum, int toNum) { // 리턴 값이 없다면 void를 써준다
		int sumNum = 0;  // main 안에 있는 변수는 여기서 사용불가능
		for(int i = fromNum; i <= toNum; i++) {
			sumNum += i;
		}
		System.out.println(fromNum + "부터 " + toNum + "까지 합 : " + sumNum);
	}
	
	static int returnSum(int fromNum, int toNum) { // 리턴 값이 int형이며 리턴이 없으면 오류
		int sumNum = 0;  // main 안에 있는 변수는 여기서 사용불가능
		for(int i = fromNum; i <= toNum; i++) {
			sumNum += i;
		}
		return sumNum;
	}
}
