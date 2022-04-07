package devLib;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LibDao {

	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;

	public Connection getConnect() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.35:1521:xe", "comnwav", "comnwav");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

	public void disconnect() {
		try {
			if (rs != null)
				rs.close();

			if (conn != null)
				conn.close();

			if (psmt != null)
				psmt.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
