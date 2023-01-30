package org.univ;

public class College {
	public void ug() {
		System.out.println("College ug");
	}
	public void pg() {
		System.out.println("College pg");
	}
	public static void main(String[] args) {
		University uni = new University();
		uni.ug();
		uni.pg();
		System.out.println("-----------------------");
		College col = new College();
		col.ug();
		col.pg();
	}

}
