package org.college;

public class Student extends Hostel{
	String StdName;
	String Stddept;
	int StdId;
 public void studentName(String stdname) {
	 StdName=stdname;
 }
 public void studentDept(String stddept) {
	 Stddept=stddept;
 }
 public void studentId(int stdid) {
	 StdId=stdid;
	 System.out.println("Student id:"+StdId);
	System.out.println("Student Name:"+StdName);
	System.out.println("Student Department:"+Stddept);
	System.out.println("Student Hostel Name:"+hostelName);
	System.out.println("Student Department Name:"+deptName);
	System.out.println("Student College Name:"+Name);
	System.out.println("Student College Code:"+Code);
	System.out.println("Student College Rank :"+Rank);
	}
	
		public static void main(String[] args) {
			Student std = new Student();
			std.StdName="Indhu G";
			std.Stddept="Msc SS";
			
			std.hostelName="Cit hostel";
			std.deptName="Computing";
			std.Name="CIT";
			std.Code=43221;
			std.Rank=3;
			std.studentId(24);
			
	}
}
