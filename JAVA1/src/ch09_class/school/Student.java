package ch09_class.school;

import ch09_class.utilClass;

public class Student implements Comparable{
	// 캡슐화
	// 필드 변수(name, kor 등)에 private을 건다
	// 다른 클래스에서 .name 등으로 접근 불가능하게 됨
	
	private String name; // 이름
	private int kor;    // 국어점수
	private int eng;    // 영어점수
	private int math;   // 수학점수
	private double avg; // 평균
	
	// 기본 생성자
	public Student() {
		
	}
	
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		double average = (this.kor + this.eng + this.math) / 3.0;
//		this.avg = Math.round(average * 100) / 100.0;
		this.avg = utilClass.weRound(average, 2);
	}

	private void changeAvg() {
		this.avg = utilClass.weRound((this.kor + this.eng + this.math) / 3.0, 2);
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", avg=" + avg + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
		changeAvg();
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
		changeAvg();
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
		changeAvg();
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	@Override
	// < 0 오름차순 > 0 내림차순
	public int compareTo(Object stu2) {
		int result = 1;
		if(this.avg - ((Student)stu2).getAvg() > 0) {
			result = -1;
		}
		return result;
	}
	
	// 단축키 [Alt + Shift + S]
	// Generate getters and setters
	
}
