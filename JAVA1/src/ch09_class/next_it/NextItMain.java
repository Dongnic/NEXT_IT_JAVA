package ch09_class.next_it;

import java.util.ArrayList;
import java.util.Collections;

// 실행(main 메소드)만 하는 클래스 
public class NextItMain {

	public static void main(String[] args) {
		
		// 변수이름을 각각 지정해줘야해서 불편함
		String nameDalHyun = "김달현";
		int ageDalHyun = 30;
		int levelDalHyun = 5;
		
		String nameHyeonSub = "염현섭";
		int ageHyeonSub = 30;
		int levelHyeonSub = 5;
		
		System.out.println("===============================");
		//클래스 객체 선언
		Student dalHyeon = new Student();
		System.out.println(dalHyeon); // ch09_class.next_it.Student@2a139a55
		
		// 객체의 필드 변수에 접근
		System.out.println(dalHyeon.name); // null
		System.out.println(dalHyeon.age);  // 0
		System.out.println(dalHyeon.level); // 0
		
		// 객체의 상태, 필드 변수에 값 넣기
		dalHyeon.name = "김달현";
		dalHyeon.age = 30;
		dalHyeon.level = 5;
		System.out.println(dalHyeon.name); // 김달현
		System.out.println(dalHyeon.age);  // 30
		System.out.println(dalHyeon.level); // 5
		
		System.out.println("===============================");
		
		// age에 1 추가
		dalHyeon.age++;
		System.out.println(dalHyeon.age);  // 31
		
		dalHyeon.printInfo();
		
		dalHyeon.nextDay();
		System.out.println(dalHyeon.level); 
		
		Student naGyeom = new Student();
		naGyeom.name = "송나겸";
		naGyeom.age = 25;
		naGyeom.level = 8;
		
		naGyeom.nextDay();
		System.out.println(naGyeom.name);
		System.out.println(naGyeom.age);
		System.out.println(naGyeom.level);
		
		System.out.println("=============================");
		
		// 필드 값을 입력 받는 생성자로 객체 선언 
		Student syuli = new Student("박설리", 32, 10);
		System.out.println(syuli.name);
		System.out.println(syuli.age);
		System.out.println(syuli.level);
		
		// 객체의 상태(State)를 한 번에 보고싶다면 
		System.out.println(syuli); // Student 클래스의 toString()이용
	
		// 이름과 나이만 입력받는 생성자로 객체 선언
		Student nahye = new Student("가나혜", 30);
		System.out.println(nahye); // 이름 : 가나혜 나이 : 30 레벨 : 0
		// level값이 없기때문에 Default값이 출력
		
		// level의 기본값을 1로 바꾸는 방법
		// 1. Student의 변수 level을 1로 초기화 해놓음
		// 2. 이름과 나이만 입력받는 생성자에 level을 1로 초기화 해놓음
		// 3. 이름과 나이만 입력받는 생성자에서 다른생성자로 접근시킴
		
		// 객체 복사
		Student nahyeBot = new Student(nahye.name + "봇", nahye.age, nahye.level);
		System.out.println(nahyeBot);
		
		// 각 객체들을 레벨업 해주기 
		dalHyeon.nextDay();
		naGyeom.nextDay();
		syuli.nextDay();
		nahye.nextDay();
		nahyeBot.nextDay();
		// 각각 해야돼서 불편함
		
		// 제너릭 명에 해당 객체 클래스 입력 
		ArrayList<Student> stuList = new ArrayList<>();
		
		stuList.add(dalHyeon);
		stuList.add(naGyeom);
		stuList.add(syuli);
		stuList.add(nahye);
		stuList.add(nahyeBot);
		
		for(int i = 0; i < stuList.size(); i++) {
			stuList.get(i).nextDay();
		}
		System.out.println("=========================");
		for(Student stu : stuList) {
			System.out.println(stu);
		}
		
		System.out.println("===========================");
		
		// 레벨을 이용하여 정렬하기
		// 버블정렬
		
		for(int k = 0; k < stuList.size(); k++) {
			for(int j = 0; j < stuList.size()-1-k; j++) {
				// j > j+1 = 오름차순 
				// j < j+1 = 내림차순
				if(stuList.get(j).level > stuList.get(j+1).level) {
					Student temp2 = stuList.get(j);
					stuList.set(j, stuList.get(j+1));
					stuList.set(j+1, temp2);
				}
			}
		}
		System.out.println("==================");
		for(int i = 0; i < stuList.size(); i++) {
			System.out.println(stuList.get(i));
		}
		
		System.out.println("=====================");
//		  람다식       참고할 대상  일시적 변수     변수들의 비교 할 값
		// 오름차순
		Collections.sort(stuList, (stu1, stu2) -> stu1.level - stu2.level);
		// 내림차순
		Collections.sort(stuList, (stu1, stu2) -> stu2.level - stu1.level);
		
		System.out.println("==================");
		for(int i = 0; i < stuList.size(); i++) {
			System.out.println(stuList.get(i));
		}
		
		
		
	} // main

}
