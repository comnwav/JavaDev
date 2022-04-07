package devLib;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LibGenFunc extends LibDao implements LibGenService {

	@Override
	public List<Book> searchListByTitle(String title) {
		conn = getConnect();
		String sql = "SELECT\n"+
				"    *\n"+
				"FROM\n"+
				"    booklist\n"+
				"WHERE\n"+
				"    title_book LIKE ?";
		
		List<Book> bookList = new ArrayList<Book>();
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, "%"+title+"%");
			rs = psmt.executeQuery();

			while (rs.next()) {
				Book book = new Book();
				book.setCodeBook(rs.getString("code_book"));
				book.setTitleBook(rs.getString("title_book"));
				book.setAuthBook(rs.getString("auth_book"));
				book.setPubBook(rs.getString("pub_book"));
				bookList.add(book);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return bookList;
	}

	@Override
	public List<Book> searchListByAuth(String auth) {
		conn = getConnect();
		String sql = "SELECT\n"+
				"    *\n"+
				"FROM\n"+
				"    booklist\n"+
				"WHERE\n"+
				"    auth_book LIKE ?";
		
		List<Book> bookList = new ArrayList<Book>();
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, "%"+auth+"%");
			rs = psmt.executeQuery();

			while (rs.next()) {
				Book book = new Book();
				book.setCodeBook(rs.getString("code_book"));
				book.setTitleBook(rs.getString("title_book"));
				book.setAuthBook(rs.getString("auth_book"));
				book.setPubBook(rs.getString("pub_book"));
				bookList.add(book);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return bookList;
	}

	@Override
	public List<Book> searchListByPub(String pub) {
		conn = getConnect();
		String sql = "SELECT\n"+
				"    *\n"+
				"FROM\n"+
				"    booklist\n"+
				"WHERE\n"+
				"    pub_book LIKE ?";
		
		List<Book> bookList = new ArrayList<Book>();
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, "%"+pub+"%");
			rs = psmt.executeQuery();

			while (rs.next()) {
				Book book = new Book();
				book.setCodeBook(rs.getString("code_book"));
				book.setTitleBook(rs.getString("title_book"));
				book.setAuthBook(rs.getString("auth_book"));
				book.setPubBook(rs.getString("pub_book"));
				bookList.add(book);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return bookList;
	}

	@Override
	public List<Book> ocfList(String usrCode) {
		conn = getConnect();
		String sql = "select * from booklist where usr_code = ?";
		List<Book> bookList = new ArrayList<Book>();
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, usrCode);
			rs = psmt.executeQuery();
			
			while (rs.next()) {
				Book book = new Book();
				book.setCodeBook(rs.getString("code_book"));
				book.setTitleBook(rs.getString("title_book"));
				book.setAuthBook(rs.getString("auth_book"));
				book.setPubBook(rs.getString("pub_book"));
				book.setDateAway(rs.getDate("date_away"));
				book.setDateBack(rs.getDate("date_back"));
				book.setUsrCode(rs.getString("usr_code"));
				book.setRentCount(rs.getInt("rent_count"));
				bookList.add(book);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
		return bookList;
	}

	@Override
	public List<Book> bestList() {
		conn = getConnect();
		String sql = "select * from booklist order by rent_count desc";
		
		List<Book> bookList = new ArrayList<Book>();
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			int cnt = 0;
			while (cnt < 5) {
				rs.next();
				Book book = new Book();
				book.setTitleBook(rs.getString("title_book"));
				book.setAuthBook(rs.getString("auth_book"));
				book.setPubBook(rs.getString("pub_book"));
				book.setRentCount(rs.getInt("rent_count"));
				bookList.add(book);
				cnt++;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		
		return bookList;
	}

}
