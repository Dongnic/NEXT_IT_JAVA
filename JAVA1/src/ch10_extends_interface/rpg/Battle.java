package ch10_extends_interface.rpg;

// 콜백함수를 구현하기 위한 인터페이스 
public interface Battle {
	// 전투에서 사망 시 실행될 콜백함수
	public void outOfBattle();
}
