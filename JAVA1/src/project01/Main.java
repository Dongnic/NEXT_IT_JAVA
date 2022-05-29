package project01;

import java.util.Scanner;

import project01.model.MemberVO;
import project01.service.CharacterService;
import project01.service.MemberService;

public class Main {

	public static void main(String[] args) {
		MemberService memService = MemberService.getInstance();
		CharacterService chaService = CharacterService.getInstance();
		IntroGame introGame = new IntroGame();
		Scanner sc = new Scanner(System.in);
		// 로그인, 가입
		while(true) {
			System.out.println("행동을 선택해");
			System.out.println("1. 회원가입 | 2. 로그인 | 3. 종료");
			System.out.print(">>>");
			int cmd = 0;
			try {
				cmd = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력해주세요.");
				continue;
			}
			if(cmd == 1) {
				// 회원가입
				System.out.println("사용하실 아이디를 입력해주세요");
				System.out.print(">>>");
				String id = sc.nextLine();
				System.out.println("사용하실 비밀번호를 입력해주세요");
				System.out.print(">>>");
				String pw = sc.nextLine();
				
				MemberVO temp = new MemberVO(id, pw);
				
				memService.insertMem(temp);
			}else if(cmd == 2) {
				// 로그인
				System.out.println("아이디를 입력해주세요");
				System.out.print(">>>");
				String id = sc.nextLine();
				System.out.println("비밀번호를 입력해주세요");
				System.out.print(">>>");
				String pw = sc.nextLine();
				
				MemberVO login = memService.loginMem(id);
				if(pw.equals(login.getMemPw())) {
					System.out.println(login.getMemId() + "님 환영합니다.");
				}
				// 게임인트로
				while(introGame.Intro()) {}
				
			}else if(cmd == 3) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
			
		}
	}

}
