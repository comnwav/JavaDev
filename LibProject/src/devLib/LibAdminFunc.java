package devLib;

import java.sql.SQLException;
import java.util.List;

public class LibAdminFunc extends LibDao implements LibAdminService {

	@Override
	public void addBook(Book book) {

		conn = getConnect();
		String sql = "INSERT INTO booklist (\n" + "    code_book,\n" + "    title_book,\n" + "    auth_book,\n"
				+ "    pub_book\n" + ") VALUES (\n" + "    ?,\n" + "    ?,\n" + "    ?,\n" + "    ?\n" + ")";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, book.getCodeBook());
			psmt.setString(2, book.getTitleBook());
			psmt.setString(3, book.getAuthBook());
			psmt.setString(4, book.getPubBook());

			int r = psmt.executeUpdate();
			System.out.println(r + "건 입력됨.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public void modiBook(String codeBook) {
		conn = getConnect();

	}

	@Override
	public void rmBook(String codeBook) {
		// TODO Auto-generated method stub

	}

	@Override
	public void backBook(String codeBook) {
		// TODO Auto-generated method stub

	}

	@Override
	public int loginLib(String usrId, String usrPass) {

		conn = getConnect();
		String sql = "SELECT\n" + "    usr_pass\n" + "FROM\n" + "    usrlist\n" + "WHERE\n" + "    usr_id = ?";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, usrId);
			rs = psmt.executeQuery();

			if (rs.next()) {
				if (rs.getString(1).equals(usrPass)) {
					if (usrId.equals("admin")) {
						return 1;
					} else {
						return 2;
					}
				}
			}
			return -1;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return -2;
	}

	@Override
	public void memberRegi(String usrId, String usrPass, int usrCode) {
		
		conn = getConnect();
		String sql = "INSERT INTO usrlist (\n"+
				"    usr_id,\n"+
				"    usr_pass,\n"+
				"    usr_code\n"+
				") VALUES (\n"+
				"    ?,\n"+
				"    ?,\n"+
				"    ?\n"+
				")";
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, usrId);
			psmt.setString(2, usrPass);
			psmt.setInt(3, usrCode);

			int r = psmt.executeUpdate();
			System.out.println(r + "건 입력됨.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
	}

}
