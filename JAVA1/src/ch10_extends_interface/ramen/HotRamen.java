package ch10_extends_interface.ramen;

public class HotRamen extends Ramen{
	
	public HotRamen(String name, String image, int price) {
		super(name, image, price);
	}
	@Override
	public void printRecipe() {
		System.out.println("끓는 물에 면을 넣고 스프를 넣고 끓여드세요");
	}

}
