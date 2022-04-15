package ch05_control_flow;
import java.util.Scanner;

public class Conditional {

	public static void main(String[] args) {
		// 조건문
		
		// if문
		int price = 30000;
		int myMoney = 10000;
		
		if(myMoney > price) {
			System.out.println("구매했습니다. ");
		}
		
		if(myMoney < price) {
			System.out.println("돈이 부족합니다. ");
		}
		
		// 블록 {}안 명령어가 한 줄이면 생략가능
		if(myMoney < price) 
			System.out.println("돈이 부족합니다. ");
		
		System.out.println("===================================");
		
		// 변수의 사용범위(Scope)
		String review = "맛있어요~";
		String warning = "";
		if(review.length() < 12) {
			warning = "리뷰는 12글자 이상 작성하세요.";
		}
		
		// {} 중괄호 안에 선언된 변수 (지역 변수)
		// 해당 중괄호 안에서만 사용가능 
		// Class 중괄호 안에서 선언된 변수(전역 변수)
		// 해당 클래스 내에 사용 가능 
		System.out.println("리뷰 : " + review);
		System.out.println("오류 : " + warning);
		
		int intVal = 0;
		
		if(intVal < 0) {
			System.out.println("intVal가 0보다 작다.");
		} else if(intVal == 0) {
			System.out.println("intVal가 0이다.");			
		} else {
			System.out.println("intVal가 0보다 크다.");						
		}
		
		System.out.println("===================================");
		
		// 웹 브라우저에서 사용자가 로그인을 하면
		// 해당 브라우저의 세션 스토리지에 로그인 정보를 저장,
		// 이 정보를 이용해서 로그인 된 화면 혹은 안된 화면을 보여줌
		
		String userInfo = "";
		
		if(userInfo != null) {
			System.out.println("로그인 상태의 화면");
		} //else {
//			System.out.println("로그인 하세요 화면");			
//		}
		
		// 리모컨의 전원버튼의 경우 버튼 하나로 on/off
		boolean isPowerOn = false;
		
		// 전원 버튼을 눌렀을때의 로직
		if(isPowerOn) {
			System.out.println("TV를 끕니다.");
			isPowerOn = false;
		} else {
			System.out.println("TV를 켭니다.");
			isPowerOn = true;
		}
		
		System.out.println(isPowerOn);
		
		// boolean의 true/false를 스위치의 on/off처럼
		// 사용하는 변수를 토글(toggle) 혹은 플래그(flag)라고 함.
	
		System.out.println("===================================");
		// 주민번호 뒷자리의 첫번째 숫자로 성별 구분
		String idBack = "2342352";
		int first = Integer.parseInt(idBack.substring(0,1));
		
		if(first % 2 ==1 ) {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}
		
		// 등급 계산
		int score = 85;
		String grade = "C";
		
		score = 92;
		if(score > 80 && score <= 90) {
			grade = "B";
		}else if(score > 90) {
			grade = "A";
		}
		System.out.println(grade);
		
		System.out.println("===================================");
		
		// 회원가입 조건 체크
		String name = "";
		String phone = "01038429394";
		int age = 20;
		
		// Level 1
		if(!name.isEmpty()) {
			if((phone.length() == 10) || (phone.length() == 11)) {
				if(age > 14) {
					System.out.println("회원가입 가능");
				}else {
					System.out.println("회원가입 불가");					
				}
			}else {
				System.out.println("회원가입 불가");
			}
		}else {
			System.out.println("회원가입 불가");
		}
		
		// Level 2
		boolean isOkay = false;
		
		if(!name.isEmpty()) {
			if((phone.length() == 10) || (phone.length() == 11)) {
				if(age > 14) {
					isOkay = true;
				}
			}
		}
		if(isOkay) {
			System.out.println("회원가입 가능");
		}else {
			System.out.println("회원가입 불가");
		}
		
		// Level 3
		if((!name.isEmpty()) && (phone.length() == 10 || phone.length() == 11) &&
				(age > 14)) {
			System.out.println("회원가입 가능");			 
		}else {
			System.out.println("회원가입 불가");			 
		}
		
		// 교육기간(단위 : 월)
		int month = 2;
		
		if(month == 0) {
			System.out.println("열심히 배우는 중");
		}else if(month == 1) {
			System.out.println("오라클 DB 마스터");
		}else if(month == 2) {
			System.out.println("자바 마스터");
		}else if(month == 3) {
			System.out.println("자바스크립트 마스터");
		}else if(month == 4) {
			System.out.println("JSP 마스터");
		}else if(month == 5) {
			System.out.println("팀프로젝트");
		}else {
			System.out.println("수료");
		}
			
		// switch문
		switch(month) {
			case 0:
				System.out.println("열심히 배우는 중");
				break;
			case 1:
				System.out.println("오라클 DB 마스터");
				break;
			case 2:
				System.out.println("자바 마스터");
				break;
			case 3:
				System.out.println("자바스크립트 마스터");
				break;
			case 4:
				System.out.println("JSP 마스터");
				break;
			case 5:
				System.out.println("팀프로젝트");
				break;
			default :
				System.out.println("수료");
		}	
		
		
	}

}
