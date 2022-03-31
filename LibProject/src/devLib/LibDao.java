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
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "comnwav", "comnwav");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		System.out.println("<Connected>");
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

	public int login(String usrId, String usrPass) {
		String sql = "SELECT usrPass FROM user WHERE usrId = ?";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, usrId);
			rs = psmt.executeQuery();

			if (rs.next()) {
				if (rs.getString(1).equals(usrPass)) {
					return 1;
				} else {
					return 0;
				}
			}
			return -1;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return -2;
	}

}
