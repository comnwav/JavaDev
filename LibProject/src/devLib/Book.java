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
	String descBook; // 책설명
	
	public Book() {
		super();
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

	public String getDescBook() {
		return descBook;
	}

	public void setDescBook(String descBook) {
		this.descBook = descBook;
	}

	@Override
	public String toString() {
		
		return codeBook + "|" + titleBook + "|" + authBook + "|" + pubBook + "|" +  dateBack + "|" + usrCode + "|" + rentCount +"|";
	}
	
	public void toStringForInfo() {
		System.out.println("========================");
		System.out.println("제목	: " + titleBook);
		System.out.println("저자	: " + authBook);
		System.out.println("출판사	: " + pubBook);
		System.out.println("대여횟수	: " + rentCount+"회");
		System.out.println("반납예정일	: " + dateBack);
		System.out.println("========================");
		System.out.println("======= 도서 소개 =========");
		System.out.println(descBook);
		System.out.println("========================");
	}

}
