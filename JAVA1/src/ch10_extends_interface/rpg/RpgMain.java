package ch10_extends_interface.rpg;

import java.util.ArrayList;
import java.util.Scanner;

public class RpgMain {

	public static void main(String[] args) {
		
		
		
		Warrior dalhyun = new Warrior("김달현", 100, 200, User.Jobs.WARRIOR_HANSON);
		Enermy chanung = new Enermy("정찬웅", 10, 2000);
		Warrior hyunsub = new Warrior("염현섭", 100, 200, User.Jobs.WARRIOR_DOOSON);
		Magician nagyeom = new Magician("송나겸", 100, 200, User.Jobs.MAGIC_FIRE);
		Magician syuli = new Magician("박설리", 100, 200, User.Jobs.MAGIC_ICE);
		Enermy devil = new Enermy("악마", 150, 70000);
		
		dalhyun.attack(chanung);
		dalhyun.attack(chanung);
		dalhyun.skill(chanung);
		
		ArrayList<Character> bt = new ArrayList<>();
		bt.add(hyunsub);
		bt.add(dalhyun);
		bt.add(nagyeom);
		bt.add(syuli);
		bt.add(devil);
		// 죽었을 때 리스트 내에서 제거하기
		hyunsub.battle = new Battle() {
			@Override
			public void outOfBattle() {
				bt.remove(hyunsub);
			}
		};
		dalhyun.battle = new Battle() {
			@Override
			public void outOfBattle() {
				bt.remove(dalhyun);
			}
		};
		chanung.battle = new Battle() {
			@Override
			public void outOfBattle() {
				bt.remove(chanung);
			}
		};
		nagyeom.battle = new Battle() {
			@Override
			public void outOfBattle() {
				bt.remove(nagyeom);
			}
		};
		syuli.battle = new Battle() {
			@Override
			public void outOfBattle() {
				bt.remove(syuli);
			}
		};
		devil.battle = new Battle() {
			@Override
			public void outOfBattle() {
				bt.remove(devil);
			}
		};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("=======================================");
		while(true) {
			for(int i = 0; i < bt.size(); i++) {
				// 리스트내 객체가 유저인 경우에만 선택지 제공
			
			if(bt.get(i) instanceof User) {
				User turn = (User)bt.get(i);
				
				System.out.println(turn.getName() + "의 턴");
				System.out.println("1. 공격 | 2. 스킬");
				System.out.print(">>>");
				
				int cmmd = Integer.parseInt(sc.nextLine());
				
				if(cmmd == 1) {
					turn.attack(devil);
				}else if(cmmd == 2) {
					turn.skill(devil);
				}
				
			  }
			
			}// for문
			for(int i = bt.size() - 1; i <= 0; i--) {
				System.out.println(bt.get(i));
			}
			
			if(bt.contains(devil) == false){
				System.out.println("승리");
				break;
			}
			
			if(!bt.contains(hyunsub) && !bt.contains(dalhyun) &&
				!bt.contains(syuli) && !bt.contains(nagyeom)) {
				System.out.println("패배");
				break;
			}
		
		
		}
		
	}

}
