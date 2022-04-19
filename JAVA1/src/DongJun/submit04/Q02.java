package DongJun.submit04;
import java.util.Scanner;
public class Q02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력해주세요. ");
		System.out.print(">>>");
		String reverse = sc.nextLine();
		
//		String reverse = "로꾸꺼 로꾸꺼"; // 7

		for(int i = reverse.length()-1; i >= 0; i--) {
			System.out.print(reverse.substring(reverse.length(), reverse.length()-1));

		} // i = 6부터 for문 7번 실행 
		  // i는 6부터 0까지 charAt한 것을 출력 
	
	
	
	}

}
