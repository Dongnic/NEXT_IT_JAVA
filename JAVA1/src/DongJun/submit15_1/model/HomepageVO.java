package DongJun.submit15_1.model;

public class HomepageVO {
	private int mem_no;
	private String mem_title;
	private String mem_content;
	private String mem_author;
	private String mem_date;
	
	public HomepageVO() {
		
	}

	public HomepageVO(String title, String content, String author, String date) {
		this.mem_title = title;
		this.mem_content = content;
		this.mem_author = author;
		this.mem_date = date;
	}

	@Override
	public String toString() {
		return "[" + mem_no + ". | " + mem_title + " | " + mem_author + " | " + mem_date + "]";
	}

	public int getMem_no() {
		return mem_no;
	}

	public void setMem_no(int mem_no) {
		this.mem_no = mem_no;
	}

	public String getMem_title() {
		return mem_title;
	}

	public void setMem_title(String mem_title) {
		this.mem_title = mem_title;
	}

	public String getMem_content() {
		return mem_content;
	}

	public void setMem_content(String mem_content) {
		this.mem_content = mem_content;
	}

	public String getMem_author() {
		return mem_author;
	}

	public void setMem_author(String mem_author) {
		this.mem_author = mem_author;
	}

	public String getMem_date() {
		return mem_date;
	}

	public void setMem_date(String mem_date) {
		this.mem_date = mem_date;
	}


}
