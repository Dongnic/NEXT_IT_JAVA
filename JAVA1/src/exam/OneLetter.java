package exam;

import java.util.Scanner;

public class OneLetter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 입력: ");
		String text = sc.nextLine();
		for(int i=0; i<text.length();i++) System.out.println(text.charAt(i));			
	}
}
