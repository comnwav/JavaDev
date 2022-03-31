package com.prod;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// DB 연결
// OJDBC(oracle library), oracle DB 연결(db접속주소, hr, hr), Connection객체
// query 실행(Statement, PreparedStatement)
public class JDBCSample {

//	DriverManager의 역할
	static Connection conn;
	static Statement stmt;
	static ResultSet rs;
	static PreparedStatement psmt;

	public static Connection getConnect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			// xe:db이름 / 1521:포트번호
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		System.out.println("연결성공!!");
		return conn;
	}

	public static void disconnect() {
		try {
			if (rs != null)
				rs.close();

			if (stmt != null)
				stmt.close();

			if (conn != null)
				conn.close();
			
			if (psmt != null)
				psmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		disconnect();
	}

	public static void main(String[] args) {

		conn = getConnect();

		// Statement 생성.
		try {

			// 입력. 사원번호, last_name, 입사일자, 이메일, job_id
			int emp_id = 301;
			String last_name = "홍킬동";
			String hire_date = "2020-03-05";
			String email = "killdong@email.com";
			String job = "IT_PROG";
			
			String fn = "빌게이츠";
			String pn = "010-9982-7345";
			int salary = 10000;

			// ? = 변수로 선언 prepareStatement의 기능
			String sql = "update emp_java\r\n" 
					+ "set first_name = ?, \r\n" 
					+ "phone_number=?, \r\n" 
					+ "salary = ? \r\n"
					+ "where employee_id = ?";
			psmt = conn.prepareStatement(sql);
			// ex) 1 = 첫번째 물음표 를 fn으로 대체
			psmt.setString(1, fn);
			psmt.setString(2, pn);
			psmt.setInt(3, salary);
			psmt.setInt(4, emp_id);

			int r = psmt.executeUpdate(); // 입력, 수정, 삭제
			System.out.println(r + "건 입력됨");

			// 조회
//			rs = stmt.executeQuery("select * from emp_java");
//			while (rs.next()) { //
//				System.out.println("사원번호: " + rs.getInt("employee_id"));
//				System.out.println("이름: " + rs.getString("first_name"));
//			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

	}

}
