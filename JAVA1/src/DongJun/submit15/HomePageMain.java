package DongJun.submit15;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import DongJun.submit14.Q02.DateBoard;
import DongJun.submit15.model.HomepageVO;
import DongJun.submit15.model.MemberVO;
import DongJun.submit15.service.HomepageService;
import DongJun.submit15.service.MemberService;

public class HomePageMain {

	public static void main(String[] args) {
		MemberService memService = MemberService.getInstance();
		HomepageService homepageService = HomepageService.getInstance();
		String date;
		int no;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm");

		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("행동을 선택");
			System.out.println("1. 회원가입 | 2. 로그인 | 3. 종료");
			System.out.print(">>>");
			int cmd = 0;
			try {
				cmd = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력해주세요.");
				continue;
			}
			
			if(cmd == 1) {
				// 회원가입
				System.out.println("이이디를 입력해주세요");
				System.out.print(">>>");
				String id = sc.nextLine();
				System.out.println("비밀번호를 입력해주세요");
				System.out.print(">>>");
				String pw = sc.nextLine();
				
				MemberVO temp = new MemberVO(id, pw);
				
				memService.insertMem(temp);
			}else if(cmd == 2) {
				//  로그인
				System.out.println("이이디를 입력해주세요");
				System.out.print(">>>");
				String id = sc.nextLine();
				System.out.println("비밀번호를 입력해주세요");
				System.out.print(">>>");
				String pw = sc.nextLine();
				
				MemberVO login = memService.loginMem(id);
				if(pw.equals(login.getMemPw())) {
					System.out.println(login.getMemId() + "님 환영합니다.");
					
					while(true) {
						System.out.println("행동을 선택해주세요");
						System.out.println("1. 글쓰기 | 2. 글조회 | 3. 로그아웃");
						System.out.print(">>>");
						int select = 0;
						try {
							select = Integer.parseInt(sc.nextLine());
						} catch (NumberFormatException e) {
							System.out.println("숫자를 입력해주세요.");
							continue;
						}
						if(select == 1) {
							//  글쓰기
							System.out.print("글 제목을 입력해주세요 : ");
							String title = sc.nextLine();
							System.out.print("글 내용을 입력해주세요 : ");
							String content = sc.nextLine();
							date = sdf.format(new Date());
							no = homepageService.getGeulList().size();
							HomepageVO temp = new HomepageVO((no+1), title, content, login.getMemId(), date);
							homepageService.insertGeul(temp);
							ArrayList<HomepageVO> geul = homepageService.getGeulList();
							for(int i = 0; i < geul.size(); i++) {
								for(int j = 0; j < geul.size()-1-i; j++) {
									int num1 = geul.get(j).getMem_no();
									int num2 = geul.get(j+1).getMem_no();
									if(num1 > num2) {
										HomepageVO temp2 = geul.get(j);
										geul.set(j, geul.get(j+1));
										geul.set(j+1, temp2);
									}
								}
							}
							for(int i = 0; i < geul.size(); i++) {
								System.out.println(geul.get(i));
							}
						}else if(select == 2) {
							// 글조회
							System.out.print("글 번호를 입력해주세요 : ");
							int num;
							try {
								num = Integer.parseInt(sc.nextLine());
							} catch (NumberFormatException e) {
								System.out.println("숫자를 입력해주세요.");
								continue;
							}
							HomepageVO search = homepageService.getGeulSearch(num);
							System.out.println("==========================");
							System.out.println("제목 : " + search.getMem_title());
							System.out.println("작성자 : " + search.getMem_author());
							System.out.println("작성일 : " + search.getMem_date());
							System.out.println("글내용 : " + search.getMem_content());
							System.out.println("==========================");
							
						}else if(select == 3) {
							System.out.println("로그아웃합니다");
							break;
						}else {
							System.out.println("1, 2, 3만 입력가능합니다.");
						}
					}
				}
				else {
					System.out.println("로그인 실패");
				}	
				
			}else if(cmd == 3) {
				System.out.println("종료합니다.");
				break;
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
		
		}
		
	} // main
}
