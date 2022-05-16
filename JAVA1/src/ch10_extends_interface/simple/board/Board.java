package ch10_extends_interface.simple.board;

public class Board {

		private String category;
		private String author;
		private String title;
		private String content;
		private String reple;
		private int number;
		
		public Board() {
			
		}
		
		public Board(String category, String author, String title, String content, String reple, int number) {
			super();
			this.category = category;
			this.author = author;
			this.title = title;
			this.content = content;
			this.reple = reple;
			this.number = number;
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
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
		public String getReple() {
			return reple;
		}
		public void setReple(String reple) {
			this.reple = reple;
		}
		public int getNumber() {
			return number;
		}
		public void setNumber(int number) {
			this.number = number;
		}
		@Override
		public String toString() {
			return "Board [category=" + category + ", author=" + author + ", title=" + title + ", content=" + content
					+ ", reple=" + reple + ", number=" + number + "]";
		}
		
		
}
