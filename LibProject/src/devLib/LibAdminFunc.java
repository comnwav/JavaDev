package devLib;

import java.sql.SQLException;

public class LibAdminFunc extends LibDao implements LibAdminService {

	@Override
	public void addBook(Book book) {

		conn = getConnect();
		String sql = "INSERT INTO booklist (\n" + "    code_book,\n" + "    title_book,\n" + "    auth_book,\n"
				+ "    pub_book,\n" + "    rent_count\n" + ") VALUES (\n" + "'a'||code_book.nextval,\n" + "    ?,\n" + "    ?,\n"
				+ "    ?,\n" + "    '0'\n" + ")";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, book.getTitleBook());
			psmt.setString(2, book.getAuthBook());
			psmt.setString(3, book.getPubBook());

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
		String sql = "UPDATE booklist\n" + "SET\n" + "    title_book = ?,\n" + "    auth_book = ?,\n"
				+ "    pub_book = ?\n" + "WHERE\n" + "    code_book = ?";
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
	// 도서대출
	// 사용자 대출정지 여부 조회 > 도서 대여중 여부 조회 > 대출
	public void rentBook(String usrCode, String bookCode) {

		conn = getConnect();
		String sql = "select usr_halt from usrlist where usr_code = ?";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, usrCode);
			rs = psmt.executeQuery();

			while (rs.next()) {
				if (rs.getInt("usr_halt") > 0) {
					System.out.println("해당 사용자는 연체로 인한 대여 정지 중 입니다.");
				} else {
					String sql2 = "select usr_code from booklist where code_book = ?";
					psmt = conn.prepareStatement(sql2);
					psmt.setString(1, bookCode);
					rs = psmt.executeQuery();
					while (rs.next()) {
						if (rs.getString("usr_code") == null) {

							String sql3 = "UPDATE booklist\n" + "SET\n"
									+ "    date_away = sysdate, usr_code = ?, date_back = sysdate+15\n, rent_count = rent_count+1"
									+ "WHERE\n" + "    code_book = ?";

							psmt = conn.prepareStatement(sql3);
							psmt.setString(1, usrCode);
							psmt.setString(2, bookCode);

							int r = psmt.executeUpdate();
							System.out.println(r + "건 대여됨.");
						} else {
							System.out.println("대여중인 도서입니다.");
						}
					}
				}
			}
		}

		catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	// 도서 반납
	// 반납일자(sysdate)입력 > 연체 여부 확인 > 도서반납처리 or 연체자 대출정지
	public void backBook(String codeBook) {
		conn = getConnect();

		try {
			String sqla = "update booklist set date_back = sysdate where code_book = ?";
			psmt = conn.prepareStatement(sqla);
			psmt.setString(1, codeBook);
			psmt.executeUpdate();

			String sql = "select trunc(date_back - date_away - 15) as halt, usr_code from booklist where code_book = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, codeBook);
			rs = psmt.executeQuery();

			while (rs.next()) {
				if (rs.getInt("halt") > 0) {
					{
						String usrCode = rs.getString("usr_code");
						int haltDay = rs.getInt("halt");
						String sql2 = "update usrlist set usr_halt = ? where usr_code = ?";
						psmt = conn.prepareStatement(sql2);
						psmt.setInt(1, haltDay);
						psmt.setString(2, usrCode);
						psmt.executeUpdate();

						String sql3 = "update booklist set date_away = null, date_back = null, usr_code = null where code_book= ?";
						psmt = conn.prepareStatement(sql3);
						psmt.setString(1, codeBook);
						psmt.executeUpdate();
					}
				} else {
					String sql4 = "update booklist set date_away = null, date_back = null, usr_code = null where code_book= ?";
					psmt = conn.prepareStatement(sql4);
					psmt.setString(1, codeBook);
					psmt.executeUpdate();
				}

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public int loginLib(String usrId, String usrPass) {

		conn = getConnect();
		String sql = "SELECT\n" + "    usr_pass\n" + "FROM\n" + "    usrlist\n" + "WHERE\n" + "    usr_id = ?";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, usrId);
			rs = psmt.executeQuery();

			while (rs.next()) {
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
	public void memberRegi(LibUser usr) {

		conn = getConnect();
		String sql = "INSERT INTO usrlist ( usr_id,usr_pass,usr_code, usr_halt) VALUES (?, ?, usr_code.NEXTVAL, 0)";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, usr.getUsrId());
			psmt.setString(2, usr.getUsrPass());
			
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

	@Override
	public Book getInfoBook(String codeBook) {
		conn = getConnect();
		String sql = "select * from booklist where code_book = ?";
		Book book = new Book();

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, codeBook);
			rs = psmt.executeQuery();

			while (rs.next()) {
				book.setCodeBook(rs.getString("code_book"));
				book.setTitleBook(rs.getString("title_book"));
				book.setAuthBook(rs.getString("auth_book"));
				book.setPubBook(rs.getString("pub_book"));
				book.setDateAway(rs.getDate("date_away"));
				book.setDateBack(rs.getDate("date_back"));
				book.setUsrCode(rs.getString("usr_code"));
				book.setRentCount(rs.getInt("rent_count"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return book;
	}

	@Override
	public LibUser getInforUser(String codeUser) {
		conn = getConnect();
		String sql = "select * from usrlist where usr_code = ?";
		LibUser usr = new LibUser();

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, codeUser);
			rs = psmt.executeQuery();

			while (rs.next()) {
				usr.setUsrCode(rs.getString("usr_code"));
				usr.setUsrId(rs.getString("usr_id"));
				usr.setUsrPass(rs.getString("usr_pass"));
				usr.setUsrHalt(rs.getInt("usr_halt"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return usr;
	}

	@Override
	public int idCheck(String usrId) {
		conn = getConnect();
		String sql = "select usr_id from usrlist";

		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				if (rs.getString("usr_id").equals(usrId)) {
					return 1;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return 2;
	}
}
