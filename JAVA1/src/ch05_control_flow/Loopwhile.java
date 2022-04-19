package ch05_control_flow;

import java.util.Scanner;

public class Loopwhile {

	public static void main(String[] args) {

		// while 문
		
		int i = 0;   // 초기화 식 
		while(i <= 10) {  // 조건식 
			System.out.println(i);
			i++;  // 증감식
			// 초기화 + 조건 + 증감 = for문 ?! 	
		}
		
		// while문을 이용해서 구구단 출력
		
	
		int factor = 1;
		int multiply = 0;
			System.out.println("===="+2+"단====");
			while(factor <= 9) {
				multiply = factor*2;
				System.out.println(2 + " x " + factor + " = " + multiply);
				factor++;
			}
		
		
		boolean isRun = true;
		Scanner sc = new Scanner(System.in);
		
		while(isRun) {
			System.out.println("이름입력 [종료하시려면 Q 또는 q 입력]");
			System.out.print(">>>");
			
			String inputText = sc.nextLine();
			if(inputText.equals("q") || inputText.equals("Q")) {
				System.out.println("프로그램을 종료합니다.");
				isRun = false;
			}else {
			System.out.println(inputText + "님 환영합니다!!");
			}
			
		}
		
		while(true) {
			System.out.println("성입력 [종료하시려면 Q 또는 q 입력]");
			System.out.print(">>>");

			String inputText = sc.nextLine();
			
			// inputText.toLowerCase() 대문자를 소문자로 변경(소문자도 소문자)
			if(inputText.equalsIgnoreCase("q")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.println(inputText + "님 환영합니다!!");
			
		}
		
		System.out.println("========================");
		
		// do-while문
		isRun = false;
		
		do { // 일단 do 실행 조건이 true면 계속 반복
			System.out.println("성입력 [종료하시려면 Q 또는 q 입력]");
			System.out.print(">>>");

			String inputText = sc.nextLine();
			
			// inputText.toLowerCase() 대문자를 소문자로 변경(소문자도 소문자)
			if(inputText.equalsIgnoreCase("q")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.println(inputText + "님 환영합니다!!");			
		}while(isRun);
		
		System.out.println("========================");
		
		//while문 또한 다중으로 사용 가능 
		// 5단 까지만 출력
		int gugu = 2;
		factor = 1;
		multiply = 0;
		stop: while(gugu <= 9) {
			System.out.println("====" + gugu + "단====");
			 while(factor <= 9) {
				if(gugu > 5) {
					break stop;
				}
				multiply = gugu * factor;
				System.out.println(gugu + " x " + factor + " = " + multiply);
				factor++;
			}
			factor = 1;
			gugu++;
		}
		
		// 포켓몬스터 
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
						break outer; // 해당 이름(outer)반복문 종료 
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

}
