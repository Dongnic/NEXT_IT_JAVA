package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;

import model.ShipVO;

public class ShipDao {

	private static ShipDao instance = new ShipDao();

	private ShipDao() {

	}

	public static ShipDao getInstance() {
		return instance;
	}

	// 배 선택
	public ArrayList<ShipVO> SelectShip(Connection conn) throws SQLException {
		StringBuffer query = new StringBuffer();
		query.append("Select					");
		query.append("		ship_no		");
		query.append("		,ship_name			");
		query.append("		,ship_gold		");
		query.append("from					");
		query.append("		SHIPGAME			");

		PreparedStatement ps = conn.prepareStatement(query.toString());

		ResultSet rs = ps.executeQuery();
		ArrayList<ShipVO> result = new ArrayList();

		while (rs.next()) {
			ShipVO temp = new ShipVO();
			temp.setShip_no(rs.getInt("ship_no"));
			temp.setShip_name(rs.getString("ship_name"));
			temp.setShip_gold(rs.getInt("ship_gold"));
			result.add(temp);
			Collections.shuffle(result);
		}
		if (ps != null)
			ps.close();
		if (rs != null)
			ps.close();
		
		return result;

	}

}
