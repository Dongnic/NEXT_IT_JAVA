package ch08_collection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Consumer;
public class CollectionList {

	public static void main(String[] args) {
		
		// 리스트(ArrayList)의 선언
		// 첫번째 방법 문자열
		ArrayList<String> students = new ArrayList<String>();
		
		// 두번째 방법 숫자형
		ArrayList<Integer> intList = new ArrayList<>(); // 뒤의 변수타입은 생략가능(하지만 명시적인게 좋으므로 씀)
	
		// Wrapper class는 기본 타입의 데이터를
		// 객체(참조타입 변수)로 사용해야하는
		// 경우에 사용한다.
		// byte, short, int, long, char, double, boolean 등
	
		int intVal = 12;
		
		// 기본 타입의 데이터를(intVal)
		// Wrapper 클래스의 인스턴스로 변환
		// (= Wrapper 객체로 만들기)
		Integer num = new Integer(intVal); // 이 과정을 박싱(boxing) 이라고 함
		System.out.println(num); // 12
		
		Integer autoNum = intVal; // 오토박싱(auto boxing)
		System.out.println(autoNum); // 12
		
		// Wrapper 클래스 객체에 저장된 값을
		// 기본 타입의 데이터로 꺼내기
		// 언박싱(unboxing)
		int temp = autoNum.intValue(); // 언박싱(unboxing)
		System.out.println(temp); // 12
		
		int autoTemp = autoNum; // 오토 언박싱(unboxing)
		System.out.println(autoTemp); // 12
		
		// 한줄요약
		// 오토 박싱과 언박싱이 되므로 Wrapper class를 사용하는데 불편함은 없다.
		
		System.out.println("=====================================");
		// ArrayList에 값 삽입
		intList.add(new Integer(5)); // 원래는 이렇게 삽입해야하지만
		intList.add(6); // 오토 박싱덕분에 그냥 넣어도 됨 
		System.out.println(intList); // [5, 6] 형태로 자동정렬
		
		students.add("송나겸");
		students.add("남궁혜연");
		students.add("박설리");
		students.add("박승주");
		students.add("가나혜");
		students.add("최윤정");
		
		// 제너릭<> 타입과 일치하는 데이터만 추가가능
//		students.add(13); // 숫자타입이라 불가
		
		System.out.println(students); // [송나겸, 남궁혜연, 박설리, 박승주, 가나혜, 최윤정]
		System.out.println("=====================================");
		
		// .size()
		// 리스트의 길이를 리턴 (.length()와 같음)
		System.out.println(students.size()); // 6
		
		// 값이 없으면 사이즈는 0
		ArrayList<String> tempList = new ArrayList<>();
		System.out.println(tempList.size()); // 0 
		
		// .set(인덱스, 값1)
		// 해당 인덱스의 값을 값1로 교체
		students.set(1, "임동성");
		System.out.println(students); // [송나겸, 임동성, 박설리, 박승주, 가나혜, 최윤정]
		System.out.println("=======================여기 ==============");
		// .contains(값)
		// 리스트안에 해당 값이 존재하는지 체크
		// 존재하면 true, 없으면 false
		System.out.println(students.contains("나겸")); // true
		
		// indexOf(값)
		// 리스트안에 해당 값이 어디에 존재하는 지 체크
		// 존재하면 해당 인덱스 리턴, 없으면 -1 리턴 
		System.out.println(students.indexOf("송나겸")); // 0
		System.out.println(students.indexOf("나겸")); // -1 완전히 일치해야함
		
		// -1 리턴 여부로 contains처럼 사용가능
		
		// .get(인덱스)
		// 해당 인덱스의 값을 가져옴
		System.out.println(students.get(0)); // 송나겸
		
		// .isEmpty()
		// 리스트가 비어있는지 체크
		// 비어있다면 true 아니라면 false
		// .size() == 0과 값다.
		System.out.println(students.isEmpty()); // false 
		System.out.println(tempList.isEmpty()); // ture
		
		// .remove(인덱스)
		// 해당 인덱스의 데이터를 삭제
		students.remove(1);
		System.out.println(students); // [송나겸, 박설리, 박승주, 가나혜, 최윤정]
		
		// .remove(값)
		// 리스트에 해당 값이 있으면 삭제
		// 없으면 삭제안함
		
		students.remove("송나겸");
		System.out.println(students); // [송나겸, 박설리, 박승주, 가나혜, 최윤정]
		
		
		// .clear()
		// 해당 리스트를 비움
		students.clear();
		System.out.println(students); // []
		
		students.add("송나겸");
		System.out.println(students); // [송나겸]
		
		// 초기화 
		students = new ArrayList<>(); // .clear() 
		System.out.println(students); // []
		
		System.out.println("================================");
		
		// for문으로 ArrayList 제어
		students.add("송나겸");
		students.add("남궁혜연");
		students.add("박설리");
		students.add("박승주");
		students.add("가나혜");
		students.add("최윤정");
		System.out.println(students); // [송나겸, 남궁혜연, 박설리, 박승주, 가나혜, 최윤정]
		
		for(int i = 0; i < students.size(); i++) {
			students.set(i, (i+1) + ". "+ students.get(i)); 
		}
		System.out.println(students); // [1. 송나겸, 2. 남궁혜연, 3. 박설리, 4. 박승주, 5. 가나혜, 6. 최윤정]
	
		System.out.println("================================");

		// 리스트 복사 1
		ArrayList<String> copyList = new ArrayList<>();
	
		System.out.println("================================");
		for(int i = 0; i < students.size(); i++) {
			copyList.add(students.get(i));
			System.out.println(copyList);
		}
		
		students.set(1, "2. 임동성");
		System.out.println(students);
		System.out.println(copyList);
		
		// 리스트 복사 2
		ArrayList<String> copyList2 = new ArrayList<>();
		
		copyList2.addAll(students);
		System.out.println(copyList2);
		
		students.set(1, "2. 찬웅쌤");
		System.out.println(students);
		System.out.println(copyList2);
	
		// 리스트 복사 3
		ArrayList<String> copyList3 = new ArrayList<>(students);
		System.out.println(copyList3);
		
		System.out.println("===============================");
		
		// 향상된 for문
		// 타 언어에서는 = forEach문 
		for(String stu : students) {
			System.out.println(stu);
		}
		// 인덱스가 존재하는 ArrayList에서는 
		// 큰 메리트가 있지는 않다. 그냥 for문 쓰면됨 
		
		// 위와 같은 for 문
		for(int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));
		}
		
		System.out.println("===============================");
		// forEach 문 절대 안씀
		students.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
			
		});
		
		// 람다식
		// 한줄 
		students.forEach(stu -> System.out.println(stu));
		// 여러줄
		students.forEach(stu -> {
			System.out.println(stu);
			System.out.println(stu);
		});
		
		// 값을 주면서 리스트 선언 
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(30, 23, 1, 66, 34, 143));
		
		numbers.add(25);
		numbers.add(51);
		numbers.add(55);
		numbers.add(45);
		numbers.add(35);
		System.out.println(numbers);
		// 정렬
		// 알고리즘
		for(int k = 0; k < numbers.size(); k++) {
			for(int j = 0; j < numbers.size()-1-k; j++) {
				// j > j+1 = 오름차순 
				// j < j+1 = 내림차순
				if(numbers.get(j) > numbers.get(j+1)) {
					int temp2 = numbers.get(j);
					numbers.set(j, numbers.get(j+1));
					numbers.set(j+1, temp2);
				}
			}
		}
		System.out.println(numbers);
		
		// 제공되는 메소드로 정렬하기
		// 오름차순 
		Collections.sort(numbers);
		System.out.println(numbers);
		//내림차순
		Collections.sort(numbers, Collections.reverseOrder());
		System.out.println(numbers);
		
		
		
		
	}

}
