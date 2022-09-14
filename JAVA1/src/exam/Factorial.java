package exam;

import java.util.Scanner;

public class Factorial {
	
	public static int factorial(int n) {
		if(n==1) return 1;
		return n * factorial(n-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int n = sc.nextInt();
		System.out.println(factorial(n));
		sc.close();
	}

}
