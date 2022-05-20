package ch13_thread;

public class MakeString {

	public static void main(String[] args) {
		//문자열을 아주 길게 만들기
		
		String str = "";
		StringBuffer strBuffer = new StringBuffer();
		StringBuilder strBuiler = new StringBuilder();

		
		Thread seolri = new Thread(() -> {
		for(int i = 0; i < 1000000000; i++) {
//			str += (int)(Math.random()*10);
			strBuffer.append((int)(Math.random()*10));
			if(i % 1000000 == 0) {
				System.out.println(i + "...");
			}
		}
		System.out.println(strBuffer.length());
		}); seolri.start();
		
		Thread seolri1 = new Thread(() -> {
			for(int i = 0; i < 1000000000; i++) {
//			str += (int)(Math.random()*10);
				strBuiler.append((int)(Math.random()*10));
				if(i % 1000000 == 0) {
					System.out.println(i + "...");
				}
			}
			System.out.println(strBuiler.length());
		}); seolri1.start();
		
		
	}
}
