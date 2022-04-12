package ch02_variable;

public class Variable_Name {
	// 프로젝트 이름은 앞에 대문자를 쓴다.
	// 단어의 구분은 대문자 ex) JavaDong

	// 패키지 이름은 전부 소문자로 쓴다.
	// 단어의 구분은 언더바(_) 추가 ex) variable_name
		
	// 클래스 이름은 프로젝트 이름과 동일

	// 변수명 짓기
	// 카멜(Camel 방식)
	int todayIsHappy = 0;
	// 스네이크 방식
	int today_is_happy = 0;
	// 헝가리안 방식
	int intTodayISHappy = 0;
	String strTodayIsHappy = "행복해~";
	// 변수일때는 변수명 앞에 v_를 붙이고,
	// 함수일때는 함수명 앞에 f_를 붙이고,
	// 파라미터 변수에는 앞에 p_를 붙이는 방식 
	int v_todayIsHappy = 0;
	
	// 변수명 규칙 
	// 변수명 중첩 불가
	
	// 공백문자나 특수문자는 변수명에 사용불가
	// ex) int today is happy = 0; , today%$ = 0;
	
	// 영어 대소문자를 구분한다.
	int TodayIsHappy = 0;
	
	// 맨 앞에 숫자를 쓸 수 없다.
	// ex) int 2today = 0;
	// 맨 앞에 $, _ 기호는 쓸 수 있다.
	// 글자 수의 제한은 없다.
	// 자바 예약어 사용불가 ex) int, void, if..
	
	// 상수명 짓기
	// 단어 전부 대문자를 사용한다.
	// 단어 사이에 언더바(_) 표기
	final String NEXT_IT_ADDRESS = "대전 희영빌딩 2층";
	
	
	
	
	
	
}
