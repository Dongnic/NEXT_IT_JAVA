package ch10_extends_interface.simple.board;

public class TradeBoard extends Board {
	private int price;
	private String image;
	
	public TradeBoard() {
		super();
	}
	public TradeBoard(String category, String author, String title, String content, String reple, int number, int price, String image) {
		super(category, author, title, content, reple, number);
		this.price = price;
		this.image = image;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return super.toString() + ", price=" + price + ", image=" + image + "]";
	}
	
}
