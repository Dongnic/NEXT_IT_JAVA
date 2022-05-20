package ch13_thread;

public class ExThread extends Thread {
	int num;
	public ExThread(int num,String name) {
		// 스레드 이름 세팅
		super(name);
		this.num = num;
	}
	@Override
	public void run() {
//		ThreadMain.printNum(20);
		for (int i=num; i <= num+5; i++) {
			System.out.println(super.getName()+" "+i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

