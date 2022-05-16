package ch10_extends_interface.simple.starcraft;

public class Zealot extends ProtossUnit {
	
	public Zealot() {
		super("질럿", 16, 100, 1, 1, 1, 100, 0, 60);
	}
	
	public void attack(StarUnit enermy) {
		enermy.setHp(enermy.getHp() - getDamage());
	}
	
}
