package dev;

public class EmployeeEx {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		
//		e1.empId = 100;
		e1.setEmpId(100);
//		e1.empName = "�ֱԿ�";
		e1.setEmpName("������");
//		e1.depart = "���ߺ�";
		e1.setEmpDep("���ߺ�");
//		e1.job = "���ް��";
		e1.setEmpJob("���ް��");
		e1.setSalary(1000);
		
//		System.out.println(e1.getEmpName()
//		+"�� �μ��� " + e1.getEmpDep() + "�̰�"
//		+"������ " + e1.getEmpjob() + "�̸�"
//		+"�޿��� " + e1.getSalary() + "�Դϴ�.");
		
		System.out.println(e1.getEmpInfo());
		
		Employee e2 = new Employee();
		e2.setEmpId(101);
		e2.setEmpName("�ֱԿ�");
		e2.setEmpDep("�ѹ���");
		e2.setEmpJob("���ް��");
		e2.setSalary(3000);
		
		System.out.println(e2.getEmpInfo());
		
	}
}
