package ch09_class.member;

import java.util.ArrayList;

public class MemberDB {
	// private는 캡슐화 / 외부에서 접근하지 못하게함 
	private ArrayList<Member> memList; // 멤버의 정보를 담는 배열

	MemberDB() {
		memList = new ArrayList<Member>();
//		Member temp = new Member("a001", "1234a", "석승원");
//		memList.add(temp);
		memList.add(new Member("a001", "1234a", "석승원"));
		memList.add(new Member("b001", "1234b", "김성빈"));
		memList.add(new Member("c001", "1234c", "염현섭"));
		memList.add(new Member("d001", "1234d", "김달현"));
		
	}
	
	public void regist(String id, String pw, String nm) {
		memList.add(new Member(id, pw, nm));
	}
	// 중복 체크
	// 중복된다면 true 리턴
	public boolean checking(String id) {
		for(int i = 0; i < memList.size(); i++) {
			if(memList.get(i).id.equals(id)) {
				return true;
			}
		}
		return false;
		
	}
	
	// 로그인 체크 
	public boolean checkLogin(String id, String pw) {
		for(int i = 0; i < memList.size(); i++) {
			if(memList.get(i).id.equals(id)) {
				if(memList.get(i).pw.equals(pw)) {
					return true;
				}
			} 
		}
		return false;
		
	}
	
	// 회원 목록 조회
	public void showMemList() {
		for(int i = 0; i < memList.size(); i++) {
			System.out.println(memList.get(i));
		}
	}
}
