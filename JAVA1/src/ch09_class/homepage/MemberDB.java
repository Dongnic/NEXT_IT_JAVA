package ch09_class.homepage;

import java.util.ArrayList;

public class MemberDB {
	private ArrayList<Member> memberList = new ArrayList<>();
	
	// 싱글톤 패턴적용
	// 객체를 딱 한번만 소환
	// 1. 기본 생성자를 private 
	private MemberDB() {
		
	}
	
	// 2. 필드에 MemberDB를 이용
	// 새로운 객체를 만든다
//	MemberDB instance = new MemberDB();
	// static을 해주면 다른 클래스에서 접근가능 
//	static MemberDB instance = new MemberDB();
	// 타 클래스에서 수정하지 못하도록 private 해줌 
	private static MemberDB instance = new MemberDB();
	
	// 객체로 만든 instance를 리턴해주는 함수 만들기
	public static MemberDB getInstance() {
		return instance;
	}
	
	
	// 회원가입
	public void regist(String id, String pw) {
		// id 중복체크 
		for(int i = 0; i < memberList.size(); i++) {
			if(memberList.get(i).getId().equals(id)) {
				System.out.println("이미 사용 중인 아이디입니다.");
				return;
			}
		}

		memberList.add(new Member(id, pw));
		System.out.println("회원가입 성공");
	}
	
	// 회원 목록 조회
	public void printMember() {
		for(int i = 0; i < memberList.size(); i++) {
			System.out.println(memberList.get(i));
		}
	}
	
	// 로그인
	public Member getMember(String id) {
		for(int i = 0; i < memberList.size(); i++){
			if(memberList.get(i).getId().equals(id)) {
				return memberList.get(i);
			}
		}
		// 입력받은 id가 존재하지 않으면 새로운 Member개체를 생성(빈 값)해서 리턴
		// = null 리턴과 같음
		// id = null pw = null 
		return new Member();
	}
	
	
}
