package DongJun.submit15.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import DongJun.submit15.dao.MemberDao;
import DongJun.submit15.jdbc.ConnectionPool;
import DongJun.submit15.model.MemberVO;

public class MemberService {
	private MemberDao dao = MemberDao.getInstance();
	private ConnectionPool cp = ConnectionPool.getInstance();
	
	private static MemberService instance = new MemberService();
	private MemberService() {
		
	}
	
	public static MemberService getInstance() {
		return instance;
	}
	// 회원목록 조회(SELECT)
		public ArrayList<MemberVO> getMemList(){
			Connection conn = cp.getConnection();
			try {
				return dao.getMemList(conn);
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				if(conn != null) cp.releaseConnection(conn);
			}
			return new ArrayList<MemberVO>();
		}
	// 로그인(SELECT, WHERE)
	public MemberVO loginMem(String id) {
		Connection conn = cp.getConnection();
		
		try {
			return dao.loginMem(conn, id);
		} catch (SQLException e) {
			System.out.println("중복된 아이디");
		} finally {
			if(conn != null) cp.releaseConnection(conn);
		}
		return new MemberVO();
	}
	// 회원가입 (INSERT)
	public int insertMem(MemberVO mem) {
		Connection conn = cp.getConnection();
		
		try {
			return dao.insertMem(conn, mem);
		} catch (SQLException e) {
			System.out.println("중복된 아이디");
		} finally {
			if(conn != null) cp.releaseConnection(conn);
		}
		return 0;
	}	
}
