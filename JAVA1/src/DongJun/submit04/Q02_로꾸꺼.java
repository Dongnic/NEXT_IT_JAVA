package DongJun.submit04;
import java.util.Scanner;
public class Q02_로꾸꺼 {

	public static void main(String[] args) {
		
		System.out.println(9/2);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력해주세요. ");
		System.out.print(">>>");
		String reverse = sc.nextLine();
		
//		String reverse = "로꾸꺼 로꾸꺼"; // 7

		for(int i = reverse.length()-1; i >= 0; i--) {
			System.out.print(reverse.substring(i, i+1));   // substring 이용
//			System.out.print(reverse.charAt(i));           // charAt 이용

		} // i = 6부터 for문 7번 실행 
		  // i는 6부터 0까지 charAt한 것을 출력 
	
		sc.close();
	}

}
