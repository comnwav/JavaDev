package devLib;

// 관리자 인터페이스
public interface LibAdminService {
	
	public int idCheck(String usrId); // 중복ID체크
	public int loginLib(String usrId, String usrPass); // 로그인
	public String getUsrCode(String usrId); // 유저 코드 추출
	public void memberRegi(LibUser usr); // 유저등록
	public void addBook(Book book); // 도서 등록
	public void modiBook(Book book); // 도서정보 수정
	public void rmBook(String codeBook); // 도서 삭제
	public void rentBook(String usrCode, String bookCode); // 도서 대여기능
	public void backBook(Book book, LibUser user); // 반납된도서 입력
	
	//
	public Book getInfoBook(String codeBook);
	public LibUser getInforUser(String codeUser);
}
