package DongJun.submit03;

public class Q03_윌리찾기 {

	public static void main(String[] args) {
		String findWally = "윌리울리일리울리울리일리월리일리윌리월리울리일리일리월리일리윌리일리윌리일리월리월리윌리울리윌리울리일리울리울리윌리일리";
		int countWally = 0;
		for(int i = 0; i < findWally.length(); i += 2) {
			String syustr = findWally.substring(i, i+2);
			System.out.println("결과 : " + syustr);
			if(syustr.equals("월리")) {
				countWally++;
			}
			 
		} 
		System.out.println("결과 : " + countWally);
		System.out.println("결과 : " + findWally.length());
	
	}

}
