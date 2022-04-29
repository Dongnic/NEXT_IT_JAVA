package ch09_class.typing;

import java.util.Scanner;

public class TypingMain {

	public static void main(String[] args) {

		// 타자연습
		Dictionary dictionary = new Dictionary();
//		System.out.println(dictionary.wordList);
		
		Scanner sc = new Scanner(System.in);
		
		// 1970년 1월 1일 기준으로 
		// 현재까지의 경과된 시간을
		// 밀리초 단위로 리턴 (1sec = 1000millisec)
		long pastTime = System.currentTimeMillis();
		while(1 > 0) {
			dictionary.showWord();
			
			System.out.print(">>>");
			String inputText = sc.nextLine();
			
			if(dictionary.typingCheck(inputText)) {
				System.out.println("정답");
				dictionary.removeWord();
			}else {
				System.out.println("오답");
			}
			
			if(dictionary.returnSize() == 15) {
				break;
			}
		}
		long currentTime = System.currentTimeMillis();
		
//		long diffTime = currentTime - pastTime;
//		double result = diffTime / 1000.0;
//		System.out.println(result+"초");
		System.out.println((currentTime - pastTime)/1000.0+"초");
	}

}
