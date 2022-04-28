package DongJun.submit10;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Q02_Login_Another_Way {

	public static void main(String[] args) {
		HashMap<String, String> infoMap = new HashMap<>();
		Set<String> keySet = infoMap.keySet();
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
		
		int count = 0;
		for(String i_d : keySet) { 
		String p_w = infoMap.get(i_d);
		count++;
				if(i_d.equals(id)) {
					if(p_w.equals(pw)) {
						System.out.println("로그인 성공!");
						break;
					}else {
						System.out.println("비밀번호가 틀립니다.");
						break;
					}
				}
				if(count == infoMap.size()) {
					System.out.println("존재하지 않는 아이디입니다.");
				}
		}
		sc.close();
	}// main

}
