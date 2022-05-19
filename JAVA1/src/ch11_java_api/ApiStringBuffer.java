package ch11_java_api;

public class ApiStringBuffer {

	public static void main(String[] args) {
		// 문자열하면? String
		// String을 계속 수정하게 되면
		// 객체가 많아져 비효율적이됨 
		
		// 랜덤 10자리를 더한다
		String strVal = "";
		for(int i=0;i<10;i++) {
			int randInt = (int)(Math.random() * 10);
			strVal += randInt;
		}
		System.out.println(strVal);
	}

}
