package DongJun.submit05;
import java.util.Scanner;
public class Q03_문자열갯수세기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력해주세요. ");
		System.out.print(">>>");
		String inputText = sc.nextLine();
				
		String middleText = "";
		String finalText = "";
		int count = 1;
		for(int i = 0; i <= inputText.length() - 2 ; i++) {			
			if(inputText.charAt(i) == (inputText.charAt(i+1))) {
				middleText += inputText.substring(i, i+1); 
				count++;
			}
			if(inputText.charAt(i) != (inputText.charAt(i+1))){
				middleText += inputText.substring(i, i+1);				
				finalText += middleText.substring(0,1) + count;
				count = 1;
				middleText = "";
			}
			
		}// for문 
			if(inputText.charAt(inputText.length()-1) == (inputText.charAt(inputText.length()-2))) {
				finalText += middleText.substring(0,1) + count;
			}else {
				finalText += inputText.charAt(inputText.length()-1);
			}
		
		System.out.println(finalText);
		sc.close();
	}// main

}// class 
