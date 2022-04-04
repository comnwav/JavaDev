package devLib;

// 관리자 인터페이스
public interface LibAdminService {
	
	public int loginLib(String usrId, String usrPass); // 로그인 + 로그아웃
	public void memberRegi(String usrId, String usrPass, int usrCode);
	public void addBook(Book book); // 도서 등록
	public void modiBook(String codeBook); // 도서정보 수정
	public void rmBook(String codeBook); // 도서 삭제
	public void backBook(String codeBook); // 반납된도서 입력
	
}
