package DongJun.submit14.Q01;

public class Board {
	private int no;
	private String name;
	private String date;
	private String content;
	
	public Board() {
		
	}
	
	public Board(int no, String name, String date, String content) {
		super();
		this.no = no;
		this.name = name;
		this.date = date;
		this.content = content;
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

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "["+ no + ". | " + name + " | " + date + "]";
	}
	
}
