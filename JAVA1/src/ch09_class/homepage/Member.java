package ch09_class.homepage;

public class Member {
	private String id;
	private String pw;
	
	public Member() {
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	@Override
	public String toString() {
		return "[회원 아이디 : " + id + "]";
	}
	public Member(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
}
