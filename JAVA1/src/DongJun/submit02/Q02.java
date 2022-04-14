package DongJun.submit02;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
//			Scanner sc = new Scanner(System.in);
//			System.out.print("주민번호 뒷자리를 입력해주세요: ");
//			String idBack = sc.nextLine();
			String idBack = "1231476";
			System.out.println(Integer.parseInt(idBack.substring(0, 1)) % 2 == 0 ? "여" : "남"); 
			
			
			
			
	}

}
