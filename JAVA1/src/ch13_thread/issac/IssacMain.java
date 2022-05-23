package ch13_thread.issac;

public class IssacMain {

	public static void main(String[] args) {
		Customer nagyeom1 = new Customer("나겸1", 2);
		Customer nagyeom2 = new Customer("나겸2", 2);
		Customer nagyeom3 = new Customer("나겸3", 4);
		
		Chef chanung = new Chef(8);
		
		
		chanung.endCook = new EndCook() {
			@Override
			public void endOfCook() {
				System.out.println("토스트 8개 굽기 완료");
			}
		};

		chanung.start();
		nagyeom1.start();
		nagyeom2.start();
		nagyeom3.start();
		
	}

}
