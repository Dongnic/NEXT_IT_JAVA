package ch14_jdbc_jsp;

import java.util.ArrayList;
import java.util.Scanner;

import ch14_jdbc_jsp.model.StudentVO;
import ch14_jdbc_jsp.model.WordGameVO;
import ch14_jdbc_jsp.service.StudentService;
import ch14_jdbc_jsp.service.WordGameService;

public class KoongPaGo {

	public static void main(String[] args) {
		StudentService stuService = StudentService.getInstance();
		WordGameService wordService = WordGameService.getInstance();
		ArrayList<WordGameVO> wordGameList = wordService.getWordList();
		ArrayList<String> wordList = new ArrayList<>();
		for(int i=0; i<wordGameList.size(); i++) {
			wordList.add(wordGameList.get(i).getWords());
		}
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("무엇을 하시겠습니까?");
			System.out.println("1. 로그인 | 2. 회원가입 | 3. 종료");
			System.out.print(">>>");
			
			int cmd = 0;
			try {
				cmd = Integer.parseInt(sc.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력해주세요.");
				continue;
			}
			
			if(cmd == 1) {
				// TODO 로그인()
				System.out.println("이이디를 입력해주세요");
				System.out.print(">>>");
				String id = sc.nextLine();
				System.out.println("비밀번호를 입력해주세요");
				System.out.print(">>>");
				String pw = sc.nextLine();
				
				StudentVO login = stuService.loginStu(id);
				if(pw.equals(login.getStupassword())) {
					System.out.println(login.getStuname() + "님 환영합니다.");
					
					while(true) {
						System.out.println("==== 끝말잇기 ====");
						System.out.println("행동을 선택해주세요");
						System.out.println("1. 게임시작 | 2. 랭킹 | 3. 로그아웃");
						System.out.print(">>>");
						int select = 0;
						
						try {
							select = Integer.parseInt(sc.nextLine());
						} catch (NumberFormatException e) {
							System.out.println("숫자를 입력해주세요.");
							continue;
						}
						
						if(select == 1) {
							// TODO 시작
							int randInt = (int)(Math.random() * wordList.size());
							String computerWord = wordList.get(randInt);
							System.out.println("제시어 : " + computerWord);
							
							while(1<2) {
								System.out.print(">>>");
								String inputText = sc.nextLine();
								// 1. inputText의 앞글자가 computerWord의 뒷글자와 같나
								boolean checkOne = inputText.substring(0, 1)
										.equals(computerWord.substring(computerWord.length()-1));
								// 2. inputText가 wordList에 포함되어 있는 단어냐
								boolean checkTwo = wordList.contains(inputText);
								// 3. 중복 단어 
								if(checkOne && checkTwo) {
									// TODO 성공 
									// 컴퓨터 차례 
									// inpuText의 마지막 자리로 시작하는 단어를
									// wordList에서 꺼내기
									
									// 컴퓨터가 대답할 수 있는 단어 목록 
									ArrayList<String> possibleList = new ArrayList<>();
									for(int i = 0; i < wordList.size(); i++) {
										if(wordList.get(i).substring(0,1)
												.equals(inputText.substring(inputText.length()-1)));
											possibleList.add(wordList.get(i));
									}
									if(possibleList.size() == 0) {
										System.out.println("승리하셨습니다.");
										login.setStuScore(login.getStuScore() + 10);
										stuService.updateStu(login);
									}
									
									int randIdx=(int)(Math.random() * possibleList.size());
									computerWord = possibleList.get(randIdx);
									System.out.println("제시어 : " + computerWord);
								}else {
									System.out.println("패배하셨습니다.");
									login.setStuScore(login.getStuScore() - 1);
									stuService.updateStu(login);
									break;
								}
							} // while문
						}else if(select == 2) {
							// TODO 랭킹
							ArrayList<StudentVO> rank = stuService.getStuList();
							for(int i = 0; i < rank.size(); i++) {
								System.out.println((i+1) + "등" + rank.get(1));
							}
							
						}else if(select == 3) {
							System.out.println("로그아웃합니다");
							break;
						}else {
							System.out.println("1, 2, 3만 입력가능합니다.");
						}
					}
					
				}else {
					System.out.println("로그인 실패");
				}
			}else if(cmd == 2) {
				// TODO 회원가입
				System.out.println("이이디를 입력해주세요");
				System.out.print(">>>");
				String id = sc.nextLine();
				System.out.println("이름을 입력해주세요");
				System.out.print(">>>");
				String name = sc.nextLine();
				System.out.println("비밀번호를 입력해주세요");
				System.out.print(">>>");
				String pw = sc.nextLine();
				
				StudentVO temp = new StudentVO(id, name, pw, 0);
				
				stuService.insertStu(temp);
				
			}else if(cmd == 3) {
				System.out.println("종료합니다.");
				break;
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
			
		}
		
	}

}
