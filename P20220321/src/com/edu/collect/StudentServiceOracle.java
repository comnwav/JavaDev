package com.edu.collect;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class StudentServiceOracle extends DAO implements StudentService {

	@Override
	public void insertStudent(Student student) {
		conn = getConnect();
		String sql = "INSERT INTO student_info (\n"+
				"    student_no,\n"+
				"    student_name,\n"+
				"    eng_score,\n"+
				"    kor_score\n"+
				") VALUES (\n"+
				"    ?,\n"+
				"    ?,\n"+
				"    ?,\n"+
				"    ?\n"+
				")";

			try {
				psmt = conn.prepareStatement(sql);
				psmt.setInt(1, student.getNumber());
				psmt.setString(2, student.getName());
				psmt.setInt(3, student.getEngScore());
				psmt.setInt(4, student.getKorScore());
				
				int r = psmt.executeUpdate();
				System.out.println(r + "건 입력됨.");
				
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				disconnect();
			}
	}

	@Override
	public Student getStudent(int sno) {
		return null;
	}

	@Override
	public List<Student> studentList() {
		List<Student> list = new ArrayList<Student>();
		conn = getConnect();
		String sql = "select * from student_info order by student_no";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery(); // 실행건수만큼 반복자
			while (rs.next()) { // 반복자를 통해 요소를 가지고 올 수 있는지 체크, 있으면 하나 가지고옴
				Student student = new Student();
				student.setNumber(rs.getInt("student_no"));
				student.setName(rs.getString("student_name"));
				student.setEngScore(rs.getInt("eng_score"));
				student.setKorScore(rs.getInt("kor_score"));

				list.add(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return list;
	}

	@Override
	public void modifyStudent(Student student) {
		conn = getConnect();
		String sql = "UPDATE student_info\n"+
				"SET\n"+
				"    eng_score = ?,\n"+
				"    kor_score = ?\n"+
				"WHERE\n"+
				"    student_no = ?";
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, student.getEngScore());
			psmt.setInt(2, student.getKorScore());
			psmt.setInt(3, student.getNumber());
			
			int r = psmt.executeUpdate();
			System.out.println(r + "건 수정됨.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public void removeStudent(int sno) {
		conn = getConnect();
		String sql = "DELETE FROM student_info\n"+
				"WHERE\n"+
				"    student_no = ?";
		
		try {
			psmt = conn.prepareStatement(sql);
			// 파라메터 값을 지정.
			psmt.setInt(1, sno);

			int r = psmt.executeUpdate();
			System.out.println(r + "건 수정됨.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		

	}

	@Override
	public List<Student> searchStudent(String name) {
		List<Student> ssol = new ArrayList<Student>();
		conn = getConnect();
		String sql = "select *\n"+
				"from student_info\n"+
				"where student_name like '%'||?||'%'";
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, name);

			rs = psmt.executeQuery();

			// next() 메서드는 커서의 다음 행이 존재할 경우 true를 리턴하고 커서를 그 행으로 이동
			while (rs.next()) {
				Student sso = new Student();
				sso.setNumber(rs.getInt("student_no"));
				sso.setName(rs.getString("student_name"));
				sso.setEngScore(rs.getInt("eng_score"));
				sso.setKorScore(rs.getInt("kor_score"));
				ssol.add(sso);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return ssol;
	}

	@Override
	public void saveToFile() {
		// TODO Auto-generated method stub
		
	}

}
