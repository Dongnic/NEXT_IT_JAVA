package ch05_control_flow;

import java.util.Scanner;

public class Loopfor {

	public static void main(String[] args) {
		// 반복문
		// for문
		
		// 콘솔창에 1부터 10까지 출력
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		for(int i = 1; i < 9; i+=2) {
			System.out.println(i);
		
		}
		
		System.out.println("===================================");
		
		// 1부터 20까지 더하기
		int result = 0;
		for(int i = 1; i <= 20; i++) {
			result += i;
		}
		System.out.println(result);
		
		// 21부터 45까지 더하기
		int addresult = 0;
		for(int i = 21; i <= 45; i++) {
			addresult += i;
		}
		System.out.println(addresult);
		
		System.out.println("===================================");
		
		for(double i = 0; i < 2; i += 0.2) {
			System.out.println(i);
			// 실수인 float과 double의 연산은
			// 정확하지 않으므로 비추천
		}
		
		for(int i = 0; i <= 20; i +=2 ) {
			System.out.println(i/10.0);
		} 
		
		System.out.println("===================================");
		
		// 구구단 2단
		// 2 x 1 =  2
		// 2 x 9 = 18
		int gugu = 2 ;
		int resu = 0;
		
		for(; gugu < 10; gugu++) {
			System.out.println("----"+ (gugu) +"단----");
			for(int i = 1; i <= 9; i ++ ) {
				resu = i * gugu;
				System.out.println(gugu + " x " + i + " = " + resu);
				} // for2 끝 	
		} // for1 끝

		/*
		 * 디버깅 모드
		 * 코드라인 좌측 부분을 더블클릭하여 
		 * breakpoint(초록점)를 만든 후 실행
		 * 단축키 : Ctrl + shift + B
		 * 토글형식이라 더블클릭 혹은 단축키로
		 * 생성/삭제 가능
		 *  
		 * 디버깅 목적
		 * 코드를 한줄씩 실행해보며 변수에
		 * 어떤 값이 담기고 있는지 확인할 때 사용
		 * 
		 * 디버깅 실행
		 * 상단 벌레모양 아이콘 클릭 
		 * 디버깅 모드에 적합한 화면(Perspective) 전환 여부
		 * 코드들이 위에서 부터 실행되다가 breakpoint가
		 * 있는 지점에 멈춰서 대기를 한다.
		 * 
		 * 이후 상단의 Run - step over [단축키 F6]을
		 * 실행하면 한줄한줄 실행이 된다.
		 * 
		 * 디버깅 모드를 종료하려면 Terminate
		 * 단축키 [Ctrl + F2]
		 * 
		 * 이후 원래 화면(Perspective)로 돌아오려면
		 * 우측 상단에서 Java Perspective를 클릭
		 * 
		 *  */
		System.out.println("===================================");
		// 1부터 10까지 홀수만 출력
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 1)
			System.out.println(i);
		} // 10번 실행
		
		for(int i = 1; i <= 10; i += 2) {
			System.out.println(i);
		} // 5번 실행
		System.out.println("===================================");
		
		// *트리를 만들어 보세요
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
		System.out.println("*****");
		for(int i = 1; i <= 5; i++) {
			for(; i < i; i++) {
				System.out.print("*");
			}
		}
		System.out.println("===================================");

		// % 나머지 연산 주로 사용 예시
		// for문 내에서 순환하는 숫자에 대해 사용
		
		// 국수공장에서 면을 20cm 뽑고 있는데,
		// 5cm마다 다 잘라주기
		
		for(int i = 0; i < 20; i++) {
			System.out.println("|||||||");
			
			// i가 4일 때 면이 5cm이므로 잘라야함
			if(i!= 0 && i % 4 == 0) {
				System.out.println("-------");
			}
		}
		
		System.out.println("==========안성탕면============");
		
		// 라면 공장에서 면을 30cm 뽑고 있는데 
		// 6cm마다 잘라주어야 한다.
		for(int i = 1; i <= 5; i++) {
			if(i % 2 ==1) {
				System.out.println("////////");
			}else {
				System.out.println("\\\\\\\\\\\\\\\\");
			}
			
			if(i % 6 == 0) {
				System.out.println("---------면 뽑는중..");
			}
		}	
//			try {
//				Thread.sleep(500);
//				// 현재 코드를 실행중인 스레드를
//				// 괄호 안 시간 만큼 잠시 멈춤
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		System.out.println("===================================");
		
		 //지금으로부터 100시간 후 몇 일 몇 시가 될까?
		int currentDay = 18;
		int currentHour = 9;
		
		for(int j = 0; j < 10; j++) {
			int day = currentDay + (currentHour/24);
			int hour = currentHour % 24;
			System.out.println(day + "일 " + hour + "시");
			currentHour++;
		}
		
		System.out.println("===================================");
		
		
		//거꾸로 for문
		//10부터 1까지 출력		
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		
		// 9단부터 2단 거꾸로 출력 
		int gugudan = 9 ;
		int guResult = 0;
		
		for(; gugudan > 1; gugudan--) {
			System.out.println("----"+ (gugudan) +"단----");
			for(int i = 9; i >= 1; i-- ) {
				guResult = i * gugudan;
				System.out.println(gugudan + " x " + i + " = " + guResult);
				} // for2 끝 	
		} // for1 끝
		
		System.out.println("===================================");
		
		// for문으로 String 문자열을 가지고 놀기
		// for문을 이용해서 숫자 문자열의
		// 각 자리수를 더해서 결과를 출력
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자를 입력해주세요: ");
//		String example = sc.nextLine();
		String example ="1234";
		int exampleResult = 0;
		for(int i = 0; i < example.length(); i++) {
		exampleResult += Integer.parseInt(example.substring(i, i+1));
		}
		
		System.out.println("문자열 합 : " + exampleResult);
//		sc.close();
		
//		System.out.println("===================================");
//		String s = "슈";
//		System.out.println("슈"==s);
		// 슈의 갯수
		String syusyu = "슈슈슈슛슈슛ㅅ슛ㅅㅅ슛슈슛ㅅ슈슈슈슛";
//		Scanner sca = new Scanner(System.in);
//		System.out.print("문자를 입력해주세요: ");
//		String syusyu = sca.nextLine();		

		int syuCount = 0;
		for(int i = 0; i < syusyu.length(); i++) {
			String syustr = syusyu.substring(i, i+1);
			if(syustr.equals("슈")) {
				syuCount++;
			}
			 
		} System.out.println("슈가 들어간 문자열 : " + syuCount);
//		sca.close();
		
		// break 문
		// i가 1부터 10까지 증가하는 for문에서
		// i가 5보다 커지게 되면 for문을 종료
		
		for(int i = 1; i <= 10; i++) {
			if(i >= 5) {
				break;
				// 컴퓨터가 break 명령어를 실행하면
				// 가까운 반복문(if, for 등) 하나를 즉시 종료한다.
			}
			System.out.println(i);
		}
		int sum = 0;
		// 1부터 n까지 더한다고 했을때
		// 100이상이 되는 n을 구하시오
		for(int i = 1; i < 99999; i++) {
			sum += i;
			if(sum >= 100) {
				System.out.println("100이상이 되는 n은 "+ i);
				break;
			}
		}
	
		System.out.println("======================");
		
		// continue문
		// 구구단 7단을 출력하는데 너무 쉬운 7 x 1, 2, 3, 4는 미출력
		
		for(int i = 1; i <= 9; i++) {
			if(i < 5) {
				// 실행 시 continue 아래 코드는 무시하고 다시 반복문을 실행
				continue;
			}
			System.out.println("7 x " + i +" = " + 7 * i);
		}
		
		System.out.println("======================");
		// 이중 for 문
		// 구구단 출력
		// 2단부터 9단까지
		
		for(int j = 2; j <= 9 ; j++) {
			System.out.println("----"+ j +"단----");
			for(int i = 1; i <= 9; i ++ ) {
				System.out.println(j + " x " + i + " = " + j*i);
			}
		}
		
		System.out.println("======================");
		
		// 트리
		//     *
		//    **
		//   ***
		//  ****
		// *****
		
		String blank = "";
		String starTree = "";
		for(int i = 1; i <= 5; i++) {
			starTree += "*";
//			System.out.println(blank.substring(i) + starTree);
		}
		
		// 이중 for문으로 트리 만들기
		starTree = "";
		blank = "";
		for(int i = 1; i <= 5; i++) {
			starTree += "*";
			blank = "";
			for(int j = 5; j >= i; j--) {
				blank += " ";
			}System.out.println(blank + starTree);
		}
//		
		
		
	}  

}
