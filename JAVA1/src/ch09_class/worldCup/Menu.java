package ch09_class.worldCup;

public class Menu {
	// 클래스 만들 때 필수
	// [ALT + Shift + S]
	
	// 1. 필드 변수 선언 + 캡슐화(private)
	private String name; // 음식이름
	private boolean isSelect = false; // 선택여부 
	
	// 2. Generate Constructor using fields
	public Menu(String name, boolean isSelect) {
		this.name = name;
		this.isSelect = isSelect;
	}
	
	public Menu(String name) {
		this.name = name;
	}
	
	// 3. 기본생성자
	public Menu() {
		
	}

	// 4. Generate toString()
	@Override
	public String toString() {
		return "Menu [name=" + name + ", isSelect=" + isSelect + "]";
	}

	// 5. Generate Getter & Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isSelect() {
		return isSelect;
	}

	public void setSelect(boolean isSelect) {
		this.isSelect = isSelect;
	}



}
