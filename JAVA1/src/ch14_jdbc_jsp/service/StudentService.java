package ch14_jdbc_jsp.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import ch14_jdbc_jsp.dao.StudentDao;
import ch14_jdbc_jsp.jdbc.ConnectionPool;
import ch14_jdbc_jsp.model.StudentVO;

public class StudentService {
	private StudentDao dao = StudentDao.getInstance();
	private ConnectionPool cp = ConnectionPool.getInstance();
	
	private static StudentService instance = new StudentService();
	private StudentService() {
		
	}
	
	public static StudentService getInstance() {
		return instance;
	}
	
	// 회원목록 조회(SELECT)
	public ArrayList<StudentVO> getStuList(){
		Connection conn = cp.getConnection();
		try {
			return dao.getStuList(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) cp.releaseConnection(conn);
		}
		
		return new ArrayList<StudentVO>();
	}
	
	// 로그인(SELECT, WHERE)
	public StudentVO loginStu(String id) {
		Connection conn = cp.getConnection();
		
		try {
			return dao.loginStu(conn, id);
		} catch (SQLException e) {
			System.out.println("중복된 아이디");
		} finally {
			if(conn != null) cp.releaseConnection(conn);
		}
		return new StudentVO();
	}
	// 회원가입 (INSERT)
	public int insertStu(StudentVO stu) {
		Connection conn = cp.getConnection();
		
		try {
			return dao.insertStu(conn, stu);
		} catch (SQLException e) {
			System.out.println("중복된 아이디");
		} finally {
			if(conn != null) cp.releaseConnection(conn);
		}
		return 0;
	}
	
	// 회원수정(UPDATE)
	public int updateStu(StudentVO stu) {
		Connection conn = cp.getConnection();
		
		try {
			return dao.updateStu(conn, stu);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) cp.releaseConnection(conn);
		}
		return 0;
	}
}
