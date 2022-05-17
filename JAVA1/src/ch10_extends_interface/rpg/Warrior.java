package ch10_extends_interface.rpg;

public class Warrior extends Character {
	private String name;
	private int damage;
	private int hp;
	
	public Warrior(String name, int damage, int hp) {
		super(name, damage, hp);
	}
	@Override
	public String toString() {
		return "Warrior [name=" + getName() + ", damage=" + getDamage() + ", hp=" + getHp() + "]";
	}
	
	
}
