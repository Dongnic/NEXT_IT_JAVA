package ch08_collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionSet {

	public static void main(String[] args) {
		// 집합(hashSet)의 선언
		HashSet<String> stuSet = new HashSet<String>();
		HashSet<String> stuSet2 = new HashSet<>(); // 제너릭(<>) 생략가능
		// 다형성
		Set<String> stuSet3 = new HashSet<>(); // Set은 HashSet의 부모격
		
		// .add() 값 추가
		stuSet.add("이한정");
		stuSet.add("박기현");
		stuSet.add("유동준");
		
		System.out.println(stuSet); // [유동준, 이한정, 박기현]
		// set은 순서를 보장하지 않는다.
		
		stuSet.add("박기현");
		System.out.println(stuSet); // 중복은 알아서 추가가 안된다
		
		System.out.println("=========================================");
		// .contains(값) 값이 안에 있으면 true 없으면 false
		// 전부 일치해야함
		System.out.println(stuSet.contains("한정"));    // false
		System.out.println(stuSet.contains("이한정"));  // true
		
		// .size() 집합의 데이터 갯수를 리턴
		System.out.println(stuSet.size()); // 3
		System.out.println("=========================================");
		
		// Set 조회
		// 1. while문 사용 
		Iterator<String> iterator = stuSet.iterator();
		while(iterator.hasNext()) { // 다음 값이 있으면 true
			String name = iterator.next(); // 그 값을 name에 저장
			System.out.println(name); // 유동준 이한정 박기현
		}
		
		// 2. 향상된 for문 
		for(String name : stuSet) { // stuSet에 있는 모든 값을 하나씩 순회하며 name에 저장
			System.out.println(name); // 유동준 이한정 박기현
		}
		
		// 3. forEach문
		// 한줄 
		stuSet.forEach(name -> System.out.println(name));
		// 두줄이상 (name -> {내용;});
		stuSet.forEach(name -> {
			System.out.println(name);	
		});
		
		System.out.println("=====================================");
		
		// Set은 집합을 쓰는 경우가 아니라면 잘 사용하지 않음
		// (중복을 허용하지 않는 속성을 이용할 때 사용) 
		ArrayList<Integer> intArray = new ArrayList<Integer>();		
		for(int i = 0; i < 10; i++) {
			intArray.add((int)(Math.random()*11)+10);
		}
		System.out.println(intArray); // 중복이 포함된 intArray 출력
		
		// ArrayList를 HashSet으로 변환
		HashSet<Integer> tempSet = new HashSet<>();
		tempSet.addAll(intArray);
		System.out.println(tempSet); // 중복제거된 intArray 출력
		
		// HashSet을 ArrayList로 변환
		intArray.clear(); // 초기화
//		intArray = new ArrayList<Integer>();
		intArray.addAll(tempSet);
		System.out.println(intArray); // tempSet이 ArrayList형태로 변경된 intArray 출력
		
		
	}
	
}
