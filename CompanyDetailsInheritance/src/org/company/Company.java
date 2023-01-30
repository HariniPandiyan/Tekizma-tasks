package org.company;

import org.client.Client;

public class Company extends Client{
	public void companyName() {
		System.out.println("YYYYYY");
	}
	public static void main(String[] args) {
		Company com = new Company();
		com.clientName();
		com.companyName();
	}
}
