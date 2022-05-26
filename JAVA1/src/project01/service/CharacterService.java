package project01.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import project01.dao.CharacterDao;
import project01.jdbc.ConnectionPool;
import project01.model.CharacterVO;

public class CharacterService {
	private CharacterDao dao = CharacterDao.getInstace();
	private ConnectionPool cp = ConnectionPool.getInstance();
	
	private static CharacterService instance = new CharacterService();
	private CharacterService() {
		
	}
	
	public static CharacterService getInstance() {
		return instance;
	}
	// 캐릭터 생성
	public int makeCharacter(CharacterVO ct) {
		Connection conn = cp.getConnection();
		
		try {
			return dao.makeCharacter(conn, ct);
		} catch (SQLException e) {
			System.out.println("중복된 닉네임");
		} finally {
			if(conn != null) cp.releaseConnection(conn);
		}
		return 0;
	}	
	// 캐릭터 조회
	public ArrayList<CharacterVO> characterList(){
		Connection conn = cp.getConnection();
		try {
			return dao.characterList(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) cp.releaseConnection(conn);
		}
		return new ArrayList<CharacterVO>();
	}
	// 캐릭터 업데이트
	public int updateCharacter(int money, String name){
		Connection conn = cp.getConnection();
		try {
			return dao.updateCharacter(conn, money, name);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) cp.releaseConnection(conn);
		}
		return 0;
	}
	// 캐릭터 삭제
	public int deleteCharacter(String name){
		Connection conn = cp.getConnection();
		try {
			return dao.deleteCharacter(conn, name);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) cp.releaseConnection(conn);
		}
		return 0;
	}
	
}
