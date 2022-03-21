package com.edu;

public class InheritEx {
	
	public static void main(String[] args) {
		
		// 학생, 직장인> 정보를 담아놓는 자료
		// 학교, 학년
		// 직장명, 직급
		
		Students student = new Students();
		student.setName("홍길동");
		student.setAge(15);
		student.setSchool("중앙고");
		student.setGrade(2);
		
		Worker worker = new Worker();
		worker.setName("직장인");
		worker.setAge(35);
		worker.setCompany("카카오");
		worker.setJob("개발팀장");
		
		// 자식 클래스의 참조 변수가 부모 클래스의 참조변수에 대입가능 (promotion)
		Person p1 = new Person();
		p1 = student; 
		p1 = worker;
		
	}

}
