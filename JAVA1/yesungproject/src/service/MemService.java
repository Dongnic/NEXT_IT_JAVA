package service;

import java.sql.Connection;
import java.sql.SQLException;

import dao.MemDao;
import jdbc.ConnectionPool;
import model.MemVO;

public class MemService {

	private MemDao dao=MemDao.getInstance();
	private ConnectionPool cp =ConnectionPool.getInstance();
	
	private static MemService instance = new MemService();
	
	public static MemService getInstance() {
		return instance;
	}
	
	private MemService() {
		
	}
	//회원가입
	public int registMem(MemVO mem) {
		Connection conn=cp.getConnection();
		
		try {
			return dao.registMem(conn,mem);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(conn != null)cp.releaseConnection(conn);
		}
		return 0;
	}
	//중복체크
	public boolean duple(String id) {
		Connection conn=cp.getConnection();
		
		try {
			return dao.duple(conn, id);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(conn != null)cp.releaseConnection(conn);
		}
		return false;
	}
	//로그인
	public MemVO loginMem(String id) {
		Connection conn=cp.getConnection();
		try {
			return dao.loginMem(conn, id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(conn!=null)cp.releaseConnection(conn);
		}
		return null;
	}
	
	
	
	
}
