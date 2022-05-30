package project01.Game_Graph;

import java.util.Scanner;

import project01.model.CharacterVO;
import project01.service.CharacterService;

public class Game_Graph {
//	static Game_Graph_Thread threadG = Game_Graph_Thread.getInstance();
	public Game_Graph() {
		
	}
	
	public static boolean start(CharacterVO make) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		for(int i = 0; i < 3; i++) {
			System.out.println("......... 로딩 중 .........");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// 업데이트소지금액 가져오기, 변수에 저장
		
		int gotMoney = make.getMoney();
		while(1<2) {
			
			System.out.println("스탑게임 하시겠습니까?");
			System.out.println("1. 게임시작 | 2. 종료");
			System.out.print(">>>");
			int command = 0;
			try {
				command = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e1) {
				e1.printStackTrace();
			}
			if(command == 1) {
				for(int i = 0; i < 4; i++) {
					System.out.println("....... 게임 준비 중 .......");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				int betMoney = 0;
				Game_Graph_Thread threadG = new Game_Graph_Thread();
				System.out.println(Game_Graph_Thread.getGameStop());
				System.out.println(Game_Graph_Thread.getThreadStop());
				while(true) {
					System.out.println("소지금액 : " + gotMoney);
					System.out.print("배팅금액 입력 : ");
					betMoney = Integer.parseInt(sc.nextLine());
					if(betMoney<=gotMoney) {
						gotMoney -= betMoney;
						break;
					}else {
						System.out.println("배팅금액이 소지금액보다 큽니다.");
					}
				}
				for(int i = 3; i > 0; i--) {
					System.out.println("....... 카운트 "+ i+" .......");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				Game_Graph_Thread.setGameStop(true);
				Game_Graph_Thread.setThreadStop(true);
				threadG.start();
				while(Game_Graph_Thread.getGameStop()) {
					String isEnter = "";
					try {
						isEnter = sc.nextLine();
					} catch (Exception e) {
						e.printStackTrace();
					}
					if(isEnter.length() == 0) {
						String blank = sc.nextLine();
						Game_Graph_Thread.setThreadStop(false);
						try {
							Game_Graph_Thread.sleep(500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						break;
						}
				}
				System.out.println();
				System.out.printf("%.2f배 획득!!",Game_Graph_Thread.getCount());
				int xNum = (int)(Game_Graph_Thread.getCount() * betMoney); 
				gotMoney += xNum;
				System.out.println("\n소지금액 : " + gotMoney);
				threadG.interrupt();
			}else if(command == 2){
				System.out.println("게임을 종료합니다.");
				// gotmoney DB 소지금액에 업데이트
				CharacterService chaService = CharacterService.getInstance();
				int updateMoney = chaService.updateCharacter(gotMoney, make.getName());
				if(updateMoney > 0) {
					System.out.println("돈정보 업데이트 성공");
				}
				return false;
			}else {
				System.out.println("1, 2만 입력가능합니다.");
			}
			
		}// while문 종료
		
	}
	
}
