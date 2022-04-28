package DongJun.submit04;

public class Q01_원판돌리기 {

	public static void main(String[] args) {
	
		int roulette = 0;
		int rouletteSpin = 5834 / 360;
		String goods = "";
		roulette = 5834 % 360;
		
		if(roulette >= 0 && roulette < 60) {
			goods = "사탕";
		}else if(roulette >= 60 && roulette < 120) {
			goods = "초콜릿";
		}else if(roulette >= 120 && roulette < 180) {
			goods = "쿠키";
		}else if(roulette >= 180 && roulette < 240) {
			goods = "콜라";
		}else if(roulette >= 240 && roulette < 300) {
			goods = "아이스크림";
		}else if(roulette >= 300 && roulette < 360) {
			goods = "커피";			
		}else goods = "";
		
		System.out.println("회전 수 : " + rouletteSpin + "\n" +"당첨 : " + goods);
							
		
	}

}
