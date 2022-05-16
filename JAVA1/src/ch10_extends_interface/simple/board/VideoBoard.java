package ch10_extends_interface.simple.board;

public class VideoBoard extends Board{
	
	private String link;
	
	public VideoBoard() {
		super();
	}

	public VideoBoard(String category, String author, String title, String content, String reple, int number, String link) {
		super(category, author, title, content, reple, number);
		this.link = link;
	}

	@Override
	public String toString() {
		return super.toString() + ", link=" + link + "]";
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}
	
}
