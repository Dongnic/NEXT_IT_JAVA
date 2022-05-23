package ch14_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcInsert {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		// 데이터를 불러올 필요가 없기 때문에 rs 필요없음
//		ResultSet rs = null;
		
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
		
		String url = "jdbc:oracle:thin:@192.168.0.20:1521:xe";
		String id = "jdbc";
		String pw = "jdbc";
		
		try {
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("접속성공");
			StringBuffer query = new StringBuffer();
			query.append("INSERT INTO       ");
			query.append("    students		");
			query.append("VALUES	( 		");
			query.append("	  ? 		 	");
			query.append("	, ?				");
			query.append("	, ?				");
			query.append("	, ?	    )   	");
			ps = conn.prepareStatement(query.toString());
			// setString(index, 값) index 1부터 시작
			// 기본적인 방법
//			ps.setString(1, "sungbin");
//			ps.setString(2, "김성빈");
//			ps.setString(3, "tjdqls1");
//			ps.setInt(4, 0);
			// 수정이 용이
			int idx = 1;
			ps.setString(idx++, "sungbin");
			ps.setString(idx++, "김성빈");
			ps.setString(idx++, "tjdqls1");
			ps.setInt(idx++, 0);
			
			// insert, delete, update문은 
			// ps.excuteUpdate()로 실행
			// 결과(추가 행 갯수)는 int로 리턴 
			int cnt = ps.executeUpdate();
			
			if(cnt > 0){
				System.out.println(cnt + " 행 이(가) 삽입되었습니다.");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("접속실패");
		} finally {
			if(ps != null){try {ps.close();} catch (SQLException e) {e.printStackTrace();}}
			// conn 나중에 닫음 
			if(conn != null){try {conn.close();} catch (SQLException e) {e.printStackTrace();}}
		}
		
		
	}

}
