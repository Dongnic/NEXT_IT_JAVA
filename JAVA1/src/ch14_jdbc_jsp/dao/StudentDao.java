package ch14_jdbc_jsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import ch14_jdbc_jsp.model.StudentVO;

public class StudentDao {

	private static StudentDao instance = new StudentDao();
	public static StudentDao getInstance() {
		return instance;
	}
	private StudentDao() {
		
	}
	
	// 학생 목록 조회(SELECT)
	public ArrayList<StudentVO> getStuList(Connection conn) throws SQLException{
		StringBuffer query = new StringBuffer();
		query.append("SELECT                 ");
		query.append("	  stu_name			 ");
		query.append("  , stu_id	         ");
		query.append("	, stu_password		 ");
		query.append("	, stu_score			 ");
		query.append("FROM					 ");
		query.append("    students			 ");
		query.append("ORDER BY 4 desc		 ");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		ResultSet rs = ps.executeQuery();
		ArrayList<StudentVO> result = new ArrayList<>();

		while(rs.next()) {
			StudentVO temp = new StudentVO();
			temp.setStuId(rs.getString("stu_id"));
			temp.setStuname(rs.getString("stu_name"));
			temp.setStupassword(rs.getString("stu_password"));
			temp.setStuScore(rs.getInt("stu_score"));
//			String stuId = rs.getString("stu_id");
//			String stuName = rs.getString("stu_name");
//			String stuPassword = rs.getString("stu_password");
//			int stuScore = rs.getInt("stu_score");
			
			result.add(temp);
		} 
	
		if(ps != null) ps.close();
		if(rs != null) rs.close();
		
		return result;
	}
	// 회원가입 (INSERT)
	public int insertStu(Connection conn, StudentVO stu) throws SQLException {
		StringBuffer query = new StringBuffer();
		query.append("INSERT INTO       ");
		query.append("    students		");
		query.append("VALUES	( 		");
		query.append("	  ? 		 	");
		query.append("	, ?				");
		query.append("	, ?				");
		query.append("	, ?	)			");

		PreparedStatement ps = conn.prepareStatement(query.toString());
		int idx = 1;
		ps.setString(idx++, stu.getStuId());
		ps.setString(idx++, stu.getStuname());
		ps.setString(idx++, stu.getStupassword());
		ps.setInt(idx++, stu.getStuScore());
		
		int cnt = ps.executeUpdate();
		if(ps != null) ps.close();
		
		return cnt;
		}
	// 로그인 (SELECT, WHERE)
	public StudentVO loginStu(Connection conn, String id) throws SQLException {
		StringBuffer query = new StringBuffer();
		query.append("SELECT                 ");
		query.append("	  stu_name			 ");
		query.append("  , stu_id	         ");
		query.append("	, stu_password		 ");
		query.append("	, stu_score			 ");
		query.append("FROM					 ");
		query.append("    students			 ");
		query.append("WHERE 1=1 			 ");
		query.append("AND stu_id = ?		 ");
		PreparedStatement ps = conn.prepareStatement(query.toString());
		int idx = 1;
		ps.setString(idx++, id);
		ResultSet rs = ps.executeQuery();
		StudentVO result = new StudentVO();
		
		while(rs.next()) {
			result.setStuId(rs.getString("stu_id"));
			result.setStuname(rs.getString("stu_name"));
			result.setStupassword(rs.getString("stu_password"));
			result.setStuScore(rs.getInt("stu_score"));
		}
		if(ps != null) ps.close();
		if(rs != null) rs.close();
		System.out.println(result);
		return result;
	}
	public int updateStu(Connection conn, StudentVO stu) throws SQLException {
		StringBuffer query = new StringBuffer();
		query.append("UPDATE                 ");
		query.append("    students			 ");
		query.append("SET			 		 ");
		query.append("  stu_name = ?		 ");
		query.append("  ,stu_password = ?	 ");
		query.append("  ,stu_score = ?		 ");
		query.append("WHERE 1=1 			 ");
		query.append("AND stu_id = ?		 ");
		PreparedStatement ps = conn.prepareStatement(query.toString());
		int idx = 1;
		
		ps.setString(idx++, stu.getStuname());
		ps.setString(idx++, stu.getStupassword());
		ps.setInt(idx++, stu.getStuScore());
		ps.setString(idx++, stu.getStuId());
		
		int cnt = ps.executeUpdate();
		if(ps!=null) ps.close();
		return cnt;
	}
}
