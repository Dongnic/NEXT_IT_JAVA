package DongJun.submit04;

public class Q01_원판돌리기_A {

/*  미비한 점
 *  if 에 불필요 하게 많은 조건 사용
 *  변수가 명확하지 않고 수정 시 용이하지 않음
 */
	public static void main(String[] args) {
		
		int user = 5834; // 각도
		int rouletteSpin = user / 360; // 회전수 
		int roulette = user % 360; // 남은 각도
		String goods = ""; // 상품명
		
		if(roulette <= 60) {
			goods = "사탕";
		}else if(roulette <= 120) {
			goods = "초콜릿";
		}else if(roulette <= 180) {
			goods = "쿠키";
		}else if(roulette <= 240) {
			goods = "콜라";
		}else if(roulette <= 300) {
			goods = "아이스크림";
		}else if(roulette <= 360) {
			goods = "커피";			
		}else goods = "";
		
		System.out.println("회전 수 : " + rouletteSpin + "\n" +"당첨 : " + goods);
	}

}
