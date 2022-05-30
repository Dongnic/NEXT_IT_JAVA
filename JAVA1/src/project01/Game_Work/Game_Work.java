package project01.Game_Work;

import java.util.Scanner;

import project01.model.CharacterVO;
import project01.service.CharacterService;

public class Game_Work {
	
	
	public static boolean start(CharacterVO make) {
		Scanner sc = new Scanner(System.in);
		int money = make.getMoney();
		while(true) {
			System.out.println("\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n");
			System.out.println("["+money+"원]");
			System.out.println();
			System.out.println("땀 흘려 벌어라 Enter입력 [종료 : q]");
			String work="";
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			try {
				work = sc.nextLine();
			} catch (Exception e) {
				e.printStackTrace();
			}
			if(work.equals("q")) {
				System.out.println("게임종료");
				//TODO 돈 계산
				CharacterService chaService = CharacterService.getInstance();
				int updateMoney = chaService.updateCharacter(money, make.getName());
				if(updateMoney > 0) {
					System.out.println("돈정보 업데이트 성공");
				}
				return false;
			}
			if(work.isEmpty()) {
				money++;
			}
		}
	}
}
