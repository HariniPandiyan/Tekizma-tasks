package org.edu;

public class Arts {
	public void bSc() {
		System.out.println("Arts BSc");
	}
	public void bEd() {
		System.out.println("Arts BEd");
	}
	public void bA() {
		System.out.println("Arts BA");
	}
	public void bBA() {
		System.out.println("Arts BBA");
	}
	public void ug() {
		System.out.println("Arts ug");
	}
	public void pg() {
		System.out.println("Arts pg");
	}
	public static void main(String[] args) {
		Education edu = new Education();
		edu.ug();
		edu.pg();
		
		System.out.println("--------------------------");
		
		Arts art = new Arts();
		art.bSc();
		art.bEd();
		art.bA();
		art.bBA();
		art.ug();
		art.pg();

	}

}
