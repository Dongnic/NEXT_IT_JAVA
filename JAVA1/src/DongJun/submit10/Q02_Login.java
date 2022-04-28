package DongJun.submit10;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Q02_Login {

	public static void main(String[] args) {
		HashMap<String, String> infoMap = new HashMap<>();
		infoMap.put("a001", "1234a");
		infoMap.put("b001", "1234b");
		infoMap.put("c001", "1234c");
		infoMap.put("d001", "1234d");
		infoMap.put("e001", "1234e");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력해주세요");
		System.out.print(">>>");
		String id = sc.nextLine();

		System.out.println("비밀번호를 입력해주세요");
		System.out.print(">>>");
		String pw = sc.nextLine();
		
		if(infoMap.containsKey(id)) {
			if(infoMap.containsValue(pw)) {
				System.out.println("로그인 성공!");
			}else {
				System.out.println("비밀번호가 틀렸습니다.");
			}				
		}else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
		sc.close();
	}

}
