package ch13_thread.issac;

public class Issac {
	private int toast = 0;
	
	// 싱글톤 적용
	private Issac() {
	}
	
	private static Issac instance = new Issac();
	
	public static Issac getInstance() {
		return instance;
	}
	
	// 토스트 만들기 (= Chef 클래스가 가져다 씀)
	public synchronized void makeToast() {
		toast += 1;
		System.out.println("토스트를 하나 만들었습니다." + " 재고 : " + toast);
		
		// wait Set에서 대기 중인 임의의 스레드를 하나 깨운다
//		notify();
		
		// 대기 중인 모든 스레드를 깨운다
		notifyAll();
		
	}
	
	// 토스트 구매 (= Customer 클래스가 가져다 씀)
	public synchronized void buyToast(String name, int count) {
		if(toast < count) {
			// TODO 대기
			try {
				// wait()를 실행한 스레드는 notify()전까지
				// 대기 상태에 놓인다.
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}else {
			toast -= count;
			System.out.println(name + "에게 토스트를 " + count + "개 팔았습니다. " + "재고 : " + toast);
			return;
		}
		
		// 재귀함수 
		buyToast(name, count);
		
	}
}
