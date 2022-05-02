package ch09_class.school;

import java.util.ArrayList;
import java.util.Collections;

import ch09_class.utilClass;

public class SchoolMain {

	public static void main(String[] args) {

		Student yunbin = new Student();
		yunbin.setName("신윤빈");
		yunbin.setKor(90);
		yunbin.setEng(89);
		yunbin.setMath(89);
		yunbin.setAvg((yunbin.getKor() + yunbin.getEng() + yunbin.getMath()) / 3.0);
		System.out.println(yunbin.getAvg());
		yunbin.setAvg((Math.round(yunbin.getAvg()*100)) / 100.0);
		System.out.println(yunbin.getAvg());
		yunbin.setAvg(utilClass.weRound(yunbin.getAvg(), 2));
		System.out.println(yunbin.getAvg());
		
		System.out.println("===========================================");
		
		Student dongjun = new Student("유동준",80,80,79);
		System.out.println(dongjun);
		System.out.println(yunbin);
		
		dongjun.setKor(22);
		System.out.println(dongjun); // kor만 바뀌고 avg는 바뀌지 않음 
		
		System.out.println("==========================================");
		// set() 생성자에 평균을 바꾸는 구문 추가
		yunbin.setEng(5);
		System.out.println(yunbin);
		
		// 평균을 임의로 바꿀 수 있는 문제가 생김
//		dongjun.setAvg(111);
		System.out.println(dongjun);
		// = setAvg()를 아예 지워버림
		
		System.out.println("==========================================");
		ArrayList<Student> stuList = new ArrayList<>();
		// 이미 생성된 Student 객체 ArrayList에 삽입
		stuList.add(yunbin);
		stuList.add(dongjun);
		// 생성하며 삽입
		stuList.add(new Student("박기현",100,90,89));
		stuList.add(new Student("임동성",50,90,78));
		stuList.add(new Student("황의창",11,35,15));
		
		for(int i = 0; i < stuList.size(); i++) {
			System.out.println(stuList.get(i));
		}
		
//		stuList의 학생들의 평균을 이용해서 종협성적표를 출력해주세요
//		1등 이름 국어 -- 영어 -- 수학 -- 평균 -- 
		for(int i = 0; i < stuList.size(); i++) {
			stuList.get(i).getAvg();			
		}
		for(int k = 0; k < stuList.size(); k++) {
			for(int j = 0; j < stuList.size()-1-k; j++) {
				// j > j+1 = 오름차순 
				// j < j+1 = 내림차순
				if(stuList.get(j).getAvg() < stuList.get(j+1).getAvg()) {
					Student temp2 = stuList.get(j);
					stuList.set(j, stuList.get(j+1));
					stuList.set(j+1, temp2);
				}
			}
		}
		System.out.println("==========================================");
		for(int i = 0; i < stuList.size(); i++) {
			Student stu = stuList.get(i);
			System.out.println(i+1 + "등" + " 이름 : " + stu.getName() + " 국어 : " + stu.getKor() +
								" 영어 : " + stu.getEng() + " 수학 : " + stu.getMath() + " 평균 : " + stu.getAvg());
		}
	
		// Collections.sort 쓰기 
		Collections.sort(stuList, (stu1, stu2) -> 
			(((Student)(stu1)).getAvg() - ((Student)(stu2)).getAvg() < 0 ) ? 1 : -1  
		);
		
		Collections.sort(stuList);
		System.out.println("==========================================");
		for(int i = 0; i < stuList.size(); i++) {
			Student stu = stuList.get(i);
			System.out.println(i+1 + "등" + " 이름 : " + stu.getName() + " 국어 : " + stu.getKor() +
								" 영어 : " + stu.getEng() + " 수학 : " + stu.getMath() + " 평균 : " + stu.getAvg());
		}
		
		
	}// main
}
