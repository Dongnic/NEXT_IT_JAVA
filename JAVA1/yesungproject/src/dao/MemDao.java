package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.MemVO;

public class MemDao {

	private  static MemDao instance = new MemDao();

	private MemDao() {
		
	}
	public static MemDao getInstance() {
		return instance;
	}


	// 회원 목록 조회
	public ArrayList<MemVO> getmemList(Connection conn) throws SQLException {
		StringBuffer query = new StringBuffer();
		query.append("SELECT							");
		query.append("			mem_id				");
		query.append("			,mem_pw				");
		query.append("			,mem_name				");
		query.append("FROM							");
		query.append("			member				");

		PreparedStatement ps = conn.prepareStatement(query.toString());
		ResultSet rs = ps.executeQuery();

		ArrayList<MemVO> result = new ArrayList<>();

		while (rs.next()) {
			MemVO temp = new MemVO();

			temp.setMem_id(rs.getString("mem_id"));
			temp.setMem_id(rs.getString("mem_pw"));
			temp.setMem_id(rs.getString("mem_name"));

			result.add(temp);
		}
		if (ps != null)
			ps.close();
		if (rs != null)
			rs.close();

		return result;
	}

	// 회원 가입
	public int registMem(Connection conn, MemVO mem) throws SQLException {
		StringBuffer query = new StringBuffer();
		query.append("insert into 			");
		query.append(" 		member			");
		query.append("values		(			");
		query.append(" 			 ?			");
		query.append(" 			,?			");
		query.append(" 			,?			");
		query.append(" 				)		");

		PreparedStatement ps = conn.prepareStatement(query.toString());

		int idx = 1;
		ps.setString(idx++, mem.getMem_id());
		ps.setString(idx++, mem.getMem_pw());
		ps.setString(idx++, mem.getMem_name());

		int cnt =ps.executeUpdate();
		if (ps != null)
			ps.close();

		return cnt;
	}

	// 중복체크
	public boolean duple(Connection conn, String id) throws SQLException {
		StringBuffer query = new StringBuffer();
		query.append("select					   ");
		query.append("	count(*)	as cnt	   ");
		query.append("from					");
		query.append("		member			");
		query.append("where	1=1				");
		query.append("and		mem_id = ?		");

		PreparedStatement ps = conn.prepareStatement(query.toString());

		int idx = 1;
		ps.setString(idx++, id);

		ResultSet rs = ps.executeQuery();
		int cnt = 0;
		while (rs.next()) {
			cnt = rs.getInt("cnt");
		}
		if (ps != null)
			ps.close();
		if (rs != null)
			rs.close();

		return (cnt == 1);

	}
	//로그인
	public MemVO loginMem(Connection conn,String id) throws SQLException {
		StringBuffer query=new StringBuffer();
		query.append("Select					");
		query.append("		mem_id			");
		query.append("		,mem_pw		");
		query.append("from					");
		query.append("		member			");
		query.append("where	1=1				");
		query.append("and	mem_id=?			");
		
		PreparedStatement ps=conn.prepareStatement(query.toString());
		
		int idx=1;
		ps.setString(idx++, id);
		
		ResultSet rs = ps.executeQuery();
		MemVO result = new MemVO();
		
		while(rs.next()) {
			result.setMem_id(rs.getString("mem_id"));
			result.setMem_id(rs.getString("mem_pw"));
		}
		if(ps!=null)ps.close();
		if(rs!=null)rs.close();
		
		return result;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
