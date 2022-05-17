package ch10_extends_interface.rpg;

public abstract class User extends Character{
	public Jobs job;

	public User(String name, int damage, int hp, Jobs job) {
		super(name, damage, hp);
		this.job = job;
	}
	
	public void attack(Enermy enermy) {
		System.out.println(enermy.getName() + "를 공격합니다.");
		enermy.setHp(enermy.getHp() - super.getDamage());
		System.out.println(super.getDamage() + "만큼 피해를 입혔습니다.");
	
		super.setHp(super.getHp() - enermy.getDamage());
		System.out.println(enermy.getDamage() + "만큼 피해를 입었습니다.");
		
		System.out.println(super.getName() + "의 체력은 " + super.getHp());
		System.out.println(enermy.getName() + "의 체력은 " + enermy.getHp());
	
		if(enermy.getHp() <= 0) {
			enermy.die();
		}
		if(super.getHp() <= 0) {
			super.die();
		}
	}
	
	public abstract void skill(Enermy enermy);
	
	// enum은 class안에서 사용도 가능하며, 따로 enum파일을 만들 수도 있음
	public enum Jobs {
		
		  WARRIOR_HANSON
		, WARRIOR_DOOSON
		, MAGIC_FIRE
		, MAGIC_ICE
		
	}
	
}
