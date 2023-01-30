package org.bank;

public class BankInfo extends AxisBank{
	long Saving; 
	int fixed;
	public void saving(long save) {
		
		Saving=save;
	}
	public void fixed(int fix) {
		fixed=fix;
		System.out.println(Deposit);
		System.out.println(Saving);
		System.out.println(fixed);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankInfo bank = new BankInfo();
		bank.Deposit=100000;
		bank.Saving=5000;
		bank.fixed(200);
	}

}
