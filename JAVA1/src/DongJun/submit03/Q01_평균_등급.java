package DongJun.submit03;
import java.util.Scanner;
public class Q01_평균_등급 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수를 입력해주세요.");
		System.out.print(">>>");
		int scoreKorean = Integer.parseInt(sc.nextLine());
		System.out.println("영어 점수를 입력해주세요.");
		System.out.print(">>>");
		int scoreEnglish = Integer.parseInt(sc.nextLine());
		System.out.println("수학 점수를 입력해주세요.");
		System.out.print(">>>");
		int scoreMath = Integer.parseInt(sc.nextLine());
		
		String grade = "";
		double scoreAvr = (double)(scoreKorean + scoreEnglish + scoreMath) / 3;
		System.out.println("평균 : " + scoreAvr);
		
		if(scoreAvr >= 90) {
			grade = "A";
		}else if(scoreAvr >= 80) {
			grade = "B";
		}else if(scoreAvr >= 70) {
			grade = "C";			
		}else
			grade = "D";
		System.out.println("등급: " + grade +"등급");
		sc.close();
	}

}
