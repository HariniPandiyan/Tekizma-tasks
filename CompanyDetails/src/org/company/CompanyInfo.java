package org.company;

public class CompanyInfo {
	String companyName;
	int companyId;
	String companyAddress;

	CompanyInfo(String name,int id,String address)
	{
		companyName=name;
		companyId=id;
		companyAddress=address;
		
	}
	
	void Display() {
		System.out.println("CompanyName = " +companyName);
		System.out.println("CompanyId = "+companyId);
		System.out.println("CompanyAddress = "+companyAddress);
	}
	public static void main(String[] args) {
		CompanyInfo cmp1 = new CompanyInfo("Tekizma",5690,"JP Nagar,Bangalore");
		cmp1.Display();
		
	}

}
