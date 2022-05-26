package DongJun.submit15_1.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import DongJun.submit15_1.dao.HomepageDao;
import DongJun.submit15_1.jdbc.ConnectionPool;
import DongJun.submit15_1.model.HomepageVO;

public class HomepageService {
	private HomepageDao dao = HomepageDao.getInstace();
	private ConnectionPool cp = ConnectionPool.getInstance();
	private static HomepageService instance = new HomepageService();
	
	public static HomepageService getInstance() {
		return instance;
	}
	private HomepageService() {
		
	}
	
	// 글 목록
	public ArrayList<HomepageVO> getGeulList(){
		Connection conn = cp.getConnection();
		
		try {
			return dao.getGeulList(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) cp.releaseConnection(conn);
		}
		return new ArrayList<HomepageVO>();
	}
	// 글 조회
	public HomepageVO getGeulSearch(int no){
		Connection conn = cp.getConnection();
		
		try {
			return dao.getGeulSearch(conn, no);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) cp.releaseConnection(conn);
		}
		return new HomepageVO();
	}
	
//  글쓰기 (INSERT)
	public int insertGeul(HomepageVO geul) {
		Connection conn = cp.getConnection();
		
		try {
			return dao.insertGeul(conn, geul);
		} catch (SQLException e) {
			System.out.println("중복된 글");
		} finally {
			if(conn != null) cp.releaseConnection(conn);
		}
		return 0;
	}
}
