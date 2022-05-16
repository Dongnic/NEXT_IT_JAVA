package ch10_extends_interface.simple.starcraft;

public class HighTemplar extends ProtossUnit{
	// 아래 필드 변수들은 Zealot에서 복사 붙여넣기함 = 중복코드
	// 중복코드를 한데 묶어두면 편함 
	private int mp;
	
	public HighTemplar() {
		super("하이템플러", 0, 40, 0, 1, 1, 50, 150, 40);
		this.mp = 225;
	}

	public void psionicStorm() {
		System.out.println("Storm!!");
		mp -= 75;
	}
	
	public void hallucination() {
		System.out.println("Hallucination");
		mp -= 100;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

}
