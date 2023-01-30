package org.add;

public class GreensTech {
	String greensOmr;
	String greensAdayar;
	String greensTambaram;
	String greensVelacherry;
	String greensAnnaNagar;

	void getGreensOmr() {
		System.out.println(greensOmr);
	}
	void getGreensAdayar() {
		System.out.println(greensAdayar);
	}
	void getGreensTambaram() {
		System.out.println(greensTambaram);
	}
	void getGreensVelacherry() {
		System.out.println(greensVelacherry);
	}
	void getGreensAnnaNagar() {
		System.out.println(greensAnnaNagar);
	}
	
	
	
	public static void main(String[] args) {
		GreensTech greens= new GreensTech();
		
		greens.greensOmr = "green1";
		greens.greensAdayar = "green2";
		greens.greensTambaram = "green3";
		greens.greensVelacherry = "green4";
		greens.greensAnnaNagar = "green5";
		
		greens.getGreensOmr();
		greens.getGreensAdayar();
		greens.getGreensTambaram();
		greens.getGreensVelacherry();
		greens.getGreensAnnaNagar();
		
	}
}
