package ch10_extends_interface.ramen;

public class BuldakRamen extends Ramen{
	
	public BuldakRamen() {
		super("불닭볶음면", "불닭.jpg", 1000);
	}

	public void printRecipe() {
		System.out.println("끓는 물에 면을 삶고 소스에 비벼 드세요");
	}
}
