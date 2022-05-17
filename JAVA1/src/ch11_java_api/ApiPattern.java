package ch11_java_api;

import java.util.regex.Pattern;

public class ApiPattern {

	public static void main(String[] args) {
		// 정규표현식 (Regular Expression)
		// 특정한 규칙을 가진 문자열의 집합을
		// 표현하기 위해 쓰는 방식
		
		// 전화번호, 주민등록번호, 이메일 등과 같이
		// 정해진 형식에대해 정규표현식과
		// Pattern을 이용하여 검증할 수 있다.
		
		// 숫자만 존재하는지 검증
		String regex = "^[0-9]+$";
		String example = "11234";
		boolean result = Pattern.matches(regex, example);
		System.out.println(example + "의 검증" + regex + "결과 : " + result);
		
		// 숫자 검증 2 
		regex = "\\d+";
		result = Pattern.matches(regex, example);
		System.out.println(example + "의 검증" + regex + "결과 : " + result);
		
		// 알파벳만 존재하는지 검증 붙이면 or 공백(" ")도 [\\s] <- 공백도 가능
		regex = "^[ a-zA-Z]+";
		example = "cha nung";
		result = Pattern.matches(regex, example);
		System.out.println(example + "의 검증" + regex + "결과 : " + result);
		
		// 한글만 존재하는지 검증
		regex = "^[가-힣]+";
		example = "김한국";
		result = Pattern.matches(regex, example);
		System.out.println(example + "의 검증" + regex + "결과 : " + result);
		
		System.out.println("========================");
		
		// 비밀번호 패턴 검증
		// 영어와 숫자로만 구성 [\\w]
		regex = "^[a-zA-Z0-9]+";
		// 비밀번호 검증 2
		regex = "\\w+";
		example = "qwer1234";
		result = Pattern.matches(regex, example);
		System.out.println(example + "의 검증" + regex + "결과 : " + result);
		
		// 영어와 숫자 + 특수문자 
		regex = "[\\w!@#$%^&*()_+]+";
		example = "qwer12343!!";
		result = Pattern.matches(regex, example);
		System.out.println(example + "의 검증" + regex + "결과 : " + result);

		// 숫자, 영어 소문자, 영어 대문자, 특수문자
		// 각각 1개 이상 + 8~20자리 문자
		regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()_]).{8,20}$";
		example = "qwdasdjakK3!!";
		result = Pattern.matches(regex, example);
		System.out.println(example + "의 검증" + regex + "결과 : " + result);
		
		System.out.println("===== 단계별 검증 =====");
		// 단계별로 적용하기
		// 1단계 자리수 검증
		example = "1aA00!000";
		regex = "^.{8,20}$";
		result = Pattern.matches(regex, example);
		if(result) {
			System.out.println("1단계 자리수 검증 통과");
			// 소문자가 최소 한 개 이상?
			regex = "^.*[a-z].*$";
			result = Pattern.matches(regex, example);
			if(result) {
				System.out.println("2단계 소문자 검증 통과");
				// 대문자가 최소 한 개 이상?
				regex = "^.*[A-Z].*$";
				result = Pattern.matches(regex, example);
				if(result) {
					System.out.println("3단계 대문자 검증 통과");
					regex = "^.*[`~<>?/!@#$%^&*()+=\\_].*$"; // \\_ <- _무효화
					result = Pattern.matches(regex, example);
					if(result) {
						System.out.println("4단계 특수문자 검증 통과");
						regex = "^.*[0-9].*$";
						result = Pattern.matches(regex, example);
						if(result) {
							System.out.println("비밀번호가 사용 가능합니다");
						}else {
							System.out.println("숫자를 넣어주세요");
						}
					}else {
						System.out.println("특수문자를 넣어주세요");
					}
				}else {
					System.out.println("대문자를 넣어주세요");
				}
				
			}else {
				System.out.println("소문자를 넣어주세요");
			}
		}else {
			System.out.println("8~20자리로 입력해주세요");
		}
		// 6자리 숫자 비밀번호중 3자리 이상 반복 금지
		regex = ".*(\\d)\\1\\1.*$";
		example = "qwer1234";
		result = Pattern.matches(regex, example);
		System.out.println(example + "의 검증" + regex + "결과 : " + result);

		// 6자리 숫자 
		regex = ".*(\\d)\\1\\1.*$";
		example = "qwer1234";
		result = Pattern.matches(regex, example);
		System.out.println(example + "의 검증" + regex + "결과 : " + result);

		// 이메일 형식 확인 
		regex = "^[\\w]+@[\\w]+\\.[a-z]+$";
		example = "qwer1234@naver.com";
		result = Pattern.matches(regex, example);
		System.out.println(example + "의 검증" + regex + "결과 : " + result);

		// 연락처 확인 
		regex = "^[0-9]{2,3}-[\\d]{3,4}-[\\d]{4}$";
		example = "010-1234-1234";
		result = Pattern.matches(regex, example);
		System.out.println(example + "의 검증" + regex + "결과 : " + result);

	}

}
