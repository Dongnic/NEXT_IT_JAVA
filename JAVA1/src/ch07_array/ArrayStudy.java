package ch07_array;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class ArrayStudy {

	public static void main(String[] args) {
		// 배열 (Array)
	
		// 문자(String) 배열
		// 배열의 선언 1  
		// []안의 숫자(4)는 첨자이며 배열의 크기를 의미한다. 
		String[] seoyugi = new String[4];
		
		// .length 배열의 크기를 리턴
		System.out.println(seoyugi.length);
		
		// 배열 내 요소(element)의 값 확인 
		// 인덱스 사용 (= 인덱싱)
		System.out.println(seoyugi[0]);
		
		//크기만 선언도니 배열 내에는 기본 값이 들어있다.
		
		// 기본값(default)
		// 1. 참조타입 : null
		// 기본형(숫자형, boolean)
		// 2. 숫자타입 : 정수는 0, 실수는 0.0 
		// 3. boolean타입 : false
		
		int[] numbers = new int[2];
		System.out.println(numbers[1]);
		
		// for문을 이용 0부터 array.length 미만까지 
		// 순회하면 배열의 모든 요소에 접근이 가능하다 
		
		for(int i = 0; i < seoyugi.length; i++) {
			System.out.println(seoyugi[i]);
		}
		
		System.out.println("=============================");
		seoyugi[0] = "삼장법사";
		seoyugi[1] = "손오공";
		seoyugi[2] = "사오정";
		seoyugi[3] = "저팔계";
	
		System.out.println("\n");
		
		// 배열의 단점
		// 크기가 고정됨!!!!!!!!!!!!!!!!!!!!
		// 늘어나지도, 줄어들지도 않는다.
		// = 값이 추가되지 않고, 값을 제거도 못한다.
		
		// 빨간줄 에러는 컴파일 에러로,
		// 실행을 안해봐도 이클립스가 캐치
		// 실행했을 경우 발생하는 에러는 런타임 에러
//		seoyugi[4] = "크리링";
		
		// 배열의 장점
		// 배열에 담긴 모든 요소들을 한번에 처리할 수 있다
		for(int i = 0; i < seoyugi.length; i++) {
			seoyugi[i] = "서유기 " + seoyugi[i]; // 서유기 모든 배열 앞에 "서유기" 추가
		}
		
		
		// 배열 내 특정 요소에 접근하여 처리할 수 있다
		for(int i = 0; i < seoyugi.length; i++) {
			if(i == seoyugi.length - 1) {
				System.out.print(seoyugi[i]);
			}else {
				// 손오공인지 체크
				// seoyugi[i].contains("손오공") = 손오공을 포함하고 있으면 true, 아니면 false
				// seoyugi[i].indexOf("손오공") = 손오공을 포함하면 해당문자열(ex 7), 아니면 -1
				if(seoyugi[i].contains("손오공")) {
					// 그럼 서유기를 드래곤볼로 바꿔
					seoyugi[i] = seoyugi[i].replace("서유기" , "드래곤볼"); 
					System.out.print(seoyugi[i] + ", ");
				}else
				System.out.print(seoyugi[i] + ", ");
				}	
		}
		
		System.out.println("\n=========================");
		
		int[] intArray = new int[6];
		
		printArray(intArray);
		
		// 배열 안에 랜덤숫자 넣기
		// 로또 번호 넣어주기 
		// 1~45 사이의 랜덤 정수
//		intArray[0] = (int) (Math.random() * 45) + 1;
		
		for(int i = 0; i < intArray.length; i++) {
			intArray[i] = (int) (Math.random() * 45) + 1;
		}
		printArray(intArray);
		
		System.out.println("=========================");
		
		// 배열의 선언 2
		// 선언과 동시에 값을 초기화
		String[] students = {"송나겸", "남궁혜연", "김달현"};
		
		printArray(students);
		System.out.println("=========================");
		
		// 문자열 나누기
		String myInfo = "정찬웅, 010-7398-7332, akow283@gmail.com";
		System.out.println(myInfo);
		// .split(문자열)
		// 괄호 안 문자열(",")을 기준으로 해당 문자열을
		// 나누어 문자열 배열로 리턴한다.
		String[] infoArray = myInfo.split(",");
		System.out.println(infoArray.length);
		printArray(infoArray);
		// 불필요한 공백 
		String[] infoArray2 = myInfo.split(", ");
		printArray(infoArray2);
		
		// 데이터가 복잡한 경우라면 일단 ,로 나누고
		// 이후 양쪽 공백을 제거해주면 된다.
		for(int i = 0; i < infoArray.length; i++) {
			// trim() 공백제거
 			infoArray[i] = infoArray[i].trim();
		}
		printArray(infoArray);
		
		System.out.println("=========================");
		
		
		String calStr = "1+4+2";
//		String[] calArray = calStr.split("+");
		// regex란 정규표현식(Reguler Expression)의 약자
		// *, ?, + 등의 경우 정규표현식에서 특정 의미를 
		// 갖는 특수문자이므로 일반 문자로 사용하려면
		// 앞에 \\를 붙인다 Syso(\)를 표현하려면 \\를 쓰는 것처럼
		String[] calArray = calStr.split("\\+");
		
     	// 정규표현식 사용 예
		// 연락처를 숫자만 기입했는지 체크
		// 비밀번호에 알파벳 소문자, 대문자, 숫자,
		// 특수기호 최소 1개 이상 넣었는지 체크  
		printArray(calArray);
		
		// 배열의 복사
		String[] sinSeoyugi = seoyugi;
		printArray(seoyugi);
		printArray(sinSeoyugi);
		// 각 배열에 저장된 스택의 주소가 같아 힙영역의 정보가 같기때문에
		sinSeoyugi[0] = "이승기";
		sinSeoyugi[1] = "이수근";
		// 한 배열을 변경하면 힙영역의 정보가 변경되고 같은 주소를 갖는 두 배열이 같은 값을 갖게됨
		printArray(seoyugi);
		printArray(sinSeoyugi);
		
		System.out.println(seoyugi);
		System.out.println(sinSeoyugi);
		// 결과 [Ljava.lang.String;@15db9742
		// @뒤에 붙은건 hashCode를 16진수로 나타낸것
		System.out.println(seoyugi.hashCode());        // seoyugi의 해쉬코드
		System.out.println(sinSeoyugi.hashCode());     // seoyugi의 해쉬코드 
		System.out.println(Integer.toHexString(seoyugi.hashCode()));  //// seoyugi의 해쉬코드 16진수
		
		// 해쉬코드(hashcode)
		// 객체의 메모리 주소 값을 이용해서
		// 해쉬를 적용한 코드
	    
		// 해쉬(hash)
		// 해쉬함수(암호화 알고리즘)를 이용해서
		// 데이터를 암호화 하는 기법(RSA, SHA 등..)
		
		// 암호화, 복호화 정말 쉽다.
		// 암호화
		Encoder base64Encoder = Base64.getEncoder();
//		 명령어      이름          Base64라는 인코더		
		String password = "1q2w3e4r";
		// 비밀번호
		byte[]passByte = password.getBytes();
		// 문자열을 byte 배열로 변환
		String encryption = new String(base64Encoder.encode(passByte));
//		encryption이라는 문자열에 Base64로 인코딩한 passByte 정보를 저장
		System.out.println(encryption);
//		암호화된 encryption 출력
		Decoder base64Decoder = Base64.getDecoder();
		String decryption = new String(base64Decoder.decode(encryption));
		System.out.println(decryption);
		
		// 암호화 시 사용된 알고리즘과(여기선 base64)
		// 일치하는 알고리즘을 이용하여
		// 복호화 해야 한다는 것에만 주의
		
		// 올바른 배열 복사 .clone()사용
		String[] sinSeoyugi2 = seoyugi.clone();
		sinSeoyugi2[0] = "안재현";
		
		printArray(seoyugi);
		printArray(sinSeoyugi2);
		
		// .clone() 외 배열 복사
		String[] sinSeoyugi3 = new String[seoyugi.length];
		// sinSeoyugi3의 각각의 요소에
		// seoyugi의 각각의 요소를 넣으면 됨
		
		for(int i = 0; i < seoyugi.length; i++) {
			sinSeoyugi3[i] = seoyugi[i];
		}
		printArray(seoyugi);
		printArray(sinSeoyugi3);		
		System.out.println(seoyugi.hashCode());     
		System.out.println(sinSeoyugi.hashCode()); 
		System.out.println(sinSeoyugi2.hashCode()); 
		System.out.println(sinSeoyugi3.hashCode()); 
		
	}
	
	static void printArray(String[] strArray) {
		for(int i = 0; i < strArray.length; i++) {
			if(i == strArray.length - 1) {
				System.out.println(strArray[i]);
			}else {
				System.out.print(strArray[i] + ", ");				
			}
		}
	}	
	static void printArray(int[] intArray) {
		for(int i = 0; i < intArray.length; i++) {
			if(i == intArray.length - 1) {
				System.out.println(intArray[i]);
			}else {
				System.out.print(intArray[i] + ", ");				
			}
		}
	}

}
