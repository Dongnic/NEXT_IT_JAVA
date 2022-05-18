package DongJun.submit14.Q01;

public class CartoonBoard extends Board{
	private String image;

	public CartoonBoard(int no, String name, String date, String content, String image) {
		super(no, name, date, content);
		this.image = image;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return super.toString() + "image " + image;
	}
	
}
