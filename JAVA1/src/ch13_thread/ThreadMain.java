package ch13_thread;

public class ThreadMain {

	public static void main(String[] args) {
//		printNum(10);
//		printNum(100);
		// 기본적으로 스레드를 나눠주지 않으면
		// 메인 스레드 하나만 일을 해서
		// 위에서 부터 차례대로 코드가 실행된다
		
		System.out.println("===========================");
		
		// 1. Thread를 상속(extends)받은 클래스를 이용
		// 멀티 스레드를 구현하는 방법
		System.out.println("[메인스레드]카운트 시작");
		ExThread exThread = new ExThread(20, "달현");
		exThread.start();
		ExThread exThread2 = new ExThread(20, "현섭");
		exThread2.start();
		// 외부 스레드에 일을 시킬 때, 우선적으로 알아야 하는 것은
		// 각각의 외부 스레드가 언제 일이 끝날지 모른다.
		System.out.println("[메인스레드]카운트 끝");
		
		// 2. Runnable 인터페이스를 구현(implements)
		// 클래스를 이용 
		ExRunnable exRun = new ExRunnable(300, "나겸");
		Thread th = new Thread(exRun);
		th.start();
		
		// 람다식 사용
		Thread seolri = new Thread(() -> {
			int num=600;
			String name="설리";
			for (int i=num; i <= num+5; i++) {
			System.out.println(name+" "+i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}});
	}
	
	// 입력받는 숫자부터 +5까지 콘솔창에 출력
	static void printNum(int num) {
		for (int i=num; i <= num+5; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
