package ch14_jdbc_jsp.model;

public class StudentVO {
	private String stuId;
	private String stuname;
	private String stupassword;
	private int stuScore;
	
	public StudentVO() {
		
	}
	
	public StudentVO(String stuId, String stuname, String stupassword, int stuScore) {
		super();
		this.stuId = stuId;
		this.stuname = stuname;
		this.stupassword = stupassword;
		this.stuScore = stuScore;
	}

	@Override
	public String toString() {
		return "[아이디 : " + stuId + ", 이름 : " + stuname + ", 점수 : " + stuScore + "]";
	}

	public String getStuId() {
		return stuId;
	}

	public void setStuId(String stuId) {
		this.stuId = stuId;
	}

	public String getStuname() {
		return stuname;
	}

	public void setStuname(String stuname) {
		this.stuname = stuname;
	}

	public String getStupassword() {
		return stupassword;
	}

	public void setStupassword(String stupassword) {
		this.stupassword = stupassword;
	}

	public int getStuScore() {
		return stuScore;
	}

	public void setStuScore(int stuScore) {
		this.stuScore = stuScore;
	}
	
}
