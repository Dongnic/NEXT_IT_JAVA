package ch09_class.member;

import java.util.Scanner;

public class MemberMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		MemberDB memDB = new MemberDB();
		
		while(1>0) {
			System.out.println("무엇을 하시겠습니까?");
			System.out.println("1. 회원가입 | 2. 로그인 | 3. 회원목록 | 4. 종료");
			System.out.print(">>> ");
			int command = Integer.parseInt(sc.nextLine());
			
			// 책 입고
			if(command == 1) {
				// 회원가입 
				System.out.print("아이디 입력: ");
				String id = sc.nextLine();
				if(memDB.checking(id)) {
					System.out.println("사용 중인 아이디 입니다.");
				}else {
					System.out.print("비밀번호 입력: ");
					String pw = sc.nextLine();
					System.out.print("이름 입력: ");
					String nm = sc.nextLine();
					
					memDB.regist(id, pw, nm);
					System.out.println("회원가입 성공!");
				}
			}else if(command == 2) {
				// 로그인
				System.out.print("아이디 입력: ");
				String id = sc.nextLine();
				System.out.print("비밀번호 입력: ");
				String pw = sc.nextLine();
				
				if(memDB.checkLogin(id, pw)) {
					System.out.println("로그인 성공");
				}else {
					System.out.println("아이디 혹은 비밀번호가 틀립니다");
				}
			}else if(command == 3) {
				memDB.showMemList();
			}else if(command == 4) {
				// 종료
				System.out.println("프로그램을 종료합니다");
				break;
			}else {
				System.out.println("1, 2, 3만 선택가능합니다");
			}		
			
		}
		
	}

}
