package org.bank;

public class AxisBank {
	
	public void deposit() {
		System.out.println("AxisBank deposit");
	}
	public static void main(String[] args) {
		BankInfo bank = new BankInfo();
		bank.saving();
		bank.fixed();
		bank.deposit();
		
		AxisBank axis = new AxisBank();
		axis.deposit();

		
		
	}

}
