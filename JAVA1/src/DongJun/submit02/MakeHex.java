package DongJun.submit02;
import java.util.Scanner;
public class MakeHex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요: ");
		int inputnum = Integer.parseInt(sc.nextLine());
		int numVal = 0;
		int numSub = 0;
		if (inputnum >= 16) {
			for(;inputnum >= 16 ; inputnum -= 16)
			numVal++;
				if(inputnum == 16) {
					numSub = 0;
				}else {
					numSub = inputnum;
				}
		}
		else if(inputnum == 16) {
			numSub = 0;
		}else {
			numSub = inputnum;
		}
		System.out.println("몫 : " + numVal + " 나머지 : " + numSub);
		sc.close();

	
	}

}
/* num1 / 16 의 
 * 몫을 quotient 몫의 값에 
 * 나머지를 remainder (나머지에 16진수를 매칭)
   
 * 010010011
 * 100101111
 * 
 * 128
 * 256
 * 
 * 
*/