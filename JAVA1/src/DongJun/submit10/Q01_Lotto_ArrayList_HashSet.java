package DongJun.submit10;

import java.util.ArrayList;
import java.util.HashSet;

public class Q01_Lotto_ArrayList_HashSet {

	public static void main(String[] args) {

		// HashSet lotto 생성
		HashSet<Integer> lottoMap = makeLotto();
		System.out.println(lottoMap);
		
		// ArrayList로 변환
		ArrayList<Integer> lottoArray = new ArrayList<Integer>();
		lottoArray.addAll(lottoMap);		
		// 오름차순으로 정렬 
		asc(lottoArray);
		System.out.println(lottoArray);
		
	}// main
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
	// 로또 생성
	static HashSet<Integer> makeLotto(){
		HashSet<Integer> lottoMap = new HashSet<>();
		while(lottoMap.size() < 6) {
			if(lottoMap.size() < 6) {
				lottoMap.add((int)(Math.random()*45)+1);
			}
		}
		return lottoMap;
	}
	
}
