package com.edu.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

class Student implements Comparable<Student> {

	// field
	String name;
	String gender;
	int score;
	int point;
	
	public Student(String name, String gender, int score, int point) {
		super();
		this.name = name;
		this.gender = gender;
		this.score = score;
		this.point = point;
	}
	
	public Student(String name, String gender, int score) {
		super();
		this.name = name;
		this.gender = gender;
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gender=" + gender + ", score=" + score + ", point=" + point + "]";
	}

	@Override
	public int compareTo(Student student) {
		// this 와 student 비교 : this, student => 음수
//		if(this.score < student.score) {
//			return -1000;
//		} else {
//			return 9000;
//		}
		return (this.score + this.point) - (student.score + student.point);
		// ex1 60 - 70 => 음수 >> 오름차순으로 정의하겠습니다.
		// ex2 80 - 70 => 양수 >> 내림차순으로 정의하겠습니다.
	}
}

public class StreamEx {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<Student>();
		list.add(new Student("홍길동", "남자", 70, 100));
		list.add(new Student("김순희", "여자", 80, 120));
		list.add(new Student("김부식", "남자", 85, 95));
		list.add(new Student("박한나", "여자", 88, 99));
		
		list
		.stream()
		// .filter(student -> student.score + student.point >=180)
		.filter(student -> student.score + student.point >= 180) // 180점 이상인 대상
		.sorted() // soreted 할려면 Comparable 구현하는 클래스
		.forEach(student -> System.out.println(student)); // 필터링된 대상으 출력
		
		System.out.println("================");
		
		list // 컬렉션으로부터
		.stream() // 스트림생성
		.filter(student -> student.score >= 80) // 80점 이상인 대상을 필터
		.sorted()
		.forEach(student -> System.out.println(student)); // 필터링된 대상을 출력

		// 평균구하기.
		int sum = 0, cnt = 0;
		double avg = 0;

		for (Student student : list) {
			if (student.gender.equals("남자")) {
				sum += student.score;
				cnt++;
			}
		}
		avg = sum / (double) cnt;
		System.out.println("컬렉션 평균: " + avg);

		Stream<Student> stream = list.stream(); // 스트림생성
		OptionalDouble od = stream.filter((s) -> s.gender.equals("남자")).mapToInt(s -> s.score).average();

		avg = od.getAsDouble();
		System.out.println("스트림 평균: " + avg);

//		stream.forEach(new Consumer<Student>() {
//
//			@Override
//			public void accept(Student t) {
//				System.out.println("이름: " + t.name + ", 성별" + t.gender + ", 점수" + t.score);
//			}
//			
//		
		
//		
//		});
		//
//		stream.forEach((Student t) -> {
//			System.out.println("이름: " + t.name + ", 성별" + t.gender + ", 점수" + t.score);
//		});

	}

}
