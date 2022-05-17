package ch10_extends_interface.rpg;

public class Warrior extends User {
	
	public Warrior(String name, int damage, int hp, Jobs job) {
		super(name, damage, hp, job);
	}
	
	@Override
	public void skill(Enermy enermy) {

		// switch문을 사용함
		switch(job) {
		case WARRIOR_HANSON:
			System.out.println("한손검 스킬 사용");
			enermy.setHp(enermy.getHp() - Constants.SKILL_HANSON_DAMAGE);
			break;
		case WARRIOR_DOOSON:
			System.out.println("두손검 스킬 사용");
			enermy.setHp(enermy.getHp() - Constants.SKILL_DOOSON_DAMAGE);
			break;
		default:
			break;
		}
		System.out.println(enermy.getName() + "체력 : " + enermy.getHp());
		
		if(enermy.getHp() <= 0) {
			enermy.die();
		}
	}
	
	@Override
	public String toString() {
		return "Warrior [name=" + getName() + ", damage=" + getDamage() + ", hp=" + getHp() + "]";
	}
	
	
}
