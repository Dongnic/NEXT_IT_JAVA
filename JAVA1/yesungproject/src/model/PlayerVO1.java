package model;

import java.util.ArrayList;

public class PlayerVO1 {

	private ArrayList<String> ship1;
	private ArrayList<String> ship2;
	private ArrayList<String> ship3;
	private ArrayList<String> ship4;
	
	private static PlayerVO1 instance = new PlayerVO1();

	private PlayerVO1() {

	}

	public static PlayerVO1 getInstance() {
		return instance;
	}
	
	public PlayerVO1(ArrayList<String> ship1, ArrayList<String> ship2, ArrayList<String> ship3,
			ArrayList<String> ship4) {
		super();
		this.ship1 = ship1;
		this.ship2 = ship2;
		this.ship3 = ship3;
		this.ship4 = ship4;
	}
	@Override
	public String toString() {
		return "PlayerVO1 [ship1=" + ship1 + ", ship2=" + ship2 + ", ship3=" + ship3 + ", ship4=" + ship4 + "]";
	}
	public ArrayList<String> getShip1() {
		return ship1;
	}
	public void setShip1(ArrayList<String> ship1) {
		this.ship1 = ship1;
	}
	public ArrayList<String> getShip2() {
		return ship2;
	}
	public void setShip2(ArrayList<String> ship2) {
		this.ship2 = ship2;
	}
	public ArrayList<String> getShip3() {
		return ship3;
	}
	public void setShip3(ArrayList<String> ship3) {
		this.ship3 = ship3;
	}
	public ArrayList<String> getShip4() {
		return ship4;
	}
	public void setShip4(ArrayList<String> ship4) {
		this.ship4 = ship4;
	}
	
	
}
