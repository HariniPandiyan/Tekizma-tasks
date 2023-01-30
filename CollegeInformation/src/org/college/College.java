package org.college;

public class College {

	public void collegeName(String collegeName) {
		System.out.println("COLLEGE NAME = "+	collegeName);
	}
	
	public void collegeCode(int collegeCode) {
		System.out.println("COLLEGE CODE = "+	collegeCode);
	}
	
	public void collegeRank(int collegeRank) {
		System.out.println("COLLEGE RANK = "+	collegeRank);
	}
	public static void main(String[] args) {
		Student std = new Student();
		Dept dep = new Dept();
		College clg = new College();
		Hostel host = new Hostel();
		std.studentId(101);
		std.studentName("Indhu G");
		std.studentDept("Msc");
		dep.deptName("Computing");
		clg.collegeCode(113);
		clg.collegeName("CIT");
		clg.collegeRank(3);
		host.hostelName("Sai Vishnu");
	}

}
