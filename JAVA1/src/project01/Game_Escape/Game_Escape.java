package project01.Game_Escape;

import java.util.Scanner;

import project01.model.CharacterVO;
import project01.service.CharacterService;

public class Game_Escape {
	public static boolean start(CharacterVO make) {
		int money = make.getMoney();
		Scanner sc = new Scanner(System.in);
		System.out.println("\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n"+"\n");
		System.out.println("|￣￣￣￣￣￣￣|\n" + 
				"| 확인중      |\n" + 
				"|＿＿＿＿＿＿＿| \n" + 
				"(\\__/) || \n" + 
				"(•ㅅ•).|| \n" + 
				"/ . . . .づ");
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
				CharacterService chaService = CharacterService.getInstance();
				int updateMoney = chaService.updateCharacter(returnMoney, make.getName());
				if(updateMoney > 0) {
					System.out.println("돈정보 업데이트 성공");
				}
			}
			System.out.println("탈출 실패 다시 노동시작");
		}
		while(sc.nextLine().isEmpty()) {
			
		}
		return false;
	}
}
