package DongJun.submit13;

import java.util.ArrayList;

public class Poker {
	
	// 새 카드 배열
	ArrayList<Card> setCard = new ArrayList<>();
	ArrayList<Card> comCard = new ArrayList<>();
	ArrayList<Card> myCard = new ArrayList<>();
	
	// 라운드
	int round;
	
	// 보유 칩 
	int myChip;
	int comChip;
	// 배팅 칩 
	int betChip;
	
	// 첫 카드 배열 생성
	public void createCard() {
		round = 1;
		myChip = 30;
		comChip = 30;
		for(int i = 1; i <= 10; i++) {
			setCard.add(new Card("♠️", i, true));
			setCard.add(new Card("❤️", i, true));			
		}
	}
	// 카드 출력 (전체)
	public void showCard() {
		for(int i = 0; i < setCard.size(); i++) {
			System.out.println(setCard.get(i));
		}
	}
	// 카드 출력 (보유)
	public void showCard(ArrayList<Card> card) {
		for(int i = 0; i < card.size(); i++) {
			System.out.println(card.get(i) + " #");
		}
	}
	// 전체 칩 출력
	public boolean showChip() {
		System.out.println("\n" + "🌕상대 칩 : " + comChip + "\n" + "🌕 내 칩  : " + myChip);
		if(myChip <= 0) {
			return true;
		}
		return false;
	}
	// 보유 칩 출력
	public void showBetChip() {
		System.out.println("\n" + "[배팅 칩 : " + betChip + "]\n[" + "보유 칩 : " + myChip + "]" + "\n");
	}
	// 게임 시작
	public boolean startCard() {
		// 카드 갯수 체크
		if(setCard.size() == 0) {
			System.out.println("🙏====== FINSH GAME ======🙏");
			if(myChip > comChip) {
				System.out.println("승리 하셨습니다. 남은 칩 : " + myChip + "상대 칩 : " + comChip);
			}else if(myChip < comChip){
				System.out.println("패배 하셨습니다. 남은 칩 : " + myChip + "상대 칩 : " + comChip);
			}else if(myChip == comChip) {
				System.out.println("우열을 가릴 수 없습니다. 남은 칩 : " + myChip + "상대 칩 : " + comChip);
			}
			return true;
		}
		else {
			System.out.println();
			System.out.println("========= ROUND "+ round +" =========");
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
			// 기본 배팅 차감
			betChip = 1;
			myChip -= betChip;
			comChip -= betChip;
			showBetChip();
			// 본인 카드 부여 
			myCard.add(setCard.get((int)(Math.random()*setCard.size())));
			// 본인에게 부여된 카드 배열에서 삭제
			removeCard(myCard);
			comCard.add(setCard.get((int)(Math.random()*setCard.size())));
			// 상대에게 부여된 카드 배열에서 삭제
			removeCard(comCard);
		}
		// 라운드 수 1 증가
		round++;
		// 카드 출력 
		System.out.println("#########################");
		System.out.print("# [상대패] => ");
		showCard(comCard);
		System.out.println("#########################");
		
		return false;
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
			System.out.println("#########################");
			System.out.print("# [내 패] => ");
			showCard(myCard);
			System.out.println("#########################");
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
		betChip = 0;
		finshCard();
		checkChip();
	}
	// 패배 
	public void gameLose() {
		comChip = comChip + (betChip*2);
		System.out.println();
		System.out.println("===========================");
		System.out.println("==== LOSE  😓😓😓😓 =====");
		System.out.println("===========================");
		if(myCard.get(0).getCardnumber() == 10) {
			comChip += 10;
			myChip -= 10;
			System.out.println();
			System.out.println("===========================");
			System.out.println("== 10 다이 (패널티 -10)😝==");
			System.out.println("===========================");
			System.out.println("#########################");
			System.out.print("# [내 패] => ");
			showCard(myCard);
			System.out.println("#########################");
		}
		betChip = 0;
		finshCard();
		checkChip();
	}
	// 무승부 
	public void gameDraw() {
		System.out.println();
		System.out.println("========== ROUND "+ round +" ==========");
		System.out.println("======== 👀 REMATCH 👀 ========");
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
		System.out.println("#########################");
		System.out.print("# [상대패] => ");
		showCard(comCard);
		System.out.println("#########################");
		System.out.println("#########################");
		System.out.print("# [내  패] => ");
		showCard(myCard);
		System.out.println("#########################");
		checkGame();
	}
	// 올인 
	public void betall() {
		if(myChip <= comChip) {
			System.out.println(myChip + "개 올인하셨습니다 💰");
			betChip = betChip + myChip;
			comChip = comChip - myChip;
			myChip = 0;
			showBetChip();
			checkGame();
		}else {
			System.out.println("상대의 칩 수만큼 배팅합니다.");
			System.out.println(comChip + "개 올인하셨습니다 💰");
			betChip = betChip + comChip;
			myChip = myChip - comChip;
			comChip = 0;
			showBetChip();
			checkGame();
		}
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
	// 게임 종료 후 배분된 카드 삭제
	public void finshCard() {
		if(setCard.size() == 0) {

		}else {
		myCard.remove(0);
		comCard.remove(0);
		}
	}
	// 사용카드 삭제 
	public void removeCard(ArrayList<Card> card) {
		for(int i = 0; i < setCard.size(); i++) {
			if(setCard.get(i).getCardnumber() == card.get(0).getCardnumber()) {
				if(setCard.get(i).getCardtype().equals(card.get(0).getCardtype())) {
					setCard.remove(i);
				}
			}
		}
	}
}
