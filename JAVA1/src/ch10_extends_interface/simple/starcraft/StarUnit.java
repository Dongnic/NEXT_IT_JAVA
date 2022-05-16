package ch10_extends_interface.simple.starcraft;

public class StarUnit {

	private String name;
	private int damage;
	private int hp;
	private int amor;
	private int attackRange;
	private int moveSpeed;
	private int mineral;
	public String getName() {
		return name;
	}

	public void move(int x, int y) {
		System.out.println(x + ", " + y + "로 MOVE");
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

	public int getAmor() {
		return amor;
	}

	public void setAmor(int amor) {
		this.amor = amor;
	}

	public int getAttackRange() {
		return attackRange;
	}

	public void setAttackRange(int attackRange) {
		this.attackRange = attackRange;
	}

	public int getMoveSpeed() {
		return moveSpeed;
	}

	public void setMoveSpeed(int moveSpeed) {
		this.moveSpeed = moveSpeed;
	}

	public int getMineral() {
		return mineral;
	}

	public void setMineral(int mineral) {
		this.mineral = mineral;
	}

	public int getGas() {
		return gas;
	}

	public void setGas(int gas) {
		this.gas = gas;
	}

	private int gas;
	
	public StarUnit(String name, int damage, int hp, int amor, int attackRange, int moveSpeed, int mineral, int gas) {
		this.name = name;
		this.damage = damage;
		this.hp = hp;
		this.amor = amor;
		this.attackRange = attackRange;
		this.moveSpeed = moveSpeed;
		this.mineral = mineral;
		this.gas = gas;
	}
	
}
