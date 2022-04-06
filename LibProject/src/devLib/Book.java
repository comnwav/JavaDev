package devLib;

public class Book {
	
	String codeBook; // 책고유번호
	String titleBook; // 제목
	String authBook; // 저자
	String pubBook; // 출판사
	String dateAway; // 최초대여일
	String dateBack; // 반납예정일
	String usrCode; // 대여자
	int rentCount;
	
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

	public String getDateAway() {
		return dateAway;
	}

	public void setDateAway(String dateAway) {
		this.dateAway = dateAway;
	}

	public String getDateBack() {
		return dateBack;
	}

	public void setDateBack(String dateBack) {
		this.dateBack = dateBack;
	}

	@Override
	public String toString() {
		return "Book [titleBook=" + titleBook + ", authBook=" + authBook + ", pubBook=" + pubBook + "]";
	}
	
	public String toString2() {
		return codeBook + dateBack;
	}

}
