package org.emp;
import org.company.*;
import org.client.*;
import org.project.*;
public class Employee {
	String empName;
	public void empName(String empName) {
		System.out.println(empName);
	}
	
	public static void main(String[] args) {
		Company cmp = new Company();
		Client cli = new Client();
		Project pro = new Project();
		Employee emp = new Employee();
		
		emp.empName("Indhu");
		cmp.companyName("Tekizma");
		cli.cllientName("xxxxxx");
		pro.projectName("Java");
	}
}
