package devLib;

import java.util.Date;

public class Book {
	
	String codeBook; // 책고유번호
	String titleBook; // 제목
	String authBook; // 저자
	String pubBook; // 출판사
	Date dateAway; // 최초대여일
	Date dateBack; // 반납예정일
	String usrCode; // 대여자
	int rentCount; // 대출횟수
	
	public Book() {
		super();
	}
	
	public String getUsrCode() {
		return usrCode;
	}

	public void setUsrCode(String usrCode) {
		this.usrCode = usrCode;
	}

	public int getRentCount() {
		return rentCount;
	}

	public void setRentCount(int rentCount) {
		this.rentCount = rentCount;
	}

	public String getCodeBook() {
		return codeBook;
	}

	public void setCodeBook(String codeBook) {
		this.codeBook = codeBook;
	}

	public String getTitleBook() {
		return titleBook;
	}

	public void setTitleBook(String titleBook) {
		this.titleBook = titleBook;
	}

	public String getAuthBook() {
		return authBook;
	}

	public void setAuthBook(String authBook) {
		this.authBook = authBook;
	}

	public String getPubBook() {
		return pubBook;
	}

	public void setPubBook(String pubBook) {
		this.pubBook = pubBook;
	}

	public Date getDateAway() {
		return dateAway;
	}

	public void setDateAway(Date dateAway) {
		this.dateAway = dateAway;
	}

	public Date getDateBack() {
		return dateBack;
	}

	public void setDateBack(Date dateBack) {
		this.dateBack = dateBack;
	}
	
	@Override
	public String toString() {
		return "Book [codeBook=" + codeBook + ", titleBook=" + titleBook + ", authBook=" + authBook + ", pubBook="
				+ pubBook + ", dateAway=" + dateAway + ", dateBack=" + dateBack + ", usrCode=" + usrCode
				+ ", rentCount=" + rentCount + "]";
	}

	

}
