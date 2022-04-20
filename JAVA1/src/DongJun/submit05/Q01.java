package DongJun.submit05;
import java.util.Scanner;
public class Q01 {

	public static void main(String[] args) {

		System.out.println("1 ~ 50 UP DOWN 게임 ");
		int count = 5;	
		int winning_Number = (int) (Math.random() * 50) + 1;
	    outer: while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("숫자를 입력해주세요 : ");
			int inputNum = Integer.parseInt(sc.nextLine());
			
				if(inputNum > winning_Number) {
					count --;
					System.out.println("다운!! 기회가 " + count + "번 남았습니다.");				
				}else if(inputNum < winning_Number && inputNum > 0 ) {
					count --;
					System.out.println("업!! 기회가 " + count + "번 남았습니다.");
				}else if(inputNum == winning_Number) {
					System.out.println("정답입니다.");	
					break outer;
				}else {
					System.out.println("1 ~ 50 사이의 수를 입력하세요");				
				}
			
				if(count == 0){
					System.out.println("실패하였습니다. 정답은 " + winning_Number + "입니다");
					break outer;
				}
		
		}
	}

}
