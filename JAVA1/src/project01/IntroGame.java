package project01;

import java.util.Scanner;

import project01.Game_Graph.Game_Graph;
import project01.Game_IndianPoker.Game_IndianPoker;

public class IntroGame {
	
	static String ten = "     ";
	static String title = ten + ten + "  머니 랜드 " + ten;
	static String indianPoker = ten + ten + "    포커" + ten; 
	static String escape = ten + ten + "    탈출  " + ten; 
	static String topwall = ten + "┏━━━━━━━━┓  ┏━━━━━━━━┓"; 
	static String btmwall = ten + "┗━━━━━━━━┛  ┗━━━━━━━━┛"; 
		
	public static boolean Intro() {
	Game_IndianPoker idpk = new Game_IndianPoker();	
	Game_Graph gp = new Game_Graph();
	String[][] blank = new String[7][20];
	blank = createBlank();
	Scanner sc = new Scanner(System.in);
	while(1<2) {
		System.out.println("\n"+"\n"+"\n"+"\n"+"\n");
		System.out.println(title+"\n");
		System.out.println(indianPoker);
		System.out.println(topwall);
		
		System.out.print(ten + "┃");
		printArray(blank,0);
		System.out.println("┃  ");
		System.out.print(ten + "┃");
		printArray(blank,1);
		System.out.println("┃  ");
		System.out.print(ten + "┗");
		printArray(blank,2);
		System.out.println("┛  ");
		System.out.print("노동  ");
		printArray(blank,3);
		System.out.println("  도박");
		System.out.print(ten + "┏");
		printArray(blank,4);
		System.out.println("┓  ");
		System.out.print(ten + "┃");
		printArray(blank,5);
		System.out.println("┃  ");
		System.out.print(ten + "┃");
		printArray(blank,6);
		System.out.println("┃  ");
		System.out.println(btmwall);
		System.out.print(escape);
		System.out.println("종료 Q");
		String cmd = sc.nextLine();
		if(cmd.equals("Q")||cmd.equals("q")) {
			return false;
		}
		if(cmd.equals("a")||cmd.equals("ㅁ")) {
			moveLeft(blank);
		}else if(cmd.equals("d")||cmd.equals("ㅇ")) {
			moveRight(blank);
		}else if(cmd.equals("w")||cmd.equals("ㅈ")) {
			moveTop(blank);
		}else if(cmd.equals("s")||cmd.equals("ㄴ")) {
			moveBottom(blank);
		}else {
			System.out.println("다시입력");
		}
		
		if(blank[0][10].equals("O") || blank[0][9].equals("O")) {
			System.out.println("포커");
			while(idpk.start()) {}
		}
		if(blank[6][10].equals("O") || blank[6][9].equals("O")) {
			System.out.println("탈출");
		}
		if(blank[3][0].equals("O")) {
			System.out.println("노동");
		}
		if(blank[3][19].equals("O")) {
			System.out.println("도박");
			while(gp.start()) {}
		}
		
	} // while

}
	public static void printTotalArray(String[][] x) {
		for(int i=0; i<7; i++) {
			for(int j=0; j<20; j++) {
				System.out.print(x[i][j]);
			}
			System.out.println();
		}	
	}
	public static void printArray(String[][] x, int y) {
			for(int j=0; j<20; j++) {
				System.out.print(x[y][j]);
			}
	//		System.out.println();
		}	
	public static void moveLeft(String[][] x) {
		for(int i=0; i<7;i++) {
			for(int j=0; j<20; j++) {
				if(x[i][j].equals("O")) {
					if(j > 1) {
						x[i][j-2] = "O";
						x[i][j] = " ";
					}else {
						x[i][j] = " ";
						x[i][0] = "O";
					}
					return;
				}
			}
		}
	}
	public static void moveRight(String[][] x) {
		for(int i=0; i<7;i++) {
			for(int j=0; j<20; j++) {
				if(x[i][j].equals("O")) {
					if(j < 18) {
						x[i][j+2] = "O";
						x[i][j] = " ";
					}else {
						x[i][j] = " ";
						x[i][19] = "O";
					}
						return;
				}
			}
		}
	}
	public static void moveTop(String[][] x) {
		for(int i=0; i<7;i++) {
			for(int j=0; j<20; j++) {
				if(x[i][j].equals("O")) {
					if(i > 0) {
						x[i-1][j] = "O";
						x[i][j] = " ";
					}else {
						x[i][j] = " ";
						x[0][j] = "O";
					}
						return;
				}
			}
		}
	}
	public static void moveBottom(String[][] x) {
		for(int i=0; i<7;i++) {
			for(int j=0; j<20; j++) {
				if(x[i][j].equals("O")) {
					if(i < 6) {
						x[i+1][j] = "O";
						x[i][j] = " ";
					}else {
						x[i][j] = " ";
						x[6][j] = "O";
					}
					return;
				}
			}
		}
	}
	public static String[][] createBlank() {
		String[][] blank = new String[7][20];
		for(int i=0; i<7; i++) {
			for(int j=0; j<20; j++) {
				if(i==3 && j==10) {
					blank[i][j] ="O";
				}else {
					blank[i][j] =" ";
				}
			}
		}	
		return blank;
	}
}
