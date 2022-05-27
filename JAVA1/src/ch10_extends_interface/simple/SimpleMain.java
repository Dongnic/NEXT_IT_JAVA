package ch10_extends_interface.simple;

public class SimpleMain {

	public static void main(String[] args) {
		
		Child child = new Child("유동준", 30);
		
		System.out.println(child.getName()); // 유동준
		System.out.println(child.getAge());  // 30
		
		child.sayHello(); // 저는 아들 유동준
		
		// 형변환 기능
		Parent parent = new Child("동준 2세", 4);
		parent.sayHello(); // 저는 아들 동준 2세 
		
	}
}
