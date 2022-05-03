package ch09_class.homepage;

import java.util.Scanner;

public class HomePageMain {

	public static void main(String[] args) {
		
		// MemberDB 기본 생성자가 private이기 때문에 접근 불가
//		MemberDB memberDB = new MemberDB();
		
		MemberDB memberDB = MemberDB.getInstance();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("무엇을 하시겠습니까?");
			System.out.println("1. 회원가입 | 2. 회원목록조회"
					               + " | 3. 로그인 | 4. 종료");
			System.out.print(">>>");
			
			int command = Integer.parseInt(sc.nextLine());
			
			if(command == 1) {
				// 회원가입
				System.out.println("사용할 아이디를 입력하세요");
				System.out.print(">>>");
				String id = sc.nextLine();
				System.out.println("사용할 비밀번호를 입력하세요");
				System.out.print(">>>");
				String pw = sc.nextLine();
				
				// memberDB의 memberList에 해당 id와 pw를 갖는
				// member추가하기
				memberDB.regist(id, pw);
				
			}else if(command == 2) {
				// 회원목록 조회		
				memberDB.printMember();			
				
			}else if(command == 3) {
				// TODO 로그인
				System.out.println("아이디를 입력하세요");
				System.out.print(">>>");
				String id = sc.nextLine();
				System.out.println("비밀번호를 입력하세요");
				System.out.print(">>>");
				String pw = sc.nextLine();
				
				// id가 존재하면 해당 member 리턴
				// 존재하지 않으면 텅빈 member 리턴
				Member member = memberDB.getMember(id);
				// 아래의 조건문에서 getPw()값이 null값이라면 null.equals()가 되기때문에
				// 오류가 나게됨
				// 이에 따라 if(getPw() != null) 방식으로 null체크를 하거나
				// 조건문을 다음과 같이 변경해줄 필요가 있음
//				if(member.getPw().equals(pw)) {
				if(pw.equals(member.getPw())) {
					System.out.println("로그인 성공 ! ");
				}else {
					System.out.println("아이디 혹은 비밀번호가 틀립니다");
				}
			}else if(command == 4) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
			
			
		}
		BoardDB boardDB = BoardDB.getInstance();
		
	} // main

}
