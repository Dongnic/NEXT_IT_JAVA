package DongJun.submit11;

public class product implements Comparable{
	
	// Q01 - 1
	private String name;
	private int price;

	public product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	// 기본생성자
	public product() {
	// getter & setter	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "product [name=" + name + ", price=" + price + "]";
	}
	
	@Override
	public int compareTo(Object o) {
		int result = 1;
		if(this.price - ((product)o).getPrice() < 0) {
			result = -1;
		}
		return result;
	}
}
