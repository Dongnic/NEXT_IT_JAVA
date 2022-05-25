package ch14_jdbc_jsp.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import ch14_jdbc_jsp.dao.WordGameDao;
import ch14_jdbc_jsp.jdbc.ConnectionPool;
import ch14_jdbc_jsp.model.WordGameVO;

public class WordGameService {
	private WordGameDao dao = WordGameDao.getInstance();
	private ConnectionPool cp = ConnectionPool.getInstance();
	
	private static WordGameService instance = new WordGameService();
	private WordGameService() {
		
	}
	public static WordGameService getInstance() {
		return instance;
	}
	public ArrayList<WordGameVO> getWordList(){
		Connection conn = cp.getConnection();
		try {
			return dao.getWordList(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) cp.releaseConnection(conn);
		}
		return new ArrayList<WordGameVO>();
	}
	
}
