package devLib;

import java.util.List;

// 공통 인터페이스
public interface LibGenService {
	
	// 메인조회기능
	public List<Book> searchListByTitle(String title); // 제목으로 검색
	public List<Book> searchListByAuth(String auth); // 작가로 검색
	public List<Book> searchListByPub(String pub); // 출판사로 검색
	public List<Book> ocfList(String usrCode); // 대여중목록
	public List<Book> bestList(); // 베스트목록
	
	public List<Book> allList(); // 테스트용 전체리스트
	
}
