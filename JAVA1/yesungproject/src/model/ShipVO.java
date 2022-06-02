package model;

public class ShipVO {
	private int ship_no;
	private String ship_name;
	private int ship_gold;

	public ShipVO() {

	}

	public ShipVO(int ship_no, String ship_name, int ship_gold) {
		super();
		this.ship_no = ship_no;
		this.ship_name = ship_name;
		this.ship_gold = ship_gold;
	}

	@Override
	public String toString() {
		return "[" + ship_name + "||" + "소지금 : " + ship_gold + "]";
	}

	public int getShip_no() {
		return ship_no;
	}

	public void setShip_no(int ship_no) {
		this.ship_no = ship_no;
	}

	public String getShip_name() {
		return ship_name;
	}

	public void setShip_name(String ship_name) {
		this.ship_name = ship_name;
	}

	public int getShip_gold() {
		return ship_gold;
	}

	public void setShip_gold(int ship_gold) {
		this.ship_gold = ship_gold;
	}

}