package project01.Game_IndianPoker;

import java.util.Scanner;

import project01.model.CharacterVO;
import project01.service.CharacterService;

public class Game_IndianPoker {

	static Game_IndianPoker_Check poker = new Game_IndianPoker_Check();

	public Game_IndianPoker() {
	}

	public static boolean start(CharacterVO make) {
		Scanner sc = new Scanner(System.in);
		CharacterService chaService = CharacterService.getInstance();
		main: while (true) {

			int gotMoney = chaService.getMoney(make.getName()).getMoney();
			int betMoney = 0;
			System.out.println();
			for (int i = 0; i < 3; i++) {
				System.out.println("......... 로딩 중 .........");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
//					e.printStackTrace();
				}
			}
			welcome();
			int command = 0;
			try {
				command = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e1) {
				e1.printStackTrace();
			}
			if (command == 1) {
				// 게임시작
				poker.createCard();
				while (true) {
					System.out.println("소지금액 : " + gotMoney);
					System.out.print("배팅금액 입력 : ");
					betMoney = Integer.parseInt(sc.nextLine());
					if (betMoney <= gotMoney) {
						gotMoney -= betMoney;
						break;
					} else {
						System.out.println("배팅금액이 소지금액보다 큽니다.");
					}
				}
				for (int i = 0; i < 4; i++) {
					System.out.println("....... 카드 생성 중 .......");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				start: while (true) {
					int i = poker.startCard();
					game: while (true) {
//						boolean i = poker.startCard();
						if (i == 1) {
							// 승
							System.out.println("게임을 종료합니다.");
							gotMoney += (betMoney * 2);
							int updateMoney = chaService.updateCharacter(gotMoney, make.getName());
							if (updateMoney > 0) {
								System.out.println("돈정보 업데이트 성공");
							}
							break start;
						} else if (i == 2) {
							// 패
							System.out.println("게임을 종료합니다.");
							int updateMoney = chaService.updateCharacter(gotMoney, make.getName());
							if (updateMoney > 0) {
								System.out.println("돈정보 업데이트 성공");
							}
							break start;
						} else if (i == 3) {
							// 무
							System.out.println("게임을 종료합니다.");
							gotMoney += betMoney;
							int updateMoney = chaService.updateCharacter(gotMoney, make.getName());
							if (updateMoney > 0) {
								System.out.println("돈정보 업데이트 성공");
							}
							break start;
						} else if (i == 4) {

						} else {
							bet: while (true) {
								startprint();
								int select = Integer.parseInt(sc.nextLine());

								if (select == 1) {
									// 배팅
									if (poker.showChip()) {
										System.out.println("패배! 남은 칩이 없습니다. 대출하세요");
										break game;
									} else
										betprint();
									// 입력 받은 값 bet()메소드 실행
									int cmd = Integer.parseInt(sc.nextLine());
									if (poker.bet(cmd)) {
										System.out.println("다시 배팅하세요.");
										break bet;
									}
									break game;
								} else if (select == 2) {
									// 다이
									poker.gameDie();
									break game;
								} else if (select == 3) {
									// 올인
									poker.betall();
									break game;
								} else if (select == 4) {
									if (poker.myChip < 10) {
										poker.showCard();
									} else {
										poker.hint();
									}
								} else if (select == 5) {
									// 종료
									poker.finshCard();
									System.out.println("게임을 종료합니다.");
									break start;
								} else {
									// 오류
									System.out.println("1, 2, 3, 4, 5만 입력 가능합니다.");
								}
							} // bet(while)
						}
					} // game(while)
				} // start(while)
			} else if (command == 2) {
				gameRule();
				System.out.println();
				System.out.println("1. 돌아가기 | 2. 종료");
				System.out.print(">>>");
				int command2 = Integer.parseInt(sc.nextLine());
				if (command2 == 1) {

				} else if (command2 == 2) {
					System.out.println("프로그램을 종료합니다.");
					return false;
				} else {
					System.out.println("프로그램을 종료합니다.");
					return false;
				}
			} else if (command == 3) {
				// 종료
				System.out.println("프로그램을 종료합니다.");
				return false;
			} else {
				// 오류
				System.out.println("1, 2, 3만 입력 가능합니다.");
			}
		} // main(while)
	} // main

	static void welcome() {
		System.out.println();
		System.out.println(" 🂡 🂢 🂣 🂤 🂥 🂦 🂧 🂨 🂩 🂪  ");
		System.out.println();
		System.out.println(" ❤️❤️ Indian  Poker ❤️❤️");
		System.out.println();
		System.out.println(" 🂡 🂢 🂣 🂤 🂥 🂦 🂧 🂨 🂩 🂪");
		System.out.println();
		System.out.println("무엇을 하시겠습니까?");
		System.out.println("1. 게임시작 | 2. 게임방법 | 3. 종료");
		System.out.print(">>>");
	}

	static void startprint() {
		System.out.println();
		System.out.println("배팅하시겠습니까?");
		System.out.println("1. 배팅 | 2. 다이 | 3. 올인 | 4. 힌트 | 5. 종료");
		System.out.print(">>>");
	}

	static void betprint() {
		System.out.println();
		System.out.println("얼마를 배팅하시겠습니까?");
		System.out.print(">>>");
	}

	static void gameRule() {
		System.out.println();
		System.out.println("💡💡💡💡💡💡💡💡💡💡💡💡💡");
		System.out.println("       📚  Game Rule  📚       ");
		System.out.println("💡💡💡💡💡💡💡💡💡💡💡💡💡");
		System.out.println();
		System.out.println("1. 라운드는 총 10라운드 🔔");
		System.out.println("   -> 종료 시 남은 🧿으로 승부🔥");
		System.out.println("   -> 카드는 총 20개");
		System.out.println("2. 상대 패를 보고 배팅");
		System.out.println("   -> 배팅은 라운드 당 1회");
		System.out.println("3. 다이 선택 시 패널티 🚫");
		System.out.println("   -> [ 🂪 10카드 ]  : -10🧿");
		System.out.println("   -> [ 내🂠 > 상대 🂠] : -5🧿");
		System.out.println("4. 힌트 : 남은카드 보기 🔍");
		System.out.println("   -> 🧿10개보다 적어야 가능");
		System.out.println("   -> 🧿10개 이상 : -5🧿");
	}

}
