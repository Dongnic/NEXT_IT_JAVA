package ch10_extends_interface.simple;

public class SimpleMain {

	public static void main(String[] args) {
		
		Child dj = new Child("유동준", 30);
		
		System.out.println(dj.getName());
		System.out.println(dj.getAge());
		
		dj.sayHello();
		
		// 형변환 기능
		Parent baby = new Child("2세", 4);
		baby.sayHello();
		
	}
}
