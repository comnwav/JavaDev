package devLib;

import java.sql.SQLException;

public class LibFunc extends LibDao implements LibService {

	@Override
	public void infoUsr() {
		
	}

	@Override
	public void getBook(String usrCode, String codeBook) {
		
		conn = getConnect();
		String sql = "UPDATE booklist\n"+
				"SET\n"+
				"    date_away = sysdate, usr_code = ?, date_back = sysdate+15\n"+
				"WHERE\n"+
				"    code_book = ?";
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, usrCode);
			psmt.setString(2, codeBook);

			int r = psmt.executeUpdate();
			System.out.println(r + "건 대여됨.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public void checkBook() {
		
	}

	@Override
	public String getUsrCode(String usrId) {
		conn = getConnect();
		String sql = "select usr_code from usrlist where usr_id = ?";
		String usrCode = null;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, usrId);
			rs = psmt.executeQuery();

			while (rs.next()) {
				usrCode = rs.getString("usr_code");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return usrCode;
	}

}
