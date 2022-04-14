package DongJun.submit02;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력해주세요: ");
		String username = sc.nextLine();
		
		System.out.print("국어 점수를 입력해주세요: ");
		int scorekorean = Integer.parseInt(sc.nextLine());
		System.out.print("영어 점수를 입력해주세요: ");
		int scoreenglish = Integer.parseInt(sc.nextLine());
		System.out.print("수학 점수를 입력해주세요: ");
		int scoremath = Integer.parseInt(sc.nextLine());
		double scoreavr = (double)(scorekorean + scoreenglish + scoremath) / 3;		
		System.out.println("===============================");
		System.out.println("이름: " + username);
		System.out.println("국어: " + scorekorean);
		System.out.println("영어: " + scoreenglish);
		System.out.println("수학: " + scoremath);
		System.out.println("평균: " + scoreavr);
		System.out.println("===============================");
		
		sc.close();
		

	}

}
