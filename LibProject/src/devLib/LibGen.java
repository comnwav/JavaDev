package devLib;

import java.util.List;

// 공통 인터페이스
public interface LibGen {
	
	public List<Book> searchListByTitle(); // 제목으로 검색
	public List<Book> searchListByAuth(); // 작가로 검색
	public List<Book> searchListByPub(); // 출판사로 검색
	public List<Book> allList(); // 도서 전체목록 출력
//	public void bestList(); 구현예정

}
