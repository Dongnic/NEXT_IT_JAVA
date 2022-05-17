package ch10_extends_interface.rpg;

public class Character {
	private String name;
	private int damage;
	private int hp;
	
	public Character() {
		
	}
	public Character(String name, int damage, int hp) {
		super();
		this.name = name;
		this.damage = damage;
		this.hp = hp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	@Override
	public String toString() {
		return "Character [name=" + name + ", damage=" + damage + ", hp=" + hp + "]";
	}
	
	
}
