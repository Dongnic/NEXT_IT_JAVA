package ch09_class.worldCup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WorldCupMain {

	public static void main(String[] args) {
		// 이상형 월드컵
		
		ArrayList<Menu> menuList = new ArrayList<>();
		menuList.add(new Menu("짜장면"));
		menuList.add(new Menu("짬뽕"));
		menuList.add(new Menu("볶음밥"));
		menuList.add(new Menu("김치찌개"));
		menuList.add(new Menu("제육볶음"));
		menuList.add(new Menu("돈까스"));
		menuList.add(new Menu("카레"));
		menuList.add(new Menu("김밥"));
		menuList.add(new Menu("라면"));
		menuList.add(new Menu("순대국밥"));
		menuList.add(new Menu("냉면"));
		menuList.add(new Menu("삼겹살"));
		menuList.add(new Menu("생선구이"));
		menuList.add(new Menu("소고기국밥"));
		menuList.add(new Menu("햄버거"));
		menuList.add(new Menu("밀면"));
		
		Scanner sc = new Scanner(System.in);
		playWorldCup(menuList);
//		// 16강
//		// 인덱스 0 vs 1, 2 vs 3 ... 14 vs 15
//		
//		System.out.println("16강");
//		for(int i = 0; i < menuList.size(); i += 2) {
//			System.out.println("메뉴를 선택해주세요");
//			System.out.println("1. " + menuList.get(i).getName() + " | 2. " + menuList.get(i+1).getName());
//			System.out.print(">>>");
//			
//			int command = Integer.parseInt(sc.nextLine());
//			
//			if(command == 1) {
//				menuList.get(i).setSelect(true);
//			}else if(command == 2){
//				menuList.get(i+1).setSelect(true);				
//		
//			}
//		}
//		
//		// 16강이 끝나고 선택받은 메뉴들만 8강으로 진출
//		
//		ArrayList<Menu> menuList8 = new ArrayList<>();
//		for(int i = 0; i < menuList.size(); i++) {
//			if(menuList.get(i).isSelect()) {
//				menuList8.add(menuList.get(i));
//			}
//		}
//		
//		for(int i = 0; i < menuList8.size(); i++) {
//			menuList8.get(i).setSelect(false);
//			System.out.println(menuList8.get(i));
//		}
//	
//		// 8강
//		System.out.println("8강");
//		for(int i = 0; i < menuList8.size(); i += 2) {
//			System.out.println("메뉴를 선택해주세요");
//			System.out.println("1. " + menuList8.get(i).getName() + " | 2. " + menuList8.get(i+1).getName());
//			System.out.print(">>>");
//			
//			int command = Integer.parseInt(sc.nextLine());
//			
//			if(command == 1) {
//				menuList8.get(i).setSelect(true);
//			}else if(command == 2){
//				menuList8.get(i+1).setSelect(true);				
//			}
//		}
//		
//		//  8강이 끝나고 선택받은 메뉴들만 4강으로 진출
//		ArrayList<Menu> menuList4 = new ArrayList<>();
//		for(int i = 0; i < menuList8.size(); i++) {
//			if(menuList8.get(i).isSelect()) {
//				menuList4.add(menuList.get(i));
//			}
//		}
//		
//		for(int i = 0; i < menuList4.size(); i++) {
//			menuList4.get(i).setSelect(false);
//			System.out.println(menuList4.get(i));
//		}
//	
//		// 4강
//		System.out.println("4강");
//		for(int i = 0; i < menuList8.size(); i += 2) {
//			System.out.println("메뉴를 선택해주세요");
//			System.out.println("1. " + menuList4.get(i).getName() + " | 2. " + menuList4.get(i+1).getName());
//			System.out.print(">>>");
//			
//			int command = Integer.parseInt(sc.nextLine());
//			
//			if(command == 1) {
//				menuList4.get(i).setSelect(true);
//			}else if(command == 2){
//				menuList4.get(i+1).setSelect(true);				
//			}
//		}
//		
//		//  8강이 끝나고 선택받은 메뉴들만 4강으로 진출
//			ArrayList<Menu> menuList2 = new ArrayList<>();
//			for(int i = 0; i < menuList4.size(); i++) {
//				if(menuList4.get(i).isSelect()) {
//					menuList2.add(menuList.get(i));
//				}
//			}
//			
//			for(int i = 0; i < menuList2.size(); i++) {
//				menuList2.get(i).setSelect(false);
//				System.out.println(menuList2.get(i));
//			}
//		// 2강
//		System.out.println("2강");
//		for(int i = 0; i < menuList4.size(); i += 2) {
//			System.out.println("메뉴를 선택해주세요");
//			System.out.println("1. " + menuList2.get(i).getName() + " | 2. " + menuList2.get(i+1).getName());
//			System.out.print(">>>");
//			
//			int command = Integer.parseInt(sc.nextLine());
//			
//			if(command == 1) {
//				menuList2.get(i).setSelect(true);
//			}else if(command == 2){
//				menuList2.get(i+1).setSelect(true);				
//			}
//		}
//		// 우승
//		ArrayList<Menu> menuList1 = new ArrayList<>();
//		for(int i = 0; i < menuList2.size(); i++) {
//			if(menuList2.get(i).isSelect()) {
//				menuList1.add(menuList.get(i));
//			}
//		}
//		for(int i = 0; i < menuList1.size(); i++) {
//			System.out.println(menuList1.get(i).getName());
//		}
			
	}// main
	
	static void playWorldCup(ArrayList<Menu> menuList) {
		// 16강
		// 인덱스 0 vs 1, 2 vs 3 ... 14 vs 15
		Scanner sc = new Scanner(System.in);
		// 리스트 내부 순서 섞기
		Collections.shuffle(menuList);
		
		if(menuList.size() == 2) {
			System.out.println("결승");
		}else
		System.out.println(menuList.size() + "강");
		for(int i = 0; i < menuList.size(); i += 2) {
			System.out.println("메뉴를 선택해주세요");
			System.out.println("1. " + menuList.get(i).getName() + " | 2. " + menuList.get(i+1).getName());
			System.out.print(">>>");
			
			int command = Integer.parseInt(sc.nextLine());
			
			if(command == 1) {
				menuList.get(i).setSelect(true);
			}else if(command == 2){
				menuList.get(i+1).setSelect(true);				
			}
		}
		
		// 16강이 끝나고 선택받은 메뉴들만 8강으로 진출
		ArrayList<Menu> menuList8 = new ArrayList<>();
		for(int i = 0; i < menuList.size(); i++) {
			if(menuList.get(i).isSelect()) {
				menuList8.add(menuList.get(i));
			}
		}
		for(int i = 0; i < menuList8.size(); i++) {
			menuList8.get(i).setSelect(false);
		}	
		// 재귀함수
		if(menuList8.size() == 1) {
			System.out.println("우승 : " + menuList8.get(0).getName());
		}else {
			playWorldCup(menuList8);
		}
	}
	
}
