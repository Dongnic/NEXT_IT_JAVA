package ch13_thread.issac;

public class Customer extends Thread{
	
	private Issac issac = Issac.getInstance();
	private String name;
	private int count;
	
	public Customer(String name, int count) {
		this.name = name;
		this.count = count;
	}
	
	@Override
	public void run() {
		//Issac 클래스의 buyToast
		issac.buyToast(name, count);
	}
	
}
