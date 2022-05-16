package ch10_extends_interface.simple.starcraft;

public class ProtossUnit extends StarUnit{
	// StarUnit -> ProtossUnit -> 질럿, 하이템플러 
	
	private int sheild;

	public ProtossUnit(String name, int damage, int hp, int amor, int attackRange, int moveSpeed, int mineral,
			int gas, int sheild) {
		super(name, damage, hp, amor, attackRange, moveSpeed, mineral, gas);
		this.sheild = sheild;
	}

	public int getSheild() {
		return sheild;
	}

	public void setSheild(int sheild) {
		this.sheild = sheild;
	}
	
}
