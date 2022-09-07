package project01.Game_Escape;

import java.util.Scanner;

import project01.model.CharacterVO;
import project01.service.CharacterService;

public class Game_Escape {
	public static boolean start(CharacterVO make) {
		CharacterService chaService = CharacterService.getInstance();
		int money = chaService.getMoney(make.getName()).getMoney();
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n");
		System.out.println("|￣￣￣￣￣￣￣|\n" + 
				"| 확인중      |\n" + 
				"|＿＿＿＿＿＿＿| \n" + 
				"(\\__/) || \n" + 
				"(•ㅅ•).|| \n" + 
				"/ . . . .づ");
		for(int i = 0; i < 4; i++) {
			System.out.println(".......  .......");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if(money>110000) {
			System.out.println("탈출성공");
			try {
				Thread.sleep(100000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}else{
			if(money>50000) {
				int returnMoney = money - 50000;
				int updateMoney = chaService.updateCharacter(returnMoney, make.getName());
				if(updateMoney > 0) {
					System.out.println("돈정보 업데이트 성공");
				}
			}
			
//			System.out.println("\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n");
			System.out.println("탈출 실패 다시 노동시작");
			System.out.println("아무키나 입력");
		}
		while(sc.nextLine().isEmpty()) {
			
		}
		return false;
		}
	}
}
