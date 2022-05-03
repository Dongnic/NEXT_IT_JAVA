package DongJun.submit12;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
	
	private ArrayList<Book> bookList = new ArrayList<>();
	private ArrayList<Book> returnList = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	private Library() {
	}
	private static Library instance = new Library();

	public static Library getInstance() {
		return instance;
	}
	// 책 목록 생성
	public void create() {
		String strBooks = "삼국지, 해리포터와 마법사의 돌, 해리포터와 비밀의 방 , 해리포터와 아즈카반의 죄수,"
				+ "해리포터와 불사조 기사단, 해리포터와 혼혈왕자, 해리포터와 죽음의 성물,"
				+ "어린왕자, 나의 라임 오렌지나무, 이것이 자바다, 좋은생각, 반지의 제왕: 반지 원정대, "
				+ "반지의 제왕: 두 개의 탑, 반지의 제왕: 왕의 귀환, 토익보카, 개미";
		String[] books = strBooks.split(",");
		for(int i = 0; i < books.length; i++) {
			bookList.add(new Book(bookList.size()+1, books[i].trim(), false));
		}
	}
	// 1. 책 반납 
	public void returnBook(int num){
		for(int i = 0; i < bookList.size(); i++) {
			Book x = bookList.get(i);
			if(x.getNo() == num) {
				if(x.isCheck()) {
					x.setCheck(false);
					System.out.println(x.getName() + "이 반납되었습니다.");
				}else
					System.out.println("이미 입고 중입니다.");
			}
		}
	}  
	// 2. 책 대여 - 책 이름
	public boolean search(String name) {
		returnList = new ArrayList<>();
		int count = 0;
		for(int i = 0; i < bookList.size(); i++) {
				Book x = bookList.get(i);
				if(x.getName().contains(name)) {
					returnList.add(x);
					count++;
				}
			}
			if(count == 1) {
				Book y = returnList.get(0);
				if(y.isCheck()) {
					System.out.println("이미 대여 중입니다.");
					return false;
				}else
				printserch();
				System.out.println("대여 하시겠습니까? 1. 예 | 그 외. : 취소");
				System.out.print(">>>");
				int cmd = Integer.parseInt(sc.nextLine());
					if (cmd == 1) {
						System.out.println(y.getName() + "을(를) 대여하셨습니다.");
						y.setCheck(true);
						return false;					
					}else {
						return false;
				}
			}else if (count == 0) {
				System.out.println("해당 이름의 책이 없습니다.");
				return false; // null
			}else
			printserch();
			return true;		
	}
	// 2. 책 대여 - 도서번호 
	public void rental(int num) {
		int count = 0;
		for(int i = 0; i < returnList.size(); i++) {
			count++;
			Book x = returnList.get(i);
			if(x.getNo() == num) {
				if(x.isCheck()) {
					System.out.println("이미 대여 중입니다.");	
				return;
				}else
				System.out.println(x.getName() + "을(를) 대여하셨습니다.");
				x.setCheck(true);
				return;
			}
		}
		if(count == returnList.size()) {
			System.out.println("해당 번호의 책이 없습니다.");
		}
		return;
	}
	// 3. 전체 책 출력
	public void print() {
		for( int i = 0; i < bookList.size(); i++) {
			System.out.println(bookList.get(i));
		}
	}
	// 3. 검색 책 출력
	public void printserch() {
		for( int i = 0; i < returnList.size(); i++) {
			System.out.println(returnList.get(i));
		}
	}
	// 4. 검색 리스트 
	public void google(String name) {
		for(int i = 0; i < bookList.size(); i++) {
			Book x = bookList.get(i);
			if(x.getName().contains(name)) {
				System.out.println(x);
			}
		}
	}
}
