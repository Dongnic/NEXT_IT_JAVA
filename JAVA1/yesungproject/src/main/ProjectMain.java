package main;

import java.util.ArrayList;
import java.util.Scanner;

import dao.Map;
import model.MemVO;
import model.PlayerVO;
import model.PlayerVO1;
import model.ShipVO;
import service.MemService;
import service.ShipGameService;

public class ProjectMain {
	public static void main(String[] args) {
		Map map = Map.getInstance();
		MemService mems = MemService.getInstance();
		ShipGameService sgs = ShipGameService.getInstance();
		Scanner sc = new Scanner(System.in);
		Event evt = new Event();
		ArrayList<Event> m = new ArrayList<Event>();

		for (int i = 0; i < 45; i++) {
			m.add(new Event(i / 5, i % 5));
			System.out.println();
		}

		while (true) {
			System.out.println("행동을 선택해주세요");
			System.out.println("1. 회원가입 | 2. 로그인 | 3. 종료");
			System.out.print(">>> ");

			int command = 0;
			try {
				command = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력해주세요");
				continue;
			}
			if (command == 1) {
				// 회원가입
				System.out.println("아이디를 입력해주세요");
				System.out.print(">>> ");
				String id = sc.nextLine();
				System.out.println("비밀번호를 입력해주세요");
				System.out.print(">>> ");
				String pw = sc.nextLine();
				System.out.println("이름을 입력해주세요");
				System.out.print(">>> ");
				String name = sc.nextLine();
				// 중복체크
				boolean isduple = mems.duple(id);

				if (isduple) {
					System.out.println("중복 아이디입니다. 다시 시도해주세요");

				} else {
					int cnt = mems.registMem(new MemVO(id, pw, name));

					if (cnt > 0) {
						System.out.println("회원가입이 성공적으로 이루어졌습니다.");
					} else {
						System.out.println("회원가입실패.관리자 문의하세여");
					}
				}
			} else if (command == 2) {
				// 로그인
				System.out.println("아이디를 입력해주세요");
				System.out.print(">>> ");
				String id = sc.nextLine();
				System.out.println("비밀번호를 입력해주세요");
				System.out.print(">>> ");
				String pw = sc.nextLine();

				MemVO login = mems.loginMem(id);

				if (login.getMem_id() != null) {
					if (login.getMem_id().equals(pw)) {
						System.out.println(login.getMem_id() + "님 안녕하세요");
						while (true) {
							System.out.println("1. 보물섬 찾기게임 2.종료");
							int no = 0;
							no = Integer.parseInt(sc.nextLine());
							if (no == 1) {
								System.out.println("보물섬 찾기 게임에 오신걸 환영합니다");
								boolean stop=true;
								while (true) {
									
									System.out.println("1 번님 번호를 선택해주세요");
									System.out.println("|| 1 || 2 || 3 || 4 ||");
									int player1 = 0;
									player1 = Integer.parseInt(sc.nextLine());
									ShipVO user1 = sgs.SelectShip().get(player1 - 1);
									System.out.println(user1);
									user1.setShip_name(user1.getShip_name() + "(1번)");
									System.out.println("=================");
									PlayerVO playerVO1 = new PlayerVO(user1);
									Event fir =new Event();
									fir.ship = playerVO1.getShip();
									
									m.set(5, fir);
									
									System.out.println("2 번님 번호를 선택해주세요");
									System.out.println("|| 1 || 2 || 3 || 4 ||");
									int player2 = 0;
									player2 = Integer.parseInt(sc.nextLine());
									ShipVO user2 = sgs.SelectShip().get(player2 - 1);
									System.out.println(user2);
									user2.setShip_name(user2.getShip_name() + "(2번)");
									System.out.println("=================");
									PlayerVO playerVO2 = new PlayerVO(user2);
									Event sec =new Event();
									sec.ship= playerVO2.getShip();
									
									m.set(15, sec);
									System.out.println("3 번님 번호를 선택해주세요");
									System.out.println("|| 1 || 2 || 3 || 4 ||");
									int player3 = 0;
									player3 = Integer.parseInt(sc.nextLine());
									ShipVO user3 = sgs.SelectShip().get(player3 - 1);
									System.out.println(user3);
									user3.setShip_name(user3.getShip_name() + "(3번)");
									System.out.println("=================");
									PlayerVO playerVO3 = new PlayerVO(user3);
									Event thr =new Event();
									thr.ship= playerVO3.getShip();
									
									m.set(25, thr);
									

									System.out.println("4 번님 번호를 선택해주세요");
									System.out.println("|| 1 || 2 || 3 || 4 ||");
									int player4 = 0;
									player4 = Integer.parseInt(sc.nextLine());
									ShipVO user4 = sgs.SelectShip().get(player4 - 1);
									System.out.println(user4);
									user4.setShip_name(user4.getShip_name() + "(4번)");
									System.out.println("=================");
									PlayerVO playerVO4 = new PlayerVO(user4);
									Event four =new Event();
									four.ship= playerVO4.getShip();
									
									m.set(35, four);
									
									map.showMap(m);
									System.out.println();
									
									int randIndex=(int)(Math.random()*45);
									int randEv=(int)(Math.random()*4);
									if(randIndex!=(5)&&randIndex!=(15)&&randIndex!=(25)&&randIndex!=(35)) {
										m.get(randIndex).event = randEv;
										if(randEv == 1) {
											
										}
									}
									
									while(stop) {
										System.out.println("1 번님  방향을 선택해주세요");
										System.out.println("1. 위 2.아래 3.오른쪽 4. 왼쪽");
										System.out.print(">>>");
										int cmd = Integer.parseInt(sc.nextLine());
										if(cmd == 1) {
											m.get(5).ship=null;
											m.get(0).ship=fir.ship;
										map.showMap(m);
										}else if(cmd == 2) {
											fir.row=fir.row+1;
											map.showMap(m);
										}else if(cmd==3) {
											fir.col=fir.col+1;
										}else if(cmd==4) {
											fir.col=fir.col-1;
										}
									}
								}

							} else if (no == 2) {
								System.out.println("종료합니다.");
								break;
							} else {
								System.out.println("잘못입력하셨습니다 1 | 2 번 중에 고르세요");
								continue;
							}
						}
					} else {
						System.out.println("비밀번호가 일치하지않습니다.");

					}
				} else {
					System.out.println("존재하지 않는 아이디입니다.");

				}

			} else if (command == 3) {
				System.out.println("종료");
				break;
			} else {
				System.out.println("잘못입력하셨습니다.");
			}

		}

	}
//	public static void top() {
//		m.get(5).ship = playerVO1.getShip();
//	}
}
