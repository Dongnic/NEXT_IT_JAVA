package DongJun.submit06;
import java.util.Scanner;
public class Q01_명함만들기 {

	public static void main(String[] args) {

		makeCard();
	}

	static void makeCard() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.print("연락처를 입력하세요 : ");
		String number = sc.nextLine();
		System.out.print("이메일을 입력하세요 : ");
		String email = sc.nextLine();
		System.out.println("=============================");
		System.out.println("이름 : " + name);
		System.out.println("연락처 : " + number);
		System.out.println("이메일 : " + email);
		System.out.println("=============================");
	}
}
