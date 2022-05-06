package DongJun.submit12;

import java.util.Scanner;

public class LibraryMain {

	public static void main(String[] args) {
		Library library = Library.getInstance();
		library.create();
		
		Scanner sc = new Scanner(System.in);
		while(true) {
		
			welcome();
			int command = Integer.parseInt(sc.nextLine());
			
			// 책 입고 
			if(command == 1) {
				library.print();
				inputNo();
				int no = Integer.parseInt(sc.nextLine());
				library.returnBook(no);
			}
			// 책 대여 
			else if(command == 2) {
				library.print();
				inputName();
				String name = sc.nextLine();
				
				// 검색한 책이 없거나 1개만 있어 대여에 성공했을 시 
				if(!library.search(name)) {
					end();
				}
				// 검색한 책이 여러 개일 경우 
				else {
//				library.printserch();
				inputNo();
				int select = Integer.parseInt(sc.nextLine());
				library.rental(select);					
				}
			}
			// 책 목록
			else if(command == 3) {
				library.print();
			}
			// 책 검색 
			else if(command == 4) {
				// 책 검색
				inputName();
				String name = sc.nextLine();
				library.google(name);
			}
			// 종료 
			else if(command == 5) {
				end();
				break;
			}
		}
	} // main
	static void welcome(){
		System.out.println("==== NEXT LIBRARY ====");
		System.out.println("무엇을 하시겠습니까?");
		System.out.println("1. 책 반납 | 2. 책 대여"
				               + " | 3. 책 목록 | 4. 책 검색 | 5. 종료");
		System.out.print(">>>");
	}
	static void inputNo() {
		System.out.print("책 번호를 입력해주세요");
		System.out.print(">>>");
	}
	static void inputName() {
		System.out.println("책 이름을 입력해주세요");
		System.out.print(">>>");
	}
	static void end() {
		System.out.println("프로그램이 종료되었습니다");
	}
}
