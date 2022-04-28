package DongJun.submit05;
import java.util.Scanner;
public class Q02_엘리베이터 {

	public static void main(String[] args) {
		
		int elevatorA = (int) (Math.random() * 10);       // 승강기 A 위치(랜덤)
		int elevatorB = (int) (Math.random() * 10);	      // 승강기 A 위치(랜덤)
		int whereI = 0;                                   // 내 위치
		String aKey = "";                                 // 현재 타고있는 승강기
//		final int ACTIVE_ELEVATOR_A = 200;                // aKey 형식보다는 상수를 선언하는게 더 좋음
		final String START_ELEVATOR = "========== 희영빌딩 엘리베이터(-10층 ~ 63층) ==========";
														  // 출력되는 것도 상수로 선언함 
		Scanner sc = new Scanner(System.in);
		outer: while(true) {
				System.out.println("========== 희영빌딩 엘리베이터(-10층 ~ 63층) ==========");
				System.out.println("승강기 A의 현재위치: " + elevatorA + "층");
				System.out.println("승강기 B의 현재위치: " + elevatorB + "층");					
				System.out.print("몇 층에 계시나요? [종료하시려면 q 또는 exit 입력]: ");
				String input = sc.nextLine();		
	/* 종료여부 */
				if(input.equalsIgnoreCase("q") || input.equalsIgnoreCase("exit")) {
						System.out.println("프로그램이 종료되었습니다.");
						break outer;
				} 			
				int button = Integer.parseInt(input);
	/* 층수 제한 */
				if(button > 63 || button < -10) {
					System.out.println("희영빌딩 엘리베이터는 -10층 ~ 63층까지만 운영합니다.");		
				}else {			
	/* 엘리베이터 층수 차이 계산 */ // 삼항연산자 적극사용!!!
			    int eleA = 0;
			    int eleB = 0;
			    if(button >= elevatorA) {
			    	eleA = button - elevatorA;
			    }else {
			    	eleA = elevatorA - button;
			    }
				if(button >= elevatorB) {
					eleB = button - elevatorB;
				}else {
					eleB = elevatorB - button;
				}

	/* 메인 엘리베이터 */
				System.out.println(input + "층에서 엘리베이터를 호출합니다.");
				if(eleA < eleB) {
					if(eleA == 0) {
						System.out.println("승강기 A는 이미 " + button + "층입니다.");
						whereI = button;
						aKey = "A";
						break outer;
					}else
					elevatorA = button;
					System.out.println("승강기 A가 " + button + "층으로 이동하였습니다.");
					whereI = button;
					aKey = "A";
					break outer;
				}else if(eleB < eleA) {
					if(eleB == 0) {
						System.out.println("승강기 B는 이미 " + button + "층입니다.");
						whereI = button;
						aKey = "B";
						break outer;
					}else
					elevatorB = button;				
					System.out.println("승강기 B가 " + button + "층으로 이동하였습니다.");
					whereI = button;
					aKey = "B";
					break outer;
				}else if(eleA == eleB) {
					if(eleA == 0) {
						System.out.println("승강기 A는 이미 " + button + "층입니다.");
						whereI = button;
						aKey = "A";
						break outer;
					}
						else if(elevatorA > elevatorB) {
							elevatorA = button;
							System.out.println("승강기 A가 " + button + "층으로 이동하였습니다.");
							whereI = button;
							aKey = "A";
							break outer;
						}else if(elevatorB > elevatorA) {
							elevatorB = button;					
							System.out.println("승강기 B가 " + button + "층으로 이동하였습니다.");
							whereI = button;
							aKey = "B";
							break outer;
						}else {
							elevatorA = button;
							System.out.println("승강기 A가 " + button + "층으로 이동하였습니다.");
							whereI = button;
							aKey = "A";
							break outer;
						}	
				}else {
					System.out.println("고장");
					break outer;
				}						
			}			
		} // while outer
	/* 도착 후 */
		inner: while(true) {
			System.out.println("========== 희영빌딩 엘리베이터(-10층 ~ 63층) ==========");
			System.out.println("승강기 " + aKey + "현재 위치 " + whereI + "층입니다.");
			System.out.print("몇 층에 가시나요? [종료하시려면 q 또는 exit 입력]: ");
			String output = sc.nextLine();
	/* 종료여부 */
			if(output.equalsIgnoreCase("q") || output.equalsIgnoreCase("exit")) {
					System.out.println("프로그램이 종료되었습니다.");
					break inner;
			} 			
			int button = Integer.parseInt(output);
	/* 층수 제한 */
			if(button > 63 || button < -10) {
				System.out.println("희영빌딩 엘리베이터는 -10층 ~ 63층까지만 운영합니다.");
				
			}else {
	/* 엘리베이터 */	
				if(aKey == "A") {
					System.out.println("승강기 A가 "+ output + "층으로 이동하였습니다.");
					System.out.println("운행을 종료합니다");
					break inner;
				} else if(aKey == "B"){
					System.out.println("승강기 B가 "+ output + "층으로 이동하였습니다.");
					System.out.println("운행을 종료합니다!");
					break inner;
				} else {
					System.out.println("운행을 종료합니다!");
					break inner;
				}
			}
		}//while inner
		sc.close();
  } // main 

}//class