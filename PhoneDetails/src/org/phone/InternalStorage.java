package org.phone;

public class InternalStorage {
	String proccessorName="xxxxx";
	int ramSize=128;
	public void proccessorName() {
		System.out.println("PROCCESSOR NAME = "+proccessorName);
	}
	public void ramSize() {
		System.out.println("RAM SIZE = "+ramSize);
	}
	public static void main(String[] args) {
		ExternalStorage Ex = new ExternalStorage();
		InternalStorage In = new InternalStorage();
		Ex.size();
		In.proccessorName();
		In.ramSize();
	}

}
