package ch14_jdbc;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcSelect {

	public static void main(String[] args) {
		// 변수 정의 
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		// 프로퍼티 읽어오기
//		Properties prop = new Properties();
//		InputStream reader = getClass().getClassLoader().getResourceAsStream("config/db.properties");
		// 1. 드라이버 로딩
		// (프로그램 시작할 때 딱 한번만 로딩해주면 됨)
		try {
			// JVM에 드라이버를 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 등록성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 등록실패");
			// 실패 시 현재 프로그램을 종료 
			System.exit(0);
		}
		// localhost = 127.0.0.1
		// 내 ip로 설정
		String url = "jdbc:oracle:thin:@192.168.0.20:1521:xe";
		String id = "jdbc";
		String pw = "jdbc";
		
		try {
			// 2. 데이터베이스 서버와 연결
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("접속성공");
			
		// 3. 쿼리문 객체를 생성
		StringBuffer query = new StringBuffer();
		query.append("SELECT");
		query.append("	  stu_name			 ");
		query.append("  , stu_id	         ");
		query.append("	, stu_password		 ");
		query.append("	, stu_score			 ");
		query.append("FROM					 ");
		query.append("    students			 ");
		
//		query.append("SELECT *          ");
//		query.append("FROM				");
//		query.append("    students		");
		ps = conn.prepareStatement(query.toString());
		
		// 4. 쿼리문 실행과 동시에 결과를 
		// ResultSet 객체에 담는다.
		rs = ps.executeQuery();
		
		// 5. 실행결과인 rs를 이용하여
		// 데이터 조회
		// rs가 존재하는지, next()다음 행	
			while(rs.next()) {
			String stuId = rs.getString("stu_id");
			String stuName = rs.getString("stu_name");
			String stuPassword = rs.getString("stu_password");
			int stuScore = rs.getInt("stu_score");
			
			System.out.println("아이디 : " + stuId
					+ " 이름 : " + stuName
					+ " 비밀번호 : " + stuPassword
					+ " 점수 : " + stuScore);
			} 
		}
		catch (SQLException e) {
			e.printStackTrace();
			System.out.println("접속실패");
		} finally{
			if(rs != null){try {rs.close();} catch (SQLException e) {e.printStackTrace();}}
			if(ps != null){try {ps.close();} catch (SQLException e) {e.printStackTrace();}}

			// Connection 객체를 나중에 닫고, 꼭 닫아야 함
			// 프로그램 강제종료시 커넥션이 닫히지 않고
			// 계속 쌓여서 나중에 에러발생
			if(conn != null){try {conn.close();} catch (SQLException e) {e.printStackTrace();}}
		}
		
	}

}
