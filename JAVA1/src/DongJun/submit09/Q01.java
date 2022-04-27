package DongJun.submit09;

import java.util.ArrayList;

public class Q01 {

	public static void main(String[] args) {

		// Q1 - 1
		// 랜덤 숫자
		ArrayList<Integer> intArray = new ArrayList<Integer>();		
		for(int i = 0; i < 10; i++) {
			intArray.add((int)(Math.random()*11)+10);
		}
		System.out.println("Q01-1 랜덤숫자 : " + intArray);

		// Q1 - 2
		// 한줄 출력
		System.out.print("Q01-2 한줄출력 : ");
		printArray(intArray);
		System.out.print("\n");

		// Q1 - 3
		// 중복체크 및 제거 
		System.out.print("Q01-3 중복제거 : ");
		printArray(remove(intArray));
		System.out.print("\n");		
		
		// Q1 - 4
		// 오름차순 정렬	
		System.out.print("Q01-4 오름차순 : ");
		printArray(asc(intArray));
		System.out.print("\n");
	
		// Q1 - 5
		// 내림차순 정렬
		System.out.print("Q01-5 내림차순 : ");
		printArray(desc(intArray));
	} // main
	
	// 한줄출력 메소드
	static void printArray(ArrayList<Integer> a) {
		for(int i = 0; i < a.size(); i++) {
			System.out.print(a.get(i) + " ");
		}
	}
	// 오름차순 메소드
	static ArrayList<Integer> asc(ArrayList<Integer> intArray){
		for(int k = 0; k < intArray.size(); k++) {
			for(int j = 0; j < intArray.size()-1-k; j++) {
				if(intArray.get(j) > intArray.get(j+1)) {
					int temp2 = intArray.get(j);
					intArray.set(j, intArray.get(j+1));
					intArray.set(j+1, temp2);
				}
			}
		}
		return intArray;
	}
	// 내림차순 메소드 
	static ArrayList<Integer> desc(ArrayList<Integer> intArray){
		for(int k = 0; k < intArray.size(); k++) {
			for(int j = 0; j < intArray.size()-1-k; j++) {
				if(intArray.get(j) < intArray.get(j+1)) {
					int temp2 = intArray.get(j);
					intArray.set(j, intArray.get(j+1));
					intArray.set(j+1, temp2);
				}
			}
		}
		return intArray;
	}
	// 중복제거 메소드
	static ArrayList<Integer> remove(ArrayList<Integer> intArray){
		for(int j = 0; j < intArray.size(); j++) { // 비교할 값
			for(int i = j+1; i < intArray.size(); i++) { // 비교해서 지울 값 
				if(intArray.get(j) == intArray.get(i)) {			
					intArray.remove(i); // 같으면 해당 인덱스 위치의 값을 지움
					j = 0;    // 같은 값이 있었다면 다시 처음부터 체크하기 위함 
//					i = j;
				}
			}			
		}
		return intArray;
	}
	
}
