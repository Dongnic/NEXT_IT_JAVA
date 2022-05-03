package DongJun.submit12;

public class Book {
	private int no;
	private String name;
	boolean check = false;
	
	public Book() {
		
	}
	
	public Book(int no, String name, boolean check) {
		super();
		this.no = no;
		this.name = name;
		this.check = check;
	}

	@Override
	public String toString() {		
		if(check) {
			return "[책번호 : " + no + " 책 제목 : '" + name + "' 대여상태 : [대여] 중]";
		}else
			return "[책번호 : " + no + " 책 제목 : '" + name + "' 대여상태 : [입고] 중]";
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isCheck() {
		return check;
	}

	public void setCheck(boolean check) {
		this.check = check;
	}
	
	
	
}
