package DongJun.submit15.model;

public class MemberVO {
	private String MemId;
	private String MemPw;
	
	public MemberVO() {
		
	}
	
	public MemberVO(String MemId, String MemPw) {
		super();
		this.MemId = MemId;
		this.MemPw = MemPw;
	}

	@Override
	public String toString() {
		return "MemberVO [MemId=" + MemId + ", MemPw=" + MemPw + "]";
	}

	public String getMemId() {
		return MemId;
	}

	public void setMemId(String memId) {
		MemId = memId;
	}

	public String getMemPw() {
		return MemPw;
	}

	public void setMemPw(String memPw) {
		MemPw = memPw;
	}
	
	
}
