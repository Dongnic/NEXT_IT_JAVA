package DongJun.submit15.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import DongJun.submit15.model.HomepageVO;

public class HomepageDao {
private static HomepageDao instance = new HomepageDao();
	
	public static HomepageDao getInstace() {
		return instance;
	}
	private HomepageDao() {
		
	}
	// 글작성 (INSERT)
	public int insertGeul(Connection conn, HomepageVO mem) throws SQLException {
		StringBuffer query = new StringBuffer();
		query.append("INSERT INTO				");
		query.append("	  board				 	");
		query.append("VALUES  (					");
		query.append("	   ?					");
		query.append("	  ,?					");
		query.append("	  ,?					");
		query.append("	  ,? 					");
		query.append("	  ,? 					");
		query.append("	  )						");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		
		int idx = 1;
		ps.setInt(idx++, mem.getMem_no());
		ps.setString(idx++, mem.getMem_title());
		ps.setString(idx++, mem.getMem_content());
		ps.setString(idx++, mem.getMem_author());
		ps.setString(idx++, mem.getMem_date());
		
		
		int cnt = ps.executeUpdate();
		if(ps != null) ps.close();
		return cnt;
		
	}
	// 글조회
		public ArrayList<HomepageVO> getGeulList(Connection conn) throws SQLException{
			StringBuffer query = new StringBuffer();
			query.append("SELECT							");
			query.append("	  mem_no						");
			query.append("	, mem_title						");
			query.append("	, mem_content 					");
			query.append("	, mem_author					");
			query.append("	, mem_date						");
			query.append("FROM								");
			query.append("	  board							");
			PreparedStatement ps = conn.prepareStatement(query.toString());
			ResultSet rs = ps.executeQuery();
			
			ArrayList<HomepageVO> result = new ArrayList<>();
			
			while(rs.next()) {
				HomepageVO temp = new HomepageVO();
				temp.setMem_no(rs.getInt("mem_no"));
				temp.setMem_title(rs.getString("mem_title"));
				temp.setMem_content(rs.getString("mem_content"));
				temp.setMem_author(rs.getString("mem_author"));
				temp.setMem_date(rs.getString("mem_date"));
				result.add(temp);
			}
			if (ps != null) {
				ps.close();
			}
			if (rs != null) {
				rs.close();
			}
			return result;
		}
// 글조회
		public HomepageVO getGeulSearch(Connection conn, int no) throws SQLException{
			StringBuffer query = new StringBuffer();
			query.append("SELECT						");
			query.append("	  mem_no					");
			query.append("	, mem_title					");
			query.append("	, mem_content 				");
			query.append("	, mem_author				");
			query.append("	, mem_date					");
			query.append("FROM							");
			query.append("	  board						");
			query.append("WHERE 1=1						");
			query.append("AND mem_no = ?				");
			PreparedStatement ps = conn.prepareStatement(query.toString());
			int idx = 1;
			ps.setInt(idx++, no);
			
			ResultSet rs = ps.executeQuery();
//			ArrayList<HomepageVO> result = new ArrayList<>();
			HomepageVO result = new HomepageVO();
			while(rs.next()) {
				result.setMem_no(rs.getInt("mem_no"));
				result.setMem_title(rs.getString("mem_title"));
				result.setMem_content(rs.getString("mem_content"));
				result.setMem_author(rs.getString("mem_author"));
				result.setMem_date(rs.getString("mem_date"));
			}
			if (ps != null) {
				ps.close();
			}
			if (rs != null) {
				rs.close();
			}
			return result;
		}
}
