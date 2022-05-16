package ch10_extends_interface.simple.starcraft;

public class Marin extends StarUnit {

	public Marin() {
		super("마린", 6, 50, 0, 4, 2, 50, 0);
//		super.setName("마린");
//		this.damage = 6;
//		this.hp = 50;
//		this.amor = 0;
//		this.attackRange = 4;
//		this.moveSpeed = 1;
//		this.mineral = 50;
//		this.gas = 0;
	}
	
	public void stimpack() {
		System.out.println("STIM PACK !!");
		// 스팀팩쓰면 체력 10 감소, 속도 두배
		super.setHp(super.getHp() - 10);
		super.setMoveSpeed(super.getMoveSpeed()*2);
	
	}
	
}
