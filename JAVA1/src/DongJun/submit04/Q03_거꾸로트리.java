package DongJun.submit04;
import java.util.Scanner;
public class Q03_거꾸로트리 {

	public static void main(String[] args) {
		
		String blank = "";
		String starTree = "";
		
		starTree = "*";
		blank = "";
		for(int i = 1; i <= 5; i++) {
			blank = "";
			for(int j = 4; j >= i; j--) {
				blank += " ";
			}
			System.out.println(blank + starTree);
			starTree += "**";
		}
		
		System.out.println("@ 크리스마스에 와인을 좀 마셨더니 트리가 거꾸로 보이네요");
		starTree = "";
		blank = "";
		int countStar = 9;
		for(int i = 5; i > 0; i--) {
			System.out.print(blank);
			for(int j = 1; j <= countStar; j++) {
				System.out.print("*");
			}
			blank += " "; 
			System.out.println(blank);
			countStar = countStar - 2;
		}	
		
		System.out.println("@ 조금 쉬었더니 다시 트리가 제대로 보이네요");
		
		starTree = "*";
		blank = " ";
		
		int countBlank = 4;
		for(int i = 5; i > 0; i--) {
			for(int j = 1; j <= countBlank; j++) {
				System.out.print(blank);
			}
			System.out.println(starTree);
			starTree += "**"; 
			countBlank = countBlank - 1;
		}	
		System.out.println("원하는 트리 층수를 입력 : ");
		Scanner sc = new Scanner(System.in);

		int countTree = Integer.parseInt(sc.nextLine());
		starTree = "*";
		blank = " ";
		countBlank = countTree - 1;
		for(int i = countTree ; i > 0; i--) {
			for(int j = 1; j <= (countBlank); j++) {
				System.out.print(blank);
			}
			System.out.println(starTree);
			starTree += "**"; 
			countBlank = countBlank - 1;
		}	
		
		sc.close();
	}

}
