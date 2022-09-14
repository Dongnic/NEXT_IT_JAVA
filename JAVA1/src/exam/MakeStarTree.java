package exam;

import java.util.Scanner;

public class MakeStarTree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("층 입력: ");
		int sf = sc.nextInt();
		// 층 수만큼 반복
		for(int i = 0 ; i < sf; i++) {
			// 층 수+i만큼 반복
			for(int j = 1; j <= sf+i; j++) {
				// 맨 마지막 층이라면 *만 출력
				if(i == sf-1) System.out.print("*");
				// 가운데(입력층 수)를 기준으로 +- i번째는 * 출력 
				else if(j == sf+i || j == sf-i) System.out.print("*");
				// 나머지는 빈 값 출력
				else System.out.print(" ");
			}
			// 층 아래로 이동
			System.out.println();
		}
		sc.close();
	}

}
