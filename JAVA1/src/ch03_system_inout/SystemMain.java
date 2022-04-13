package ch03_system_inout;

import java.util.Scanner;

public class SystemMain {

	public static void main(String[] args) {
		// 자동 줄 맞추기 
		// 단축키 [Ctrl + Shift + F] 단, 현재 클래스에 에러가 없어야 동작
		
		// 콘솔에 텍스트 출력하기
		// println() 콘솔창에 출력 후 줄바꿈을 넣어준다.
		System.out.println("이미 알고 있는데요");
		System.out.println(); // 개행문자만 들어간다
		System.out.println("네");
		
		//print() 괄호 안 텍스트 출력(공백 시 에러) 하지만 개행문자는 빠짐
		System.out.print("불편한데..");
		System.out.print("불편한데..");
		System.out.println("======================");
		
		
		// 제어문자
		// 문자열 내에 역슬래시(\)를 이용하여 
		// 특정 기능을 사용할 수 있다.
		
		// \t 탭
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("1\t2\t3\t4\t5\t6\t7");
		
		// \n 줄바꿈 
		System.out.println("나도 println이 되고 싶어\n");
		
		// 기능을 가지는 문자 (\, ", ;)
		// 콘솔창에 출력하고 싶다면 \를 붙인다.
		System.out.println("제어문자는 앞에 \\를 붙인다.");
		System.out.println("소크라테스: \"너 자신을 알라\"");
		
		// 특수문자도 출력 가능하다.
		System.out.println("$");
		System.out.println("======================");
		
		// printf()는 포맷 문자열(format string)과 함께 사용
		System.out.printf("%d명이 수업을 듣고 있습니다.\n", 43);
		System.out.printf("%d명이 %s을 듣고 있습니다.\n", 43, "수업");
		
		//예시 03 = 세자리로 표기 , .03은 소수점 3자리  
		System.out.printf("%03d장 표준입출력\n", 3); // 003
		System.out.printf("%.03f\n", 3.141592); // 3.142
		System.out.printf("%.03f\n", 3.14); // 3.140
		System.out.println("======================");
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력해주세요");
		System.out.print(">>> ");
		String inputText = sc.nextLine();
		System.out.println(inputText + "님 환영합니다.");
		
		System.out.println("에어컨 희망 온도를 입력");
		System.out.printf(">>> ");
		// scanner.nextInt()는 사용하지 마세요.
		// 이클립스 <==> 사용자 통로에서 \n를 남겨둬서 다음 구문에서 오류
//		int temperature = sc.nextInt();
//		String temperature = sc.nextLine();
		int temp = Integer.parseInt(sc.nextLine());
		System.out.println("희망온도: " + (temp + 1));
		
		System.out.println("냉방/난방 입력해주세요");
		System.out.printf(">>> ");
		String airconMode = sc.nextLine();
		System.out.println("모드: " + airconMode);
		// 스캐너 통로 닫음. (안 닫아도 큰 문제는 없음.)
		sc.close();
	}

}
