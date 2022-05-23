package ch13_thread.issac;

public class Chef extends Thread{
	
	private Issac issac = Issac.getInstance();
	private int count;
	
	public EndCook endCook;
	
	public Chef(int count) {
		this.count = count;
	}
	
	@Override
	public void run() {
		// Issac 클래스의 makeToast
		for(int i = 0; i < count; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			issac.makeToast();
		}
		
		endCook.endOfCook();
	}
	
}
