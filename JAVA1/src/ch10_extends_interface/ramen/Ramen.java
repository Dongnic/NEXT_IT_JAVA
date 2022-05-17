package ch10_extends_interface.ramen;

// 추상 메소드를 하나 이상 가지고 있는 클래스는 
// 무조건 추상클래스로 선언해야 한다.
public abstract class Ramen {
	String name;
	String image;
	int price;
	
	public Ramen(String name, String image, int price) {
		this.name = name;
		this.image = image;
		this.price = price;
	}
	// 추상메소드 abstract
	// 라면의 레시피를 출력해주는 함수
	public abstract void printRecipe();
}
