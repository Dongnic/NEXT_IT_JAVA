package DongJun.submit08;

import ch07_array.ArrayStudy;

public class Q01 {

	public static void main(String[] args) {
		int[] intArray = makeLotto();
		System.out.print("선택 번호 : ");
		int max = intArray[0];
		int K = 0;
		for(int j = 0; j <= intArray.length-1; j++) {
				for(int k = 0; k < intArray.length-j; k++) {  // 최댓값 
			    	if(intArray[k] > max) {
			    		max = intArray[k];
			    		K = k; // 최댓값의 자리 저장
			    	}
			    } // 최댓값 max  
				int temp = intArray[intArray.length-1-j]; // 마지막자리 값 temp에 저장
				intArray[K] = temp; // 최댓값 자리에 마지막자리 값 저장
				intArray[intArray.length-1-j] = max; // 마지막자리에 최댓값 저장  
				max = 0; // 최댓값 초기화
		}ArrayStudy.printArray(intArray);
		
		// 지난주 1등 당첨 번호
		int[] winLotto = {1, 2, 3, 4, 5, 6};
		System.out.print("당첨 번호 : ");
		ArrayStudy.printArray(winLotto);
		// lottoArr 과 winLotto를 비교해서 전부 다 일치하는 경우
		// 당첨되었다고 출력
		// 1개라도 틀리면 낙첨
		int count = 0;
		for(int i = 0; i < winLotto.length; i++) {
			if(intArray[i] != winLotto[i]) {
				System.out.println("오늘도 낙첨되었습니다.");
				break;
			}else {
				count++;
			}
			if(count == 6) {
				System.out.println("로또 1등 당첨");
			}
		}
		
		// 숫자배열 두개를 입력(파라미터) 받아
		// 전부다일치하는 경우 true를 리턴
		// 1개라도 틀리면 false를 리턴하는 함수 만들기
//		checkLotto(winLotto, intArray);
//		System.out.println(checkLotto(winLotto, intArray));
		int num = 0;
		while(true) {
			System.out.println(num+"번 실행");
			if(checkLotto(winLotto, makeLotto())) {
				System.out.println("1등 당첨!");
				break;
			}
			num++;
		}
		System.out.println(num + "번만에 당첨");
		System.out.println("구매금액 : " + num*1000L);
		
		
	}
	static boolean checkLotto(int[] winLotto, int[] intArray) {
		int count = 0;
		boolean vip = false;
		for(int i = 0; i < winLotto.length; i++) {
			if(intArray[i] == winLotto[i]) {
				count++;
			}else {
				vip = false;
				break;
			}
			if(count == 3) {
				vip = true;
				break;
			}
		}
		return vip;
	}
	
	static int[] makeLotto() {
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
		int max = lottoArray[0];
		int K = 0;
		for(int j = 0; j <= lottoArray.length-1; j++) {
				for(int k = 0; k < lottoArray.length-j; k++) {  // 최댓값 
			    	if(lottoArray[k] > max) {
			    		max = lottoArray[k];
			    		K = k; // 최댓값의 자리 저장
			    	}
			    } // 최댓값 max  
				int temp = lottoArray[lottoArray.length-1-j]; // 마지막자리 값 temp에 저장
				lottoArray[K] = temp; // 최댓값 자리에 마지막자리 값 저장
				lottoArray[lottoArray.length-1-j] = max; // 마지막자리에 최댓값 저장  
				max = 0; // 최댓값 초기화
		}return lottoArray;
	}
}
