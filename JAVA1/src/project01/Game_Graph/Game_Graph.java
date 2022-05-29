package project01.Game_Graph;

import java.util.Scanner;

public class Game_Graph {
	static Game_Graph_Thread thread = new Game_Graph_Thread();
	public Game_Graph() {
		
	}
	
	public static boolean start() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
//		for(int i = 0; i < 3; i++) {
//			System.out.println("......... 로딩 중 .........");
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
		while(1<2) {
			
			System.out.println("무엇을 하시겠습니까?");
			System.out.println("1. 게임시작 | 2. 종료");
			System.out.print(">>>");
			int command = 0;
			try {
				command = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e1) {
//				e1.printStackTrace();
			}
			if(command == 1) {
//				for(int i = 0; i < 4; i++) {
//					System.out.println("....... 게임 준비 중 .......");
//					try {
//						Thread.sleep(500);
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//				}
				// TODO 업데이트소지금액 가져오기, 변수에 저장
				int gotMoney = 10;
				int betMoney = 0;
				while(true) {
					System.out.println("소지금액 : " + gotMoney);
					System.out.print("배팅금액 입력 : ");
					betMoney = Integer.parseInt(sc.nextLine());
					if(betMoney<gotMoney) {
						gotMoney -= betMoney;
						break;
					}else {
						System.out.println("배팅금액이 소지금액보다 큽니다.");
					}
				}
				thread.start();
				while(thread.getGameStop()) {
//					String isEnter = "";
//					try {
//						isEnter = sc.nextLine();
//					} catch (Exception e) {
//						e.printStackTrace();
//					}
//					if(isEnter.length() == 0) {
					String blank = sc.nextLine();
						thread.setthreadStop(false);
						try {
							thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						break;
//					}
				}
				System.out.println();
				System.out.printf("%.2f배 획득!!",Game_Graph_Thread.getCount());
				int xNum = (int)(Game_Graph_Thread.getCount() * betMoney); 
				gotMoney += xNum;
				System.out.println("\n소지금액 : " + gotMoney);
			}else if(command == 2){
				System.out.println("게임을 종료합니다.");
				//TODO gotmoney DB 소지금액에 업데이트
				return false;
			}else {
				System.out.println("1, 2만 입력가능합니다.");
			}
			
		}// while문 종료
		
	}
	
}
