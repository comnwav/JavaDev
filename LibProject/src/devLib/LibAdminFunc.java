package devLib;

import java.sql.SQLException;

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
	public void modiBook(Book book) {
		System.out.println(book.toString());
		conn = getConnect();
		String sql = "UPDATE booklist\n"+
				"SET\n"+
				"    title_book = ?,\n"+
				"    auth_book = ?,\n"+
				"    pub_book = ?\n"+
				"WHERE\n"+
				"    code_book = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, book.getTitleBook());
			psmt.setString(2, book.getAuthBook());
			psmt.setString(3, book.getPubBook());
			psmt.setString(4, book.getCodeBook());
			
			int r = psmt.executeUpdate();
			System.out.println(r + "건 수정됨.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public void rmBook(String codeBook) {
		conn = getConnect();
		String sql = "DELETE FROM booklist\n" + "WHERE\n" + "    code_book = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, codeBook);
			
			int r = psmt.executeUpdate();
			System.out.println(r + "건 삭제됨.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
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
		String sql = "INSERT INTO usrlist (\n" + "    usr_id,\n" + "    usr_pass,\n" + "    usr_code\n" + ") VALUES (\n"
				+ "    ?,\n" + "    ?,\n" + "    ?\n" + ")";

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
