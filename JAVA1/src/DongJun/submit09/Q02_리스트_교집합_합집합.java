package DongJun.submit09;

import java.util.ArrayList;

public class Q02_리스트_교집합_합집합 {

	public static void main(String[] args) {
		
		ArrayList<String> wife = new ArrayList<String>();
		wife.add("냉장고");
		wife.add("세탁기");
		wife.add("노트북");
		wife.add("에어컨");
		wife.add("에어컨");
		wife.add("에어컨");
		wife.add("에어컨");
		
		
		ArrayList<String> husband = new ArrayList<String>();
		husband.add("노트북");
		husband.add("TV");
		husband.add("TV");
		husband.add("로봇청소기");
		husband.add("에어컨");
		
		// Q02 - 1 
		ArrayList<String> couple = new ArrayList<String>();
		for(int j = 0; j < wife.size(); j++) { // 비교할 값
			for(int i = 0; i < husband.size(); i++) { // 비교해서 넣을 값 
				if(wife.get(j).equals(husband.get(i))) {			
					couple.add(husband.get(i)); // 같으면 해당 값을 couple에 담음
				}
			}			
		}
		remove(couple); // 혹시 모르는 중복 제거 
		System.out.println("1-MY 같이 사고싶은 물건 : " + couple);
		
		// Q02 - 1 A1
		ArrayList<String> wantList = new ArrayList<String>();
		for(int i = 0; i < wife.size(); i++) {
			if(husband.indexOf(wife.get(i)) != -1) {
				wantList.add(wife.get(i));
			}
		}
		remove(wantList);
		System.out.println("1-A1 같이 사고싶은 물건 : " + wantList);
		
		// Q02 - 1 A2
		wantList = new ArrayList<>(); // 초기화
		wantList.addAll(wife); // 와이프 구매 물건을 전부 넣음
		remove(wantList);
		System.out.println("1-A2 남편이 사고싶은 물건 : " + wantList);
		wantList.retainAll(husband); // 남편 구매물건을 교집합으로 넣음 
		remove(wantList);
		System.out.println("1-A2 같이 사고싶은 물건 : " + wantList);
		
		// Q02 - 2
		ArrayList<String> sum = new ArrayList<String>(wife); // 와이프 물품 넣음
		for(int i = 0; i < husband.size(); i++) { // 남편 물품 넣음 
			sum.add(husband.get(i));
		}
		remove(sum); // 중복물품 제거
		System.out.println("모두 구매하는 물건 : " + sum);
		
	} // main
	
	// 중복제거
	static ArrayList<String> remove(ArrayList<String> sum){
		for(int j = 0; j < sum.size(); j++) { // 비교할 값
			for(int i = j+1; i < sum.size(); i++) { // 비교해서 지울 값 
				if(sum.get(j).equals(sum.get(i))) {			
					sum.remove(i); // 같으면 해당 인덱스 위치의 값을 지움
					j = 0;    // 같은 값이 있었다면 다시 처음부터 체크하기 위함 
					i = j;
				}
			}			
		}
		return sum;
	}
}
