package devLib;

// 사용자 인터페이스
public interface LibService {
	
	public void addUsr(LibUser usr); // 유저등록
	public void infoUsr(); // 유저 정보 출력 Summary (대출권수, 대출연체권수) / List (대여중인 책정보)
	public void getBook(); // 도서 대여기능
	
}
