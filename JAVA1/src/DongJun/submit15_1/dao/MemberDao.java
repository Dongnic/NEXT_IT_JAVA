package DongJun.submit15_1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import DongJun.submit15_1.model.MemberVO;

public class MemberDao {
	private static MemberDao instance = new MemberDao();
	public static MemberDao getInstance() {
		return instance;
	}
	private MemberDao() {
		
	}
	// 회원 목록 조회(SELECT)
	public ArrayList<MemberVO> getMemList(Connection conn) throws SQLException{
		StringBuffer query = new StringBuffer();
		// 멤버 테이블을 조회 
		query.append("SELECT				");
		query.append(" 		mem_id			");
		query.append(" 	  , mem_pw			");
		query.append("FROM					");
		query.append("		members			");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		ResultSet rs = ps.executeQuery();
		// 조회된 결과를 담는 리스트 생성 
		ArrayList<MemberVO> result = new ArrayList<>();
		
		while(rs.next()) {
			MemberVO temp = new MemberVO();
			temp.setMemId(rs.getString("mem_id"));
			temp.setMemPw(rs.getString("mem_pw"));
			result.add(temp);
		} 
	
		if(ps != null) ps.close();
		if(rs != null) rs.close();
		
		return result;
	}
//	회원가입
	public int insertMem(Connection conn, MemberVO mem) throws SQLException {
		StringBuffer query = new StringBuffer();
		query.append("INSERT INTO       ");
		query.append("    members		");
		query.append("VALUES	( 		");
		query.append("	  ? 		 	");
		query.append("	, ?	)			");

		PreparedStatement ps = conn.prepareStatement(query.toString());
		int idx = 1;
		ps.setString(idx++, mem.getMemId());
		ps.setString(idx++, mem.getMemPw());
		
		int cnt = ps.executeUpdate();
		if(ps != null) ps.close();
		
		return cnt;
	}
	// 로그인 (SELECT, WHERE)
		public MemberVO loginMem(Connection conn, String id) throws SQLException {
			StringBuffer query = new StringBuffer();
			query.append("SELECT                 ");
			query.append("    mem_id	         ");
			query.append("	, mem_pw			 ");
			query.append("FROM					 ");
			query.append("    members			 ");
			query.append("WHERE 1=1 			 ");
			query.append("AND mem_id = ?		 ");
			PreparedStatement ps = conn.prepareStatement(query.toString());
			int idx = 1;
			ps.setString(idx++, id);
			ResultSet rs = ps.executeQuery();
			MemberVO result = new MemberVO();
			
			while(rs.next()) {
				result.setMemId(rs.getString("mem_id"));
				result.setMemPw(rs.getString("mem_pw"));
			}
			if(ps != null) ps.close();
			if(rs != null) rs.close();
			return result;
		}

}
