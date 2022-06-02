package service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import dao.ShipDao;
import jdbc.ConnectionPool;
import model.ShipVO;

public class ShipGameService {
	private ShipDao dao =ShipDao.getInstance();
	private ConnectionPool cp = ConnectionPool.getInstance();
	private static ShipGameService instance =new ShipGameService();
	
	public static ShipGameService getInstance(){
		return instance;
	}
	
	private ShipGameService(){
		
	}
	
	//배 선택 
	
	public ArrayList<ShipVO> SelectShip() {
		Connection conn =cp.getConnection();
		
		try {
			return dao.SelectShip(conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(conn!=null)cp.releaseConnection(conn);
		}
		return null;
	}
	
	
	
	
}
