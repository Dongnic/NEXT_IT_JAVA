package project01.Game_IndianPoker;

import java.util.ArrayList;


public class Game_IndianPoker_Check {

	ArrayList<Game_IndianPoker_CardVO> setCard = new ArrayList<>();
	ArrayList<Game_IndianPoker_CardVO> comCard = new ArrayList<>();
	ArrayList<Game_IndianPoker_CardVO> myCard = new ArrayList<>();
	
	// 라운드
	private static int round;
	
	// 보유 칩 
	static int myChip;
	static int comChip;
	// 배팅 칩 
	static int betChip;
	
	// 첫 카드 배열 생성
	public void createCard() {
		round = 1;
		myChip = 30;
		comChip = 30;
		for(int i = 1; i <= 10; i++) {
			setCard.add(new Game_IndianPoker_CardVO("♠️", i, true));
			setCard.add(new Game_IndianPoker_CardVO("❤️", i, true));			
		}
	}
	// 게임 시작
	public int startCard() {
		// 카드 갯수 체크
		if(setCard.size() == 0) {
			System.out.println();
			    System.out.println("🙏====== FINSH GAME ======🙏");
			if(myChip > comChip) {
				System.out.println("       승리 하셨습니다 👑    " + "\n" + "🧿남은 칩 : " + myChip + " 🧿상대 칩 : " + comChip);
				return 1;
			}else if(myChip < comChip){
				System.out.println("       패배 하셨습니다 👎    " + "\n" + "🧿남은 칩 : " + myChip + " 🧿상대 칩 : " + comChip);
				return 2;
			}else if(myChip == comChip) {
				System.out.println(" 🙌 우열을 가릴 수 없습니다 🙌 " + "\n" + "🧿남은 칩 : " + myChip + " 🧿상대 칩 : " + comChip);
				return 3;
			}
			return 4;
		}
		// 라운드 시작
		else {
			if(round >= 9) {
				System.out.println();
				System.out.println("🏳🏴🏳🏴🏳🏴🏳🏴🏳🏴🏳🏴");
				System.out.println();
				System.out.println("========= ROUND "+ round +" =========");
				System.out.println();
				System.out.println("🏳🏴🏳🏴🏳🏴🏳🏴🏳🏴🏳🏴");
			}else {
			System.out.println();
			System.out.println("========= ROUND "+ round +" =========");
			}
			for(int i = 0; i < 4; i++) {
				System.out.println("....... 카드 섞는 중 .......");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			// 보유칩 현황 출력
			showChip();
			// 기본 배팅 1, 차감
			betChip = 1;
			myChip -= betChip;
			comChip -= betChip;
			showBetChip();
			// 본인 카드 부여 
			myCard.add(setCard.get((int)(Math.random()*setCard.size())));
			// 본인에게 부여된 카드 배열에서 삭제
			removeCard(myCard);
			// 상대 카드 부여
			comCard.add(setCard.get((int)(Math.random()*setCard.size())));
			// 상대에게 부여된 카드 배열에서 삭제
			removeCard(comCard);
		}
		// 라운드 수 1 증가
		round++;
		// 카드 출력 
		showComCard();
		return 0;
	}
	
/* 
	 현황 체크  
*/
	
	// 카드 출력 (전체)
	public void showCard() {
		for(int i = 0; i < setCard.size(); i++) {
			System.out.println(setCard.get(i));
		}
	}
	// 카드 출력 (보유)
	public void showCard(ArrayList<Game_IndianPoker_CardVO> card) {
		for(int i = 0; i < card.size(); i++) {
			System.out.println(card.get(i) + " ");
		}
	}
	// 내 카드 출력
	public void showMyCard() {
		System.out.println("##########################");
		System.out.print("🎴 [내 패] => ");
		showCard(myCard);
		System.out.println("##########################");
	}
	// 상대 카드 출력
	public void showComCard() {
		System.out.println("##########################");
		System.out.print("🎴 [상대패] => ");
		showCard(comCard);
		System.out.println("##########################");
	}
	// 전체 칩 출력
	public boolean showChip() {
		System.out.println("\n" + "🧿상대 칩 : " + comChip + "\n" + "🧿 내 칩  : " + myChip);
		if(myChip <= 0) {
			return true;
		}
		return false;
	}
	// 보유 칩 출력
	public void showBetChip() {
		System.out.println("\n" + "[배팅 칩 : " + betChip + "]\n[" + "보유 칩 : " + myChip + "]" + "\n");
	}
	public void showMyChip() {
		System.out.println("\n"+"🧿 내 칩  : " + myChip);
	}
	// 칩 0개인지 체크 
	public void checkChip() {
		if(comChip <= 0) {
			setCard = new ArrayList<>();
		}
		if(myChip <= 0) {
			setCard = new ArrayList<>();
		}
	}
	
/*
     결과 도출  	
 */

	// 결과 계산
	public void checkGame() {
		for(int i = 0; i < 4; i++) {
			System.out.println("....... 결과는 .......");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if(myCard.get(0).getCardnumber() > comCard.get(0).getCardnumber()) {
			// 승리
			gameWin();
		}else if(myCard.get(0).getCardnumber() < comCard.get(0).getCardnumber()) {
			// 패배
			gameLose();
		}else {
			// 무승부
			System.out.println();
			System.out.println("무승부.. 재경기를 시작합니다.");
			showMyCard();
			finshCard();
			gameDraw();
		}
	}
	// 승리 
	public void gameWin() {
		myChip = myChip + (betChip*2);
		System.out.println();
		System.out.println("===========================");
		System.out.println("==== WIN !! ✌✌✌✌ ====");
		System.out.println("===========================");
		showMyChip();
		betChip = 0;
		finshCard();
		checkChip();
	}
	// 포기 (패널티 [내 패 10 : -10], [내 패 >= 상대패 : -5])
	public void gameDie() {
		if(myCard.get(0).getCardnumber() == 10) {
			comChip += 10;
			myChip -= 10;
			System.out.println();
			System.out.println("==========================");
			System.out.println("== 10 다이 (패널티 -10) 😝");
			System.out.println("==========================");
			showMyCard();
			gameLose();
		}else if(myCard.get(0).getCardnumber() >= comCard.get(0).getCardnumber()) {
			comChip += 5;
			myChip -= 5;
			System.out.println();
			System.out.println("==========================");
			System.out.println("== 왜 죽었어 (패널티 -5)😝");
			System.out.println("==========================");
			showMyCard();
			gameLose();
		}else {
			gameLose();
		}
	}
	// 패배 
	public void gameLose() {
		comChip = comChip + (betChip*2);
		System.out.println();
		System.out.println("===========================");
		System.out.println("==== LOSE  😓😓😓😓 =====");
		System.out.println("===========================");
		showMyChip();
		betChip = 0;
		finshCard();
		checkChip();
	}
	// 무승부 
	public void gameDraw() {
		System.out.println();
		System.out.println("========== ROUND "+ round +" ==========");
		System.out.println("==== 👀 AUTO REMATCH 👀 ====");
		// 딜레이
		for(int i = 0; i < 4; i++) {
			System.out.println("....... 카드 섞는 중 .......");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// 본인 카드 부여 
		myCard.add(setCard.get((int)(Math.random()*setCard.size())));
		// 본인에게 부여된 카드 배열에서 삭제
		removeCard(myCard);
		comCard.add(setCard.get((int)(Math.random()*setCard.size())));
		// 상대에게 부여된 카드 배열에서 삭제
		removeCard(comCard);
		// 라운드 수 1 증가
		round++;
		// 카드 출력 
		showComCard();
		
		showMyCard();
		checkGame();
	}
	// 올인 
	public void betall() {
		if(myChip <= comChip) {
			System.out.println(myChip + "개 올인하셨습니다 💰");
			betChip = betChip + myChip;
			comChip = comChip - myChip;
			myChip = 0;
		}else {
			System.out.println("상대의 칩 수만큼 배팅합니다.");
			System.out.println(comChip + "개 올인하셨습니다 💰");
			betChip = betChip + comChip;
			myChip = myChip - comChip;
			comChip = 0;
		}
		showBetChip();
		checkGame();
	}
	// 배팅
	public boolean bet(int num) {
		if(num <= myChip) {
			if(num <= comChip) {				
				System.out.println(num + "개 배팅하셨습니다.");
				betChip = betChip + num;
				myChip = myChip - num;
				comChip = comChip - num;
				showBetChip();
			}else {
				System.out.println();
				System.out.println("상대의 칩 수만큼 배팅합니다.");
				System.out.println(comChip +"개 배팅하셨습니다.");
				betChip = betChip + comChip;
				myChip = myChip - comChip;
				comChip = 0;
			}
		}else {
			System.out.println("배팅 칩이 보유 칩보다 많습니다.");
			return true;
		}
		checkGame();
		return false;
	}
	
	// 힌트거부
	public void hint() {
		comChip += 5;
		myChip -= 5;
		System.out.println();
		System.out.println("==========================");
		System.out.println("== 칩 많네요 (패널티 -5)😝");
		System.out.println("==========================");
		showChip();
	}
		
	/*
	 	 실행 종료
	 */
		
	// 게임 종료 후 배분된 카드 삭제
	public void finshCard() {
		myCard.remove(0);
		comCard.remove(0);
	}
	// 배열에서 분배한 카드 삭제 
	public void removeCard(ArrayList<Game_IndianPoker_CardVO> card) {
		for(int i = 0; i < setCard.size(); i++) {
			if(setCard.get(i).getCardnumber() == card.get(0).getCardnumber()) {
				if(setCard.get(i).getCardtype().equals(card.get(0).getCardtype())) {
					setCard.remove(i);
				}
			}
		}
	}
}
