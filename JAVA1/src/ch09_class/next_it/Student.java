package ch09_class.next_it;

public class Student {

//  필드 영역
	// 학생(Student) 클래스의 상태(State)를
	// 필드 변수로 선언
	// 필드 변수의 값을 꼭 초기화(init)하지 않아도 됨.
	// 기본 값 String null / int 0 / boolean false 
	
	String name; // Default null
	int age;  // Default 0
	int level; // Default 0
	boolean isSubmit = false;
	
// 생성자 영역	
	// 기본 생성자 
	// 클래스 내에서 생성자를 따로 만들지 않으면 생략된 상태로 존재
	
	// 생성자를 따로 만들어 주었다면,
	// 생략된 생성자는 존재하지 않고 해당 생성자의 파라미터에 맞춰 사용해야함
	// (하지만 기본생성자를 따로 생성해주면 오버로딩을 통해 사용가능)
	Student(){
		System.out.println("기본 생성자 실행!");
	}

	// 단축키 [ ALT + Shift + S ]
	// Generate toSting()... 선택
	// Override는 부모클래스의 메소드를
	// 자식 클래스에서 재정의 하는 것을 말한다.
	// (원래 Object.class에 있던 toString()을 사용하지 않고 (Object 쓰고 클릭하면 볼 수 있음)
	//  아래 자식클래스의 toString()을 사용하겠다는 의미 )
	@Override
	public String toString() {
		return "이름: " + name + "\n나이: " + age + "\n레벨: " + level + "\n과제제출: " 
				 + isSubmit;
	}
	// 생성자
	// 단축키 [ALT + Shift + S]
	// or 마우스 우클릭 [Source]
	// Generate Constructor using Fields 선택
	// (필드 내에 변수를 사용해서 생성자를 만듬) 
	Student(String inputname, int inputage, int level){
		name = inputname; // Student class의 name에 입력들어온 name을 저장 // 헷갈림
		age = inputage; // 헷갈림은 없어졌지만 통일성이 떨어짐
		this.level = level; // this. 은 해당 클래스의 변수를 말함
	}
	// 생성자 
	// 이름과 나이만 입력받는 생성자 
	Student(String name, int age){
		//this.name = name;
		//this.age = age;
//		//this.level = 1;
//		this(); // 본인 생성자인 기본 생성자 Student()로 넘겨줌 
		this(name, age, 1); // 본인 생성자인 Student(String inputname, int inputage, int level)로 넘겨줌 
	
	}
	
	
	// 단축키로 만든 생성자 
//public Student(String name, int age, int level) {
//		super(); // 부모 생성 
//		this.name = name;
//		this.age = age;
//		this.level = level;
//	}

	//  메소드 영역	
	// 접근 제어자(public, private 등)
	// 기입하지 않은 경우 = Default
	// Default 동일한 패키지 안에서만 사용 가능
	// protected Default와 같음 
	// private 현재 클래스 내에서만 사용 가능
	// public 어디서나 사용 가능
	public void nextDay() {
		levelUp();
	}
	
	private void levelUp() {
		int randInt = (int)(Math.random()*5);
		// static
		level += randInt;
	}
	
	static void printInfo() {
		System.out.println("안녕하세요");
	}
	
	
	
}
