package DongJun.submit13;

import java.util.Scanner;

public class PokerMain {

	public static void main(String[] args) {
		
		Poker poker = new Poker();
		
		Scanner sc = new Scanner(System.in);
		main: while(true) {
			for(int i = 0; i < 3; i++) {
				System.out.println("......... 로딩 중 .........");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			welcome();
			int command = Integer.parseInt(sc.nextLine());
			
			if(command == 1) {
				// TODO 게임시작
				poker.createCard();
				for(int i = 0; i < 4; i++) {
					System.out.println("....... 카드 생성 중 .......");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				game :while(true) {
						
						if(poker.startCard()) {
							System.out.println("게임을 종료합니다.");
							break game;
						}else {
						
						startprint();
						int select = Integer.parseInt(sc.nextLine());
						if(select == 1) {
							// TODO 배팅 
							if(poker.showChip()) {
								System.out.println("패배! 남은 칩이 없습니다. 대출하세요");
								break game;
							}else
							betprint();
							// 입력 받은 값 bet()메소드 실행 
							int cmd = Integer.parseInt(sc.nextLine());
							if(poker.bet(cmd)) {
								System.out.println("다시 배팅하세요.");
							}
						}else if(select == 2) {
							// TODO 다이
							poker.gameLose();
						}else if(select == 3) {
							// TODO 올인
							poker.betall();
						}else if(select == 4) {
							// 종료
							poker.finshCard();
							System.out.println("게임을 종료합니다.");
							break game;
						}else {
							// 오류
							System.out.println("오류 발생 게임을 종료합니다");
							break;
						}
					}
				}
			}else if(command == 2) {
				// 종료 
				System.out.println("프로그램을 종료합니다.");
				break main;
			}else {
				// 오류
				System.out.println("1 or 2만 입력");
			}
			
		}
		
//		for(int i = 0; i < 11; i++) {			
//			System.out.println("==== 게임 시작 ====");
//			poker.startCard();
//			System.out.println("==== 사용 카드 제거 ====");
//			poker.finshCard();
//			System.out.println("==== 카드 목록 출력 ====");
//			poker.showCard();
//		}

		
	} // main
	static void welcome(){
		System.out.println();
		System.out.println("🎴🎴🎴🎴🎴🎴🎴🎴🎴🎴🎴");
		System.out.println();
		System.out.println("♠️❤️  NEXT GamBling  ❤️♠️");
		System.out.println();
		System.out.println("🎴🎴🎴🎴🎴🎴🎴🎴🎴🎴🎴");
		System.out.println();
		System.out.println("무엇을 하시겠습니까?");
		System.out.println("1. 게임시작 | 2. 종료");
		System.out.print(">>>");
	}

	static void startprint(){
		System.out.println();
		System.out.println("배팅하시겠습니까?");
		System.out.println("1. 배팅 | 2. 다이 | 3. 올인 | 4. 종료");
		System.out.print(">>>");
	}
	static void betprint(){
		System.out.println();
		System.out.println("얼마를 배팅하시겠습니까?");
		System.out.print(">>>");
	}
	
}
