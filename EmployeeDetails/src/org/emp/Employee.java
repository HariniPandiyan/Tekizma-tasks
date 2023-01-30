package org.emp;

public class Employee {
	public void empId() {
		System.out.println("101");
	}
	public void empName() {
		System.out.println("Harini");
		}
	public void empDob() {
		System.out.println("05/06/2000");
	}
	public void empPhone() {
		System.out.println("9874874933");
	}
	public void empEmail() {
		System.out.println("harini@tekizma.com");
	}
	public void empAddress() {
		System.out.println("coimbatore");
	}
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.empId();
		emp.empName();
		emp.empDob();
		emp.empPhone();
		emp.empEmail();
		emp.empAddress();

	}

}
