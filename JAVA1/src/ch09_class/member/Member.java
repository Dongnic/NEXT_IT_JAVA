package ch09_class.member;

public class Member {
	
	String id; // 사용자 아이디
	String pw; // 사용자 비밀번호
	String nm; // 사용자 이름 
	
	Member(){
		
	}

	public Member(String id, String pw, String nm) {
		this.id = id;
		this.pw = pw;
		this.nm = nm;
	}

	@Override
	public String toString() {
		return "[아이디 : " + id + ", 이름 : " + nm + "]";
	}
	
	
}
