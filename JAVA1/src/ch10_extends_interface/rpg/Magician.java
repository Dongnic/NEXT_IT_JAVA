package ch10_extends_interface.rpg;

public class Magician extends User{

	public Magician(String name, int damage, int hp, Jobs job) {
		super(name, damage, hp, job);
	}

	@Override
	public void skill(Enermy enermy) {
		switch(job) {
		case MAGIC_FIRE:
			System.out.println("불 스킬 사용");
			enermy.setHp(enermy.getHp() - Constants.SKILL_MAGICFIRE_DAMAGE);
			break;
		case MAGIC_ICE:
			System.out.println("얼음 스킬 사용");
			enermy.setHp(enermy.getHp() - Constants.SKILL_MAGICICE_DAMAGE);
			break;
		default:
			break;
		}
		System.out.println(enermy.getName() + "체력 : " + enermy.getHp());
		if(enermy.getHp() <= 0) {
			enermy.die();
		}
	}

}
