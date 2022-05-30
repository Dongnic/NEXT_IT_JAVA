package project01.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import project01.model.CharacterVO;
import project01.model.MemberVO;

public class CharacterDao {
private static CharacterDao instance = new CharacterDao();
	
	public static CharacterDao getInstace() {
		return instance;
	}
	private CharacterDao() {
		
	}
	// 캐릭터 생성
	public int makeCharacter(Connection conn, CharacterVO ct) throws SQLException {
		StringBuffer query = new StringBuffer();
		query.append("INSERT INTO				");
		query.append("	  character			 	");
		query.append("VALUES  (					");
		query.append("	   ?					");
		query.append("	  ,? 					");
		query.append("	  ,? 					");
		query.append("	  )						");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		
		int idx = 1;
		ps.setString(idx++, ct.getMemId());
		ps.setString(idx++, ct.getName());
		ps.setInt(idx++, ct.getMoney());
		
		int cnt = ps.executeUpdate();
		if(ps != null) ps.close();
		return cnt;
	}
	// 캐릭터 목록
	public ArrayList<CharacterVO> characterList(Connection conn) throws SQLException{
		StringBuffer query = new StringBuffer();
		query.append("SELECT						");
		query.append("	  mem_id					");
		query.append("	, name						");
		query.append("	, money 					");
		query.append("FROM							");
		query.append("	  character					");
		query.append("ORDER BY 3					");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		ResultSet rs = ps.executeQuery();
		ArrayList<CharacterVO> result = new ArrayList<>();
		
		while(rs.next()) {
			CharacterVO temp = new CharacterVO();
			temp.setMemId(rs.getString("mem_no"));
			temp.setName(rs.getString("name"));
			temp.setMoney(rs.getInt("money"));
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
	// 캐릭터 정보 업데이트
	public int updateCharacter(Connection conn, int money, String name) throws SQLException {
		StringBuffer query = new StringBuffer();
		query.append("UPDATE                 ");
		query.append("    character			 ");
		query.append("SET			 		 ");
		query.append("  money = ?			 ");
		query.append("WHERE 1=1 			 ");
		query.append("AND name = ?		 ");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());

		int idx = 1;
		ps.setInt(idx++, money);
		ps.setString(idx++, name);
		
		int cnt = ps.executeUpdate();
		if(ps!=null) ps.close();
		return cnt;
	}
	// 캐릭터 삭제
	public int deleteCharacter(Connection conn, String name) throws SQLException {
		StringBuffer query = new StringBuffer();
		query.append("DELETE                 ");
		query.append("    character			 ");
		query.append("WHERE 1=1 			 ");
		query.append("AND name = ?		 ");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());

		int idx = 1;
		ps.setString(idx++, name);
		
		int cnt = ps.executeUpdate();
		if(ps!=null) ps.close();
		return cnt;
	}
	//로그인 (SELECT, WHERE)
	public CharacterVO logincha(Connection conn, String name) throws SQLException {
		StringBuffer query = new StringBuffer();
		query.append("SELECT                 ");
		query.append("    name		         ");
		query.append("FROM					 ");
		query.append("    character			 ");
		query.append("WHERE 1=1 			 ");
		query.append("AND name = ?			 ");
		PreparedStatement ps = conn.prepareStatement(query.toString());
		int idx = 1;
		ps.setString(idx++, name);
		ResultSet rs = ps.executeQuery();
		CharacterVO result = new CharacterVO();
		
		while(rs.next()) {
			result.setName(rs.getString("name"));
		}
		if(ps != null) ps.close();
		if(rs != null) rs.close();
		return result;
	}
	// 돈 가져오기 
	public CharacterVO getMoney(Connection conn, String name) throws SQLException {
		StringBuffer query = new StringBuffer();
		query.append("SELECT                 ");
		query.append("    money		         ");
		query.append("FROM					 ");
		query.append("    character			 ");
		query.append("WHERE 1=1 			 ");
		query.append("AND name = ?			 ");
		PreparedStatement ps = conn.prepareStatement(query.toString());
		int idx = 1;
		ps.setString(idx++, name);
		ResultSet rs = ps.executeQuery();
		CharacterVO result = new CharacterVO();
		
		while(rs.next()) {
			result.setMoney(rs.getInt("money"));
		}
		if(ps != null) ps.close();
		if(rs != null) rs.close();
		return result;
	}
	//로그인 (SELECT, WHERE)
	public CharacterVO getCharacter(Connection conn, String id, String name) throws SQLException {
		StringBuffer query = new StringBuffer();
		System.out.println(id+ " " +name);
		String name2 = "'"+name+"'";
		System.out.println(name2);
		query.append("SELECT                 ");
		query.append("     mem_id	         ");
		query.append("   , name		         ");
		query.append("   , money		     ");
		query.append("FROM					 ");
		query.append("    character			 ");
		query.append("WHERE 1=1 			 ");
		query.append("AND mem_id = ?		 ");
		query.append("AND name like ?	     ");
		PreparedStatement ps = conn.prepareStatement(query.toString());
		int idx = 1;
		ps.setString(idx++, id);
		ps.setString(idx++, name);
		ResultSet rs = ps.executeQuery();
		CharacterVO result = new CharacterVO();
		
		while(rs.next()) {
			result.setMemId(rs.getString("mem_id"));
			result.setName(rs.getString("name"));
			result.setMoney(rs.getInt("money"));
		}
		if(ps != null) ps.close();
		if(rs != null) rs.close();
		return result;
	}	
}
