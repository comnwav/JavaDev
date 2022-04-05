package devLib;

import java.sql.SQLException;
import java.util.List;

public class LibGenFunc extends LibDao implements LibGen {

	@Override
	public List<Book> searchListByTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> searchListByAuth() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> searchListByPub() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> allList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> availList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> ocfList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> bestList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book getTitle(String codeBook) {
		conn = getConnect();
		String sql = "SELECT\n"+
				"    title_book, auth_book, pub_book\n"+
				"FROM\n"+
				"    booklist\n"+
				"where\n"+
				"code_book = ?";
		Book bta = new Book();
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, codeBook);
			rs = psmt.executeQuery();

			while (rs.next()) {
				bta.setTitleBook(rs.getString("title_book"));
				bta.setAuthBook(rs.getString("auth_book"));
				bta.setPubBook(rs.getString("pub_book"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return bta;
	}

}
