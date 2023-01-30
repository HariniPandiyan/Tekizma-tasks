package org.company;

public class CompanyInfo {
	public void companyName(int id) {
		System.out.println("xxxxxx company id = "+id);
	}
	public void companyName(int id,String name) {
		System.out.println("yyyyyy company id = "+id);
		System.out.println("yyyyyy company name = "+name);
	}
	public void companyName(int id,String name,String address) {
		System.out.println("zzzzzz company id = "+id);
		System.out.println("zzzzzz company name = "+name);
		System.out.println("zzzzzz company address = "+address);
	}
	public static void main(String[] args) {
		CompanyInfo com = new CompanyInfo();
		com.companyName(103);
		com.companyName(105,"Tekizma");
		com.companyName(105,"Tekizma","Bangalore");

}
}