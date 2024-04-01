package i;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class I06_JDBC {
	
	public static void main(String[] args) {
		// JDBC 연동 테스트
		
		// 데이터베이스 연결 객체 (Connection 객체)
		Connection conn = null;
		
		// checkedException : SQLException
		try {
			// 1. 드리아버 로드
			// MySQL 사용 드라이버
			// MySQL 6.XX 버전 이전 : com.mysql.jdbc.Driver
			// MySQL 6.XX 버전 이후 : com.mysql.cj.jdbc.Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. connection 객체 생성 - DriverManger
			// MySQL 6.XX 미만인 경우 : jdbc:mysql://호스트이름:포트번호/DB이름
			// MySQL 6.XX 미만인 경우 : jdbc:mysql://호스트이름:포트번호/DB이름?serverTime=UTC
			// 서울 UTC 값 : Asia/Seoul
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/testdb?serverTime=Asia/Seoul",
					"root", 
					"root1234");
			System.out.println(conn);
			System.out.println("데이터베이스 접속 성공!!");
			
			// Insert, Update, Delete
			// 3. Statement 객체 생성... createStatement()
			Statement stmt = conn.createStatement();
			
			// 4. SQL 작성
			String sql1 = "insert into Persons (firstname, lastname, age, city)"
					+ "values('jdbcTest', 'testuser13', 24, 'Seoul')";
			// 수정
			String sql2 = "update persons set firstname = '순신', lastname = '이'"
					+ "where id = 12";
			// 삭제
			String sql3 = "delete from persons where id = 12";
			
			// 5. Statement 객체를 통해서 작성된 SQL을 실행
			int result = stmt.executeUpdate(sql3);
			// 성공시:1
			// 실패시:0
			if(result != 0) {
				System.out.println("SQL성공");
			}else {
				System.out.println("SQL실패");
			}
		} catch (ClassNotFoundException ce) {
			System.out.println("드라이버 로드 실패");
		}catch (SQLException sqle) {
			System.out.println("SQL 연동 오류");
			System.out.println(sqle.getMessage());
		}finally {
			try {
				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		

	}

}
