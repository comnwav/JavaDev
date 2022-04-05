package devLib;

// 사용자 인터페이스
public interface LibService {
	
	public void infoUsr(); // 유저 정보 출력 Summary (대출권수, 대출연체권수) / List (대여중인 책정보)
	public void getBook(String usrCode, String codeBook); // 도서 대여기능
	public void checkBook(); // 대여 가능 조회
	public String getUsrCode(String usrId); // 유저 코드 추출
	
}
