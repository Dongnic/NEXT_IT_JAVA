package main;

import java.util.ArrayList;

import model.PlayerVO;
import model.ShipVO;

public class Event {
	String monitor;
	ShipVO ship;
	int event;
	int row;
	int col;
	
	// event 이 0이면 이벤트 없음
	// 1이면 난파, 2면 처음으로, 3이면 도박 4면 골인
	
	public Event(){}
	
	public Event(int row, int col) {
		super();
		this.monitor = "[                ]";
		this.row = row;
		this.col = col;
		this.event = 0;
	}
	
	public Event(ShipVO ship, int event, int row, int col) {
		super();
		this.monitor = "[                ]";
		this.ship = ship;
		this.event = event;
		this.row = row;
		this.col = col;
	}

	@Override
	public String toString() {
		if(ship == null) {
			return "[                ]";
		}
		
		return "[    " + ship.getShip_name() + "    ]";
	}
	
	
	
	public String rightToString() {
		if(ship != null) {
			return "[                ]";
		}
		col=col+1;
		return  "[    " + ship.getShip_name() + "    ]";
	}
	
	
	public String  left(Event user) {
		if(ship !=null) {
			user.col-=1;
		}
		return "[    " + ship.getShip_name() + "    ]";
	}
	public String  up() {
		if(ship !=null) {
			row= row -1;
		}
		return "[    " + ship.getShip_name() + "    ]";
	}
	public String  down() {
		if(ship !=null) {
			row= row +1;
		}
		return "[    " + ship.getShip_name() + "    ]";
	}
	
}
