package org.phone;


public class PhoneInfo {
	String phoneName;
	long phoneMieiNum;
	String Camera ;
	String storage ;
	String osName;
	
	void SetMethod(String name,long mieiNum,String cam,String sto,String os){
		phoneName = name;
		phoneMieiNum = mieiNum;
		Camera=cam;
		storage=sto;
		osName=os;
	}
	
	void Display() {
		System.out.println(phoneName);
		System.out.println(phoneMieiNum);
		System.out.println(Camera);
		System.out.println(storage);
		System.out.println(osName);
	}
	public static void main(String[] args) {
		PhoneInfo pho1 = new PhoneInfo();
		pho1.SetMethod("Samsung",346996467834567L,"version 12.0.06.10","128GB","xxx");
		pho1.Display();
	}
}
