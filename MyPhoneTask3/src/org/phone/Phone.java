package org.phone;

public class Phone {
	
	public void phoneInfo(int storage,String name) {
		System.out.println("Phone storage = "+storage);
		System.out.println("Phone name = "+name);
	}
	public void phoneInfo(String storage,int name) {
		System.out.println("Phone storage = "+storage);
		System.out.println("Phone name = "+name);
		
	}
	public static void main(String[] args) {
		Phone phone = new Phone();
		phone.phoneInfo(128,"Samsung");
		phone.phoneInfo("Real Me", 128);
	}

}
