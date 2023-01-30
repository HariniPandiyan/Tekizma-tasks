package org.emp;

public class EmployeeTask3 {
	public void empId(int empId) {
		System.out.println("This is using int"+empId);
	}
	public void empId(int empId,long Id) {
		System.out.println(empId);
		System.out.println(Id);
		
	}
	public static void main(String[] args) {
		EmployeeTask3 emp = new EmployeeTask3(); 
		emp.empId(101);
		emp.empId(102,105);
	}
}

