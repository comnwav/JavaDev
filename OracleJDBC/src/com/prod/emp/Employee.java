package com.prod.emp;

public class Employee {

	// employees 테이블의 column 에 해당되는 필드 설정
	private int employeeId; // employee.employee_id
	private String firstName; // employee.first_name
	private String lastName; // and so on
	private String email;
	private int salary;
	private String hireDate;
	private String jobId;
	private String phoneNumber;
	private boolean result;

	public Employee() {
		super();
	}

	public Employee(boolean result) {
		super();
		this.result = result;
	}

	public Employee(int employeeId, String firstName, String lastName, String email, int salary, String hireDate,
			String jobId, String phoneNumber) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.salary = salary;
		this.hireDate = hireDate;
		this.jobId = jobId;
		this.phoneNumber = phoneNumber;
	}

	public Employee(int employeeId, String lastName, String email, String hireDate, String jobId) {
		super();
		this.employeeId = employeeId;
		this.lastName = lastName;
		this.email = email;
		this.hireDate = hireDate;
		this.jobId = jobId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	@Override
	public String toString() {
		return "[Employee] 사원번호: " + employeeId + ", 이름: " + firstName + ", 성: " + lastName + ", email: " + email
				+ ", 급여: " + salary + ", 입사일자: " + hireDate + ", 부서: " + jobId;
	}

}
