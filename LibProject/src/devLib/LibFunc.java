package devLib;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LibFunc extends LibDao implements LibService {

	@Override
	public List<Book> infoUsr() {
		conn = getConnect();
		
		
		List<Book> bookList = new ArrayList<Book>();
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, "%"+title+"%");
			rs = psmt.executeQuery();

			while (rs.next()) {
				Book book = new Book();
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
	public void getBook(String usrCode, String bookCode) {
		
		conn = getConnect();
		String sql = "UPDATE booklist\n"+
				"SET\n"+
				"    date_away = sysdate, usr_code = ?, date_back = sysdate+15\n, rent_count = rent_count+1"+
				"WHERE\n"+
				"    code_book = ?";
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, usrCode);
			psmt.setString(2, bookCode);

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

}
