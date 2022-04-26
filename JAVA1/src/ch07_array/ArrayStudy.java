package ch07_array;

import java.util.Arrays;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import java.util.Collections;

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
		
		System.out.println("===============================");
		
		// 숫자 배열
		int[] numArr = {7, 5, 6, 3, 1, 4, 2};
//		intArray = {1, 2, 3}; // 이미 선언된 intArray는 초기화가 안됨 불편(한 개씩은 가능)
		printArray(numArr);
		// 인덱스 0번 값과 인덱스 1번 값의 위치를 바꾸기
		int temp = numArr[0];
		numArr[0] = numArr[1];
		numArr[1] = temp;
		printArray(numArr);
		
		// 인덱스 2번 값과 3번 값의 위치를
		// 바꾸는데, 추가적인 변수 선언 없이 바꿔보세요
		// Hint 이건 숫자형 배열에서만 가능한 방법
		
		// 213 + 32
		numArr[2] = numArr[2] + numArr[3]; 
		// 245 - 32
		numArr[3] = numArr[2] - numArr[3]; 
		// 245 - 213
		numArr[2] = numArr[2] - numArr[3];
		
		printArray(numArr);
		
		// 정렬
		// (알고리즘으로 정렬)
		
		for(int i = 0; i< numArr.length-1;i++) {
			if(numArr[i] > numArr[i+1]) {
				int tem = numArr[i];
				numArr[i] = numArr[i+1];
				numArr[i+1] = tem;
			}
		}
		printArray(numArr);
		System.out.println("=========================");
		// 버블정렬 오름차순
		for(int j = 0; j < numArr.length; j++) {
			for(int i = 0; i< numArr.length-1;i++) {
				if(numArr[i] > numArr[i+1]) {
					int tem = numArr[i];
					numArr[i] = numArr[i+1];
					numArr[i+1] = tem;
				}
			}printArray(numArr);
		}
		System.out.println("=========================");
		// 내림차순 
		for(int j = 0; j < numArr.length; j++) {
			for(int i = 0; i< numArr.length-1-j;i++) { // -j는 불필요한 비교 횟수를 줄여준다 
				if(numArr[i] < numArr[i+1]) {
					int tem = numArr[i];
					numArr[i] = numArr[i+1];
					numArr[i+1] = tem;
				}
			}printArray(numArr);
		}
		
		// 오름차순 쉽게하기
		Arrays.parallelSort(numArr);
	    printArray(numArr);
		
	    // 내림차순 쉽게하기
//	    Arrays.sort(numArr, Collections.reverseOrder());
		
	    // 위 방법은 객체를 담은 배열일 경우에만
	    // 가능한 방법(기본형인 int 배열이 아닌 참조타입인 Integer 배열은 가능)
	    Integer[] integerArr = {1, 2, 3, 4, 5, 6};
	    // 내림차순
	    Arrays.sort(integerArr, Collections.reverseOrder());
	    printArray(integerArr);
	    System.out.println("============오름차순==========");
	    // 오름차순
	    Arrays.sort(integerArr);
	    printArray(integerArr);
	    // 오름차순을 이용한 내림차순
	    // 모든배열의 요소에 -1을 연산한 후 오름차순으로 정렬
	    // 그 후 다시 -1을 연산하여 기존 값으로 
	    
	    // 모든 요소에 x -1
	    for(int i = 0; i< integerArr.length;i++) {
	    	integerArr[i] = integerArr[i] * -1; 
	    }
	    // 오름차순 정렬
	    Arrays.sort(integerArr);
	    // 다시 모든 요소에 x -1
	    for(int i = 0; i< integerArr.length;i++) {
	    	integerArr[i] = integerArr[i] * -1; 
	    }
	    printArray(integerArr);
		
	    // 다차원 배열
	    // 2차원 배열
	    int[][] doubleArr = {{1, 2, 3}, {4, 5, 6},{7, 8, 9}};
	    printArray(doubleArr);
	    
	    int[] tempArr = doubleArr[0];
	    printArray(tempArr); // 1, 2, 3
	    System.out.println(doubleArr[2][1]); // 8
		
	    // 3차원 배열
	    int[][][] tripleArr = {{{1, 2, 3}, {4, 5, 6},{7, 8, 9}}
	    				     ,{{11, 22, 33}, {44, 55, 66},{77, 88, 99}}
	    				     ,{{111, 222, 333}, {444, 555, 666},{777, 888, 999}}};
	    
	    System.out.println("=========================");
	    
	    String[] nameArray = {"한예성", "김달현", "송나겸", "김성윤", "남궁혜연"
	    		, "오혁진", "최윤정", "박승주", "석승원", "김성빈", "신윤빈", "염현섭"
	    		, "박기현", "유동준", "이한정", "임동성", "임성헌", "정기준", "박설리"
	    		, "가나혜", "황의창"};
	    // for문을 이용해서 "박"씨 성을 가진 동기가 몇 명인지 출력해주세요
	    int countPark = 0;
	    for(int i = 0; i < nameArray.length; i++) {
	    	if(nameArray[i].substring(0, 1).equals("박")) { // 문자열은 equals !!!!, 숫자는 ==
	    		countPark++;
	    	}
	    } 
	    System.out.println(countPark);	    
	    
	    int[] numberArr = {123, 234, 345, 456, 567, 678, 789}; 
	    
	    // numberArr 의 최댓값, 최솟값을 출력해주세요.
	    
	    int min = numberArr[0];
	    int max = numberArr[0];
	    for(int i = 0; i < numberArr.length; i++) {
	    	if(numberArr[i] > max) {
	    		max = numberArr[i];
	    	}
	    	if(numberArr[i] < min) {
	    		min = numberArr[i];
	    	}	
	    }
	    System.out.println("최소: " + min + " 최대: " + max);
	    maxArray(numberArr);
	    minArray(numberArr);
	    System.out.println("최댓값: " + maxArray(numberArr));
	    // TMI
	    System.out.println("=========================");
	    // 숫자형 배열의 최댓값을 구하는 로직을 함수로 만든다.
	    int maxVal = maxArray(numberArr);
	    System.out.println(maxVal);
	    // 동적 매개변수(파라미터)를 받는 메소드 
	    // maxArray(int... Arr) // int와 int[]를 모두 포함하여 입력받은 값을 int[]로 변경
	    System.out.println(maxArray(13,111434,134,314,134,31,23,213,153,1));
	    
	    // 로또 번호 생성기
	    
	    int[] lottoArray = new int[6];
	    int idx = 0;
		while(idx < 6) {
			int randInt = (int)(Math.random()*45)+1;
			boolean isDuple = false;
			
			// 중복체크(중복되면 isDuple은 true)
			for(int i = 0; i < lottoArray.length; i++) {
				if(lottoArray[i] == randInt) {
					isDuple = true;
				}
			}
			if(isDuple == false) {
				lottoArray[idx] = randInt;
				idx++;
			}
				
		}
		Arrays.sort(lottoArray);
		printArray(lottoArray);
		
		
		
		
		
		
	}
	static int maxArray(int... Arr) {
		int max = Arr[0];
		  for(int i = 0; i < Arr.length; i++) {
			  if(Arr[i] > max) {
		    		max = Arr[i];
		    	}	
		  }
		  return max;
	}
	static void minArray(int[] Arr) {
		int min = Arr[0];
		  for(int i = 0; i < Arr.length; i++) {
			  if(Arr[i] < min) {
		    		min = Arr[i];
		    	}	
		  }
		  System.out.println("최소: " + min);
	}
	static void printArray(int[][] Arr) {
		for(int i = 0; i < Arr.length; i++) {
			if(i == Arr.length - 1) {
				System.out.println(Arr[i][i]);
			}else {
				System.out.print(Arr[i][i] + ", ");				
			}
		}
	}

	static void printArray(Integer[] Arr) {
		for(int i = 0; i < Arr.length; i++) {
			if(i == Arr.length - 1) {
				System.out.println(Arr[i]);
			}else {
				System.out.print(Arr[i] + ", ");				
			}
		}
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
	public static void printArray(int[] intArray) {
		for(int i = 0; i < intArray.length; i++) {
			if(i == intArray.length - 1) {
				System.out.println(intArray[i]);
			}else {
				System.out.print(intArray[i] + ", ");				
			}
		}
	}
}
