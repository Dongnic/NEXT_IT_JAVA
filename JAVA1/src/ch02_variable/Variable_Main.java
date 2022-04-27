package ch02_variable;

public class Variable_Main {

	public static void main(String[] args) {
		// 변수의 선언 
		
		// 변수의 선언과 함께 값을 초기화
		// Initialization = init
		int numOne = 1;
		
		int numTwo;		// 변수의 선언
		numTwo =2 ;		// 변수의 초기화
		
		// 변수의 다중 선언
		int numThree, numFour ;
		numThree = 3;
		numFour = 4;
		
		// 다중선언 가능하지만 초기화는 동시에 불가
		
		System.out.println(numOne);
		
		// 변수의 값 변경
		numOne = 10;
		System.out.println(numTwo);
		
		// 상수의 선언
		final double MATH_PI = 3.141592;
		System.out.println(MATH_PI);
		System.out.println("===================\n");
		
		// 문자열 String
		// 문자열은 클래스이므로, 다양한 메소드를 내장
		// 문자열은 쌍따옴표("") 안에 문자들을 말한다.
		// '가'는 char 타입 "가"와 문자열과 타입이 다르다
		String fruits = "Apple, Banana, Cherry";
		System.out.println(fruits);
		
		// .length()
		// 해당 문자열의 길이를 리턴 
		System.out.println(fruits.length());
		System.out.println("abcde".length());
		
		// .charAt(인덱스)
		// 인덱스는 배열, 문자열에서 몇번째에 해당하는 숫자를 의미한다.
		// 인덱스는 0부터 시작(인덱스 0 = 첫번째)
		// 해당 문자열에서 인덱스에 해당하는 문자(char)를 리턴한다.
		System.out.println("--------------------");
		char alphaP = fruits.charAt(1);
		String pp = "p";
		System.out.println(alphaP);
		boolean a = false;
		if (fruits.charAt(1) == fruits.charAt(1)) {
			a = true;
		}
		System.out.println(a);
		System.out.println("--------------------");
		// .indexOf(문자열)
		// 해당문자열에서 괄호 안에 있는 문자의 인덱스를 리턴
		System.out.println(fruits.indexOf("Banana"));
		System.out.println(fruits.indexOf("B"));
		// 해당문자열을 포함하지 않으면 -1 리턴 
		System.out.println(fruits.indexOf("banana"));
		
		
		// 변수를 사용하는 이유 = 수정이 용이
		
		// 콘솔창에 10을 10번 출력
		int numTen = 10;
		System.out.println(numTen);
		// 값에 이름을 부여할 수 있다.
		
		// .substring (시작 인덱스, 끝 인덱스)
		// 해당 문자열을 시작 인덱스에서 끝 인덱스 전까지 자른다.
		System.out.println(fruits.substring(0, 5));
		// 만약 시작 인덱스만 넣을 경우 해당 문자열을 시작 인덱스부터 끝까지 자른다.
		System.out.println(fruits.substring(15));
		int cherryIndex = fruits.indexOf("e");
		
		System.out.println(fruits.substring(cherryIndex));
		System.out.println("========");
		System.out.println(fruits.substring(fruits.indexOf("Banana")));
		
		// .replace("바꿔야 하는 문자열", "바꿀 문자열")
		// 해당 문자열에서 문자열을 교체
		System.out.println(fruits.replace("Apple", "Abocado"));
	    // String 객체의 메소드 실행시 원본은 변하지 않는다.
//		fruits = fruits.replace("Apple", " Abocado");
//		System.out.println(fruits);
		
		// .trim()
		// 해당 문자열의 양 끝에 존재하는 모든 공백 문자를 제거해준다.
		System.out.println(fruits.trim());
		
		// .toUpperCase() 해당 문자열의 모든 알파벳을 대문자로 변경
		// .toLowerCase() 해당 문자열의 모든 알파벳을 소문자로 변경
		System.out.println(fruits.toUpperCase());
		System.out.println(fruits.toLowerCase());
		
		// .concat("문자열")
		// 해당 문자열 뒤에 괄호 안에 있는 문자열을 붙인다.
		System.out.println(fruits.concat(", Durian"));
		// +로도 가능 
		System.out.println(fruits + ", Durian");
//		fruits = fruits + ", Durian";
//		System.out.println(fruits);
		
		System.out.println("--------------------");
		
		// String은 참조타입이므로 null 값을 가질 수 있다.
		// 참조 타입의 변수를 객체 또는 인스턴스라고 부른다.
		String nothing = ""; // 빈 값을 empty라고 부른다.
		System.out.println(nothing);
		
		String nullthing = null;
		System.out.println(nullthing);
		// null은 그 자체로 빈 값이기 때문에 메모리 내의 스택 -> 힙구조로 가지 않는다.
		// 따라서 어떠한 메소드도 사용 불가
		System.out.println("--------------------\n");
		
		// 문자(char)
		// 작은따옴표('') 안에 한 문자를 담을 수 있으며 숫자 또한 담을 수 있다.
		// 이떄의 숫자는 유니코드에 등록된 각 문자들에 대한 넘버링이다.
		char wordA = 'A';
		System.out.println(wordA);
		char numA = 65;		// A
		System.out.println(numA);
		
		char hangul = 44032; // 가
		System.out.println(hangul);
		
		// byte 는 -128 ~ 127까지만 담을 수 있다.
		byte byteNum = 127;
		byteNum++; // +1 연산
		byteNum += 1; // +1 연산
		System.out.println(byteNum);
		
		
		// 형 변환(Casting)
		// 형 변환이 가능한 경우에는 형 변환을 이용해 상황에 맞게 사용
		int intVal = 15;
		double doubleVal = 1.23;
		System.out.println(intVal * doubleVal);
		// int X double 는 double 타입이므로 자동 형 변환 된다.
		double mulResult = intVal * doubleVal;
		
		// int X float 도 자동 형 변환 된다.
		float floatRslt = intVal * 2.34f;
		
		// int 20000이 long으로 자동 형변환되어 담긴것
		long longVal = 20000;
		
		// int + 문자열(String)는 int가 문자열로 자동 형 변환 된다. (이어붙인 형태)
		String countStar = "비오";
		String addCountStar = countStar + 100;
		System.out.println(addCountStar);
		
		// 강제 형 변환
		// (타입) 값을 이용하여 값을 해당 타입으로 강제 형 변환 할 수 있다. 
		float floatNum = (float) (10 * 3.14);
		
		// 가장 많이 하는 실수
		double result = 10 / 3; // = 3.0
		// 해결방법
		result = (double)10 / 3; // = 3.33333333
		result = 10 / 3d; // = 3.3333333
		result = 10 / 3.0; // = 3.3333333
		
		System.out.println(result);
		
		// 숫자 문자열과 숫자간의 형 변환
		String strNum = "101";
		System.out.println(strNum + 2);
		
		// Integer.parseInt(숫자 문자열)
		// 문자열을 정수로 형 변환 
		int intNum = Integer.parseInt(strNum);
		System.out.println(intNum + 2);		
		
		// .toString()
		// 정수를 문자열로 형 변환 
//		String strNumCast = Integer.toString(intNum);
		String strNumCast = intNum + ""; // 위와 같지만 더 보편적 방법 		
		System.out.println(strNumCast + 2);
		int c = -8;
		String b = c + "";
		System.out.println(b);
		// 실수 문자열을 실수로 형 변환
		strNum = "50.23";
		double doubleNum = Double.parseDouble(strNum);
		System.out.println(doubleNum + 5);

		
	}

}
