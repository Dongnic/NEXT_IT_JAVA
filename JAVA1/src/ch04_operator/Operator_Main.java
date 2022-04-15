package ch04_operator;

public class Operator_Main {

	public static void main(String[] args) {

		int numTen = 10;
		System.out.println(numTen);
		
		// 증감 연산자
		numTen++;  // 1 증가
		System.out.println(numTen);
		numTen--;  // 1 감소
		System.out.println(numTen);

		++numTen; // 연산자를 앞에 붙여도 1 증가 
		System.out.println(numTen);
		System.out.println(numTen++); // numTen을 출력하고 1증가
		System.out.println(++numTen); // numTen을 1증가하고 출력 
		System.out.println(numTen);

		char hangul = 44032;
		System.out.println(hangul++); //가
		System.out.println(hangul++); //각
		System.out.println(hangul++); //갂
		System.out.println(hangul++); //갃
		System.out.println(hangul++); //간 
		
		System.out.println("======= 대입 연산자 =========");
		// 대입 연산자 숫자(2) 값을 연산하여 변수에 저장
		numTen = 10;
		
		numTen += 2; // 더하기 대입연산
		System.out.println(numTen); // 12
		numTen -= 3; // 빼기 대입연산
		System.out.println(numTen); //  9
		numTen *= 4; // 곱하기 대입연산
		System.out.println(numTen); // 36
		numTen /= 6; // 나누기 대입연산
		System.out.println(numTen); //  6
		numTen %= 5; // 나머지 값 대입연산
		System.out.println(numTen); //  1
		
		System.out.println("======= 산술 연산자 =========");
		// 산술 연산자 사칙연산, 나머지 값을 구하는 %연산자
		int numFir = 10;
		int numSec =  3;
		
		numFir = numFir + 1;
		System.out.println(numFir); //  11
		System.out.print("더하기 : ");
		System.out.println(numFir + numSec); //  14
		System.out.print("빼기 : ");
		System.out.println(numFir - numSec); //   8
		System.out.print("곱하기 : ");
		System.out.println(numFir * numSec); //   33
		System.out.print("나누기 몫 : ");
		System.out.println(numFir / numSec); //   3 (몫만 출력)
		System.out.print("나머지 : ");
		System.out.println(numFir % numSec); //   2 (나머지만 출력)
		  
		double temp = (double)numFir / numSec; // 실수로 출력하는 방법(형변환)
		System.out.print("나머지 : ");
		System.out.println(temp); //   3.66666665
		
		// ()를 붙여 사칙연산에 우선순위 부여
		int numThi = 10 + (3 * 10); // 사칙연산이 적용안됨;;
		System.out.print("numThi : ");
		System.out.println(numThi); // 40	
		
		System.out.println("======= 나머지 연산자 =========");
		// 나머지 연산자(%) 자주 쓰는 경우
		int anyNum = 6;		
		int remain = anyNum % 2; // 홀수/짝수 판별
		System.out.print("anyNum : ");
		System.out.println(remain); // 0
		System.out.println("0은 짝수, 1은 홀수 ");
		
		System.out.println("======= 페이지 구현 예제 =========");
		// 게시판 페이징 구현시 %2 사용 예제 
		int totalCountGul = 330;     // 총 게시글 수 
		int showCountOnePage = 15;  // 한 페이지당 보여지는 게시글 수 
		 
		System.out.print("총 게시글 수 : ");
		System.out.println(totalCountGul); // 
		System.out.print("한 페이지당 게시글 수 : ");
		System.out.println(showCountOnePage); //
		
		// 총 페이지의 수 
		// 나머지 글의 페이지도 있어야 하기 때문에 "올림" 처리해야함
		// 올림처리하는 함수 Math.ceil()
		int countPage = (int)Math.ceil((double)totalCountGul / showCountOnePage);
		System.out.print("총 페이지 수 : ");
		System.out.println(countPage); // 4
		// 마지막 페이지에 있는 글의 수
		int countLastPageGul = totalCountGul % showCountOnePage;
		System.out.print("마지막 페이지 글 수 : ");
		System.out.println(countLastPageGul); // 5
		
		System.out.println("======= 문자열 연산 =========");
		// 문자열 더하기
		String subway = "반석";
		subway = subway + " - 지족";
		System.out.println(subway); // 반석 - 지족
		subway = "종점 - " + subway;
		System.out.println(subway); // 종점 - 반석 - 지족
		subway += " - 노은";
		System.out.println(subway); // 종점 - 반석 - 지족 - 노은
		
		System.out.println("======= 비교 연산자 =========");
		// 비교 연산자
		int numFiv = 5;
		int numOne = 1;
		final double PI = 3.14; // 상수선언 앞에 final
		
		boolean boolVal = numFiv > numOne;
		System.out.print(numFiv + " > " + numOne + " : ");
		// 5 > 1 : 
		System.out.println(boolVal); // true
		boolVal = numFiv < PI;
		System.out.print(" : ");
		System.out.println(boolVal); // false

		System.out.println(10 >= 10); // true
		System.out.println(10 <=  9); // false

		System.out.println(10 == 10); // true
		System.out.println(10 != 9); // false

		System.out.println("======= 비교 연산자(문자열) =========");
		
		String ship ="배";
		String pear ="배";
		String stomach = new String("배");
		System.out.println(ship == pear);  // true 저장된 주소값과 값이 같음
		System.out.println(ship == stomach); // false 값은 같지만 주소값을 비교하기 때문
		System.out.println(stomach == pear); // false
		System.out.println(ship.hashCode()); 
		System.out.println(pear.hashCode()); 
		System.out.println(stomach.hashCode()); 
		
		System.out.println("======= .equals(문자열) =========");
		// .equals(문자열)
		// 해당 문자열이 괄호 안 문자열과 같다면 true 다르면 false 리턴
		// (저장된 값 기준)
		System.out.println(pear.equals(stomach)); 
		
		String ssamMental = null;
		System.out.println(ssamMental == null);
		
		ssamMental = "";
		System.out.println(ssamMental.equals("")); // true
		System.out.println(ssamMental.length() == 0); // true
		System.out.println(ssamMental.isEmpty()); // true
		
		System.out.println("======= 삼항 연산자 (조건 연산자) ========");
		// 삼항 연산자 (조건 연산자)
		
		String stuMental = "100";
		String state = (stuMental.isEmpty()) ? "비었어요" : "들어있어요";
//		                  =true or false 값   =true일 경우  =false일 경우 
		System.out.println(state); // 들어있어요
	
		int stateNum = (stuMental.length() > 0) ? 100 : 0;
		System.out.println(stateNum); // 100 
		
		// 이중 삼항 연산자
		int score = 80;
		
		// score가 90점 이상 grade A 80점 이상 B 나머지 C 
		String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : "C";
		System.out.println(grade); // B 
		
		System.out.println("======= 논리 연산자 ========");
		// 논리 연산자 
		ssamMental = "50";
		stuMental = "";
	
		// && and(논리곱) 좌우 조건이 전부 참이어야만 true 하나라도 거짓이면 false 리턴
		System.out.println(ssamMental.isEmpty()); // false
		System.out.println(stuMental.isEmpty());  // true
		System.out.println(ssamMental.isEmpty() && stuMental.isEmpty());  // false
		System.out.println(ssamMental.length() > 0 && stuMental.isEmpty()); // true
		
		// || or(논리합) 좌우 조건이 하나라도 참이면 true 전부 거짓이면 false 리턴
		System.out.println(ssamMental.isEmpty() || stuMental.isEmpty()); // true
		
		int numTwo = 2 ;
		int numThree = 3 ;
		int numFour = 4 ;
		
		// 예제 2 < 3 < 4
		System.out.println((numTwo < numThree) && (numThree < numFour)); // true 
		
		// 회원가입 예시
		String name = "찬웅쌤";
		String phone = "01073987332";
		int age = 30;
		
		// name 값이 empty면 안되고 
		// phone 값이 10~11자리여야 하고
		// age 값이 14 이상이어야 함.
//		boolean checkName = name.isEmpty();
		boolean checkName = name.length() > 0;
		boolean checkPhone = (phone.length() == 10) || (phone.length() == 11);
		boolean checkAge = age >= 14;
		System.out.println(checkName && checkPhone && checkAge);

		// ! not(부정) true -> false로 false -> true로
		boolean checkName1 = !name.isEmpty(); // 비어있지 않으면 true
		System.out.println(checkName1); // true
		System.out.println("======= 비트 연산자 ========");
		// 비트연산자
		int bitTen = 10;  // 1010
		int bitNine = 9;  // 1001
		
		// & AND
		System.out.println(bitTen & bitNine); // 둘다 1일경우 1 아니면 0 
		// 8 -> 1000
		 
		// | OR
		System.out.println(bitTen | bitNine); // 하나라도 1이면 1 전부 아니면 0 
		// 11 -> 1011

		// ^ XOR
		System.out.println(bitTen ^ bitNine); // 두 개가 다르면 1 같으면 0 
		// 3 -> 0011 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
