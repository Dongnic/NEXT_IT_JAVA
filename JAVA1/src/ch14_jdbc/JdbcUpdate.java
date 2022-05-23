package ch14_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcUpdate {

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
			query.append("UPDATE	       		");
			query.append("    students			");
			query.append("SET  					");
			query.append("	stu_password = ? 	");
			query.append("WHERE 1 = 1 			");
			query.append("AND stu_id = ? 		");
//			query.append("AND stu_id in (?, ?)"); // in (,,,,) 여러개 삭제 
			ps = conn.prepareStatement(query.toString());
						
			int idx = 1;
			ps.setString(idx++, "kr0123");
			ps.setString(idx++, "korea50");
			
			int cnt = ps.executeUpdate();
			
			if(cnt > 0){
				System.out.println(cnt + " 행 이(가) 업데이트 되었습니다.");
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
