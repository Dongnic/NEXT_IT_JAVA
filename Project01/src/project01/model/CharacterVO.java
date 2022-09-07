package project01.model;

public class CharacterVO {
	private String memId; // 회원아이디
	private String name; // 캐릭터 이름
	private int money;	// 캐릭터 돈
	// 기본 생성자
	public CharacterVO() {
		
	}
	public CharacterVO(String name, int money) {
		
		this.memId = memId;
		this.name = name;
		this.money = money;
	}
	public CharacterVO(String memId, String name, int money) {
		this.memId = memId;
		this.name = name;
		this.money = money;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	@Override
	public String toString() {
		return "CharacterVO [memId=" + memId + ", name=" + name + ", money=" + money + "]";
	}
	
}
