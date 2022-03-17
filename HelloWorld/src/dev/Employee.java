package dev;

public class Employee {

	// field
	private int empId;
	private String empName;
	private String depart;
	private String job;
	private int salary;
	
	// Employee info
	public String getEmpInfo() {
		String result = this.empName+"�� �μ��� "+this.depart+", "
	+"������ "+this.job+", "+"�޿��� "+this.salary+"�Դϴ�.";
		return result;
	}
	
	// Employee job
	public void setEmpJob(String job) {
		this.job = job;
	}
	
	public String getEmpjob() {
		return this.job;
	}
	
	// Employee depart
		public void setEmpDep(String depart) {
			this.depart = depart;
		}
		
		public String getEmpDep() {
			return this.depart;
		}
	
	// Employee Name
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public String getEmpName() {
		return this.empName;
	}
	
	// Employee ID
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public int getEmpId() {
		return this.empId;
	}

	// Salary
	public void setSalary(int salary) {
		if (salary < 0) {
			// this.*** �� field���� ����� salrary �� ���Ѵ�.
			this.salary = 10000;
		} else {
			this.salary = salary;
		}

	}

	public int getSalary() {
		return this.salary;
	}

}
