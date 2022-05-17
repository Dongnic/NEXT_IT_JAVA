package ch10_extends_interface.ramen;

public class RamenMain {

	public static void main(String[] args) {
		HotRamen hot = new HotRamen("열라면", "열라면.jpg", 1500);
		hot.printRecipe();
		
		BuldakRamen bul = new BuldakRamen();
		bul.printRecipe();
		
	}

}
