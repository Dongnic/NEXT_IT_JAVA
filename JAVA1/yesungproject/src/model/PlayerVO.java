package model;



public class PlayerVO {

	private ShipVO ship;
	
	public PlayerVO(ShipVO ship) {
		super();
		this.ship = ship;
	}

	public ShipVO getShip() {
		return ship;
	}

	public void setShip(ShipVO ship) {
		this.ship = ship;
	}
	
	
}
