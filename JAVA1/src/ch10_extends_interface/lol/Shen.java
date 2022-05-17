package ch10_extends_interface.lol;

public class Shen extends Champion implements LolInterface, VoiceInterface{
	
	public Shen(String name, int damage, int hp) {
		super(name, damage, hp);
	}

	// 인터페이스를 구현(implement)하기 위해서는
	// extends가 아닌 implements를 사용한다
	// 상속과 같이 사용도 가능
	
	@Override
	public void skillQ() {
		System.out.println("Q공격");
	}

	@Override
	public void skillW() {
		System.out.println("W공격");
	}

	@Override
	public void skillE() {
		System.out.println("E공격");
	}

	@Override
	public void skillR() {
		System.out.println("R공격");
	}

	@Override
	public void ctrl1() {
		System.out.println("dance1");
	}

	@Override
	public void ctrl2() {
		System.out.println("dance2");
	}

	@Override
	public void ctrl3() {
		System.out.println("dance3");
	}

	@Override
	public void ctrl4() {
		System.out.println("dance4");
	}
}
