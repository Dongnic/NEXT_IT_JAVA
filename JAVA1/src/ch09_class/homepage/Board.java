package ch09_class.homepage;

public class Board {
	
	private int no;         // 글 번호
	private String title;   // 글 제목
	private String content; // 글 내용
	private String autor;   // 글 작성자
	
	public int getNo() {
		return no;
	}
	
	public Board() {
		
	}
	
	public Board(int no, String title, String content, String autor) {
		this.no = no;
		this.title = title;
		this.content = content;
		this.autor = autor;
	}
	
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	@Override
	public String toString() {
		return "Board [no=" + no + ", title=" + title + ", content=" + content + ", autor=" + autor + "]";
	}
}
