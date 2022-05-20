package ch12_exception;

import java.util.Scanner;

public class TryWithResource {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.print(">>>");
			String inputText = sc.nextLine();
			System.out.println(inputText);
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
//			sc.close();
		}
		
		// try-with-resource구문
		// 닫아야할 객체를 try()괄호 안에 선언 후
		// try 블록{}내에서 해당 객체를 사용
		// 객체의 클래스는 AutoCloseable 인터페이스를 구현하고 있어야함
		
		try(Scanner sc1 = new Scanner(System.in)){
			System.out.print(">>>");
			String inputText = sc1.nextLine();
			System.out.println(inputText);
		}
		// catch를 안써도 됨
		
		// 객체 여러개 선언
		try(Scanner sc2 = new Scanner(System.in);
				Scanner sc3 = new Scanner(System.in);){
			System.out.print(">>>");
			String inputText = sc2.nextLine();
			String inputText1 = sc3.nextLine();
			System.out.println(inputText);
			System.out.println(inputText1);
		}
	}

}
