package devLib;

import java.util.List;

// 공통 인터페이스
public interface LibGen {
	
	// 메인조회기능
	public List<Book> searchListByTitle(String title); // 제목으로 검색
	public List<Book> searchListByAuth(String auth); // 작가로 검색
	public List<Book> searchListByPub(String pub); // 출판사로 검색
	public List<Book> availList(); // 대여가능목록
	public List<Book> ocfList(); // 대여중목록
	public List<Book> bestList(); // 베스트목록
	
	// 부가조회기능
//	public Book getTitle(String codeBook); // 코드를 통한 제목 및 작가 단권 검색

}
