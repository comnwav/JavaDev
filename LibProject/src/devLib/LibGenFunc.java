package devLib;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LibGenFunc extends LibDao implements LibGen {

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
	public List<Book> availList() {
		conn = getConnect();
		String sql = "select * from booklist where usr_code is null";
		
		List<Book> bookList = new ArrayList<Book>();
		try {
			psmt = conn.prepareStatement(sql);
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
	public List<Book> ocfList() {
		conn = getConnect();
		String sql = "select * from booklist where usr_code is not null";
		
		List<Book> bookList = new ArrayList<Book>();
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			
			while (rs.next()) {
				Book book = new Book();
				book.setCodeBook(rs.getString("code_book"));
				book.setTitleBook(rs.getString("title_book"));
				book.setAuthBook(rs.getString("auth_book"));
				book.setPubBook(rs.getString("pub_book"));
				book.setDateAway(rs.getString("date_away"));
				book.setDateBack(rs.getString("date_back"));
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
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public Book getTitle(String codeBook) {
//		conn = getConnect();
//		String sql = "SELECT\n"+
//				"    title_book, auth_book, pub_book\n"+
//				"FROM\n"+
//				"    booklist\n"+
//				"where\n"+
//				"code_book = ?";
//		Book bta = new Book();
//		try {
//			psmt = conn.prepareStatement(sql);
//			psmt.setString(1, codeBook);
//			rs = psmt.executeQuery();
//
//			while (rs.next()) {
//				bta.setTitleBook(rs.getString("title_book"));
//				bta.setAuthBook(rs.getString("auth_book"));
//				bta.setPubBook(rs.getString("pub_book"));
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			disconnect();
//		}
//		return bta;
//	}

}
