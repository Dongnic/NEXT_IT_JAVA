package ch10_extends_interface.simple;

public class Child extends Parent{
	
	public Child(String name, int age){
		super(name, age);
	}
	
	@Override
	public void sayHello() {
		System.out.println("저는 아들 " + super.getName());
										// super는 생략가능 ex getName() 
	}
}
