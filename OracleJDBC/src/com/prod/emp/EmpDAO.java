package com.prod.emp;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO extends DAO {
	// 전체조회
	public List<Employee> empList() { // generic
		List<Employee> emps = new ArrayList<Employee>();
		conn = getConnect();
		try {
			psmt = conn.prepareStatement("select * from emp_java");
			rs = psmt.executeQuery();
			// next() 메서드는 커서의 다음 행이 존재할 경우 true를 리턴하고 커서를 그 행으로 이동
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id")); // employees.employess_id
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setHireDate(rs.getString("hire_date").substring(0, 10));
				emp.setJobId(rs.getString("job_id"));

				emps.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return emps;
	}

	// 한건조회

	// 입력처리 executeUpdate()
	public void insertemp(Employee emp) {
		conn = getConnect();
		String sql = "INSERT INTO emp_java (\n" + "    employee_id,\n" + "    last_name,\n" + "    email,\n"
				+ "    hire_date,\n" + "    job_id\n" + ") VALUES (\n" + "    ?,\n" + "    ?,\n" + "    ?,\n"
				+ "    ?,\n" + "    ?\n" + ")";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, emp.getEmployeeId());
			psmt.setString(2, emp.getLastName());
			psmt.setString(3, emp.getEmail());
			psmt.setString(4, emp.getHireDate());
			psmt.setString(5, emp.getJobId());

			int r = psmt.executeUpdate();
			System.out.println(r + "건 입력됨.");

			if (r > 0) {
				emp.setResult(true);
			} else {
				emp.setResult(false);
			}

		} catch (SQLException e) {
			emp.setResult(false);
//			e.printStackTrace();

		} finally {
			disconnect();
		}
	}

	// 수정처리
	public void updateEmp(Employee emp) {
		conn = getConnect();
		String sql = "UPDATE emp_java\n" + "SET\n" + "    first_name = ?,\n" + "    phone_number = ?,\n"
				+ "    salary = ?\n" + "WHERE\n" + "    employee_id = ?"; // 쿼리 작성 > ? 로 작성.
		try {
			psmt = conn.prepareStatement(sql);
			// 파라메터 값을 지정.
			psmt.setString(1, emp.getFirstName());
			psmt.setString(2, emp.getPhoneNumber());
			psmt.setInt(3, emp.getSalary());
			psmt.setInt(4, emp.getEmployeeId());
			int r = psmt.executeUpdate();

			System.out.println(r + "건 수정됨.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	// 삭제처리
	public void deleteEmp(int empId) {
		conn = getConnect();
		String sql = "DELETE FROM emp_java\n" + "WHERE\n" + "    employee_id = ?"; // 쿼리 작성 > ? 로 작성.

		try {
			psmt = conn.prepareStatement(sql);
			// 파라메터 값을 지정.
			psmt.setInt(1, empId);

			int r = psmt.executeUpdate();
			System.out.println(r + "건 수정됨.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	public List<Employee> searchList(int empId) {
		List<Employee> emps = new ArrayList<Employee>();
		conn = getConnect();

		String sql = "SELECT\n" + "    *\n" + "FROM\n" + "    emp_java\n" + "WHERE\n" + "    employee_id = ?";

		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, empId);

			rs = psmt.executeQuery();

			// next() 메서드는 커서의 다음 행이 존재할 경우 true를 리턴하고 커서를 그 행으로 이동
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setHireDate(rs.getString("hire_date").substring(0, 10));
				emp.setJobId(rs.getString("job_id"));
				emps.add(emp);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return emps;
	}

}
