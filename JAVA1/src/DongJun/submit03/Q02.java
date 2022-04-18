package DongJun.submit03;

public class Q02 {

	public static void main(String[] args) {
		
		int total_10pac = 1;
		for(int i = 10; i > 0; i--) {
			total_10pac *= i;
		}
		System.out.println("결과: " + total_10pac);
		
		long total_15pac = 1; // ㅋㅋ 
		for(int i = 15; i > 0; i--) {
			total_15pac *= i;
		}
		System.out.println("결과: " + total_15pac);
	}

}
