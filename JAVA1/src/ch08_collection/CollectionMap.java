package ch08_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionMap {

	public static void main(String[] args) {
		
		// 맵(HashMap)의 선언
		// 제너릭 구성 <키의 형태, 값의 형태>
		HashMap<String, String> stuMap = new HashMap<>();
		HashMap<String, Integer> coinMap = new HashMap<>();
		
		// 다형성 
		Map<Integer, String> stuMap2 = new HashMap<>();
		
		// .put(key, value)
		// 맵에 데이터 추가
		// key는 고유의 값이어야 함(DB의 primary key 처럼)
		stuMap.put("첫째", "성빈");
		stuMap.put("둘째", "달현");
		stuMap.put("셋째", "현섭");
		// 맵은 중복된 키를 허용하지 않음
		// 중복된 키를 추가하게 되면
		// 기존 키의 값을 덮어씀 
		
		// 또한 값을 추가한 순서를 보장하지 않는다.
		System.out.println(stuMap); // {첫째=성빈, 셋째=현섭, 둘째=달현}
		
		coinMap.put("비트코인", 50_000_000);
		coinMap.put("이더리움", 3_700_000);
		System.out.println(coinMap); // {비트코인=50000000, 이더리움=3700000}
		
		stuMap2.put(0 ,"윤정");
		stuMap2.put(1 ,"나혜");
		stuMap2.put(2 ,"승주");
		stuMap2.put(3 ,"기현");
		stuMap2.put(4 ,"한정");
		stuMap2.put(5 ,"동준");
		System.out.println(stuMap2); // {0=윤정, 1=나혜, 2=승주}
		
		// .get(key)
		// key에 해당하는 value를 리턴 존재하지 않는 key라면 null 리턴
		System.out.println(stuMap.get("첫째")); // 성빈
		System.out.println(stuMap.get("A")); // null
		
		// .size()
		// . 안에 데이터의 개수 리턴
		System.out.println(stuMap.size()); // 3
		
		// .containsKey(i)
		// . 안에 있는 키(key) 중에 값의 키가 존재하면 true 아니면 false 
		System.out.println(stuMap.containsKey("둘째")); // true
		System.out.println(stuMap.containsKey("넷째")); // false
		
		// .containsValue(i)
		// . 안에 있는 값중에 i에 해당하는게 있다면 true 아니면 false 정확히 일치해야함
		System.out.println(stuMap2.containsValue("나혜")); // true
		System.out.println(stuMap2.containsValue("동준")); // false
		
		// .remove(key)
		// key에 해당하는 데이터를 삭제
		coinMap.remove("비트코인");
		System.out.println(coinMap); // {이더리움=3700000}
		
		// Map 순회
		// 1. keySet 이용
		// stuMap의 키 형태(String)와 keySet집합의 형태(String)가 동일해야함
		Set<String> keySet = stuMap.keySet(); // stuMap의 키들을 Set(집합)형식인 keySet에 담음
		
		// set을 향상된 for문으로 순회 
		for(String key : keySet) {
			System.out.println(key); // 첫째 : 성빈 셋째 : 현섭 둘째 : 달현 // 순서 보장안됨
			System.out.println(key + " : " + stuMap.get(key)); // 첫째 셋째 둘째
		}
		
		Set<Integer> keySet2 = stuMap2.keySet();
		for(int num : keySet2) {
			System.out.println(num + " : " + stuMap2.get(num)); // 0 : 윤정 1 : 나혜 2 : 승주
		}
		
		// 2. EntrySet 이용
		// 키와 값을 동시에 가질 수 있음
		Set<Entry<String, String>> entrySet = stuMap.entrySet();
		
		for(Entry<String, String> entry : entrySet) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " : " + value); // 첫째 : 성빈, 셋째 : 현섭, 둘째 : 달현
		}
		
		Set<Entry<Integer, String>> entrySet2 = stuMap2.entrySet();
		
		for(Entry<Integer, String> entry : entrySet2) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " : " + value); // 0 : 윤정 1 : 나혜 2 : 승주
		}
		
		// 3. forEach문 이용(람다식)
		stuMap.forEach((key, value) -> System.out.println(key + " : " + value));
		// 첫째 : 성빈, 셋째 : 현섭, 둘째 : 달현
		
		
		
	}// main

}
