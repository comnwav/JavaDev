package com.edu.collect;

import java.util.List;

public interface StudentService {

	// 서비스 정의

	public void insertStudent(Student student); // 입력

	public Student getStudent(int sno); // 한건조회

	public List<Student> studentList(); // 전체목록

	public void modifyStudent(Student student); // 한건수정

	public void removeStudent(int sno); // 한건삭제

	public List<Student> searchStudent(String name); // 이름조회, 여러건이 조회될 가능성이 있음

	void saveToFile();

}
