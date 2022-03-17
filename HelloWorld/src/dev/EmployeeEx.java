package dev;

public class EmployeeEx {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		
//		e1.empId = 100;
		e1.setEmpId(100);
//		e1.empName = "최규완";
		e1.setEmpName("서현일");
//		e1.depart = "개발부";
		e1.setEmpDep("개발부");
//		e1.job = "월급계산";
		e1.setEmpJob("월급계산");
		e1.setSalary(1000);
		
//		System.out.println(e1.getEmpName()
//		+"의 부서는 " + e1.getEmpDep() + "이고"
//		+"직무는 " + e1.getEmpjob() + "이며"
//		+"급여는 " + e1.getSalary() + "입니다.");
		
		System.out.println(e1.getEmpInfo());
		
		Employee e2 = new Employee();
		e2.setEmpId(101);
		e2.setEmpName("최규완");
		e2.setEmpDep("총무부");
		e2.setEmpJob("월급계산");
		e2.setSalary(3000);
		
		System.out.println(e2.getEmpInfo());
		
	}
}
