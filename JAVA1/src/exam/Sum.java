package exam;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력: ");
		int n = sc.nextInt();
		int cnt = 0;
		int result = 0;
		while(cnt < n) {
			cnt++;
			result += cnt;
		}
		System.out.println("1부터 "+n+"까지의 합 : "+result);
		sc.close();
	}

}
