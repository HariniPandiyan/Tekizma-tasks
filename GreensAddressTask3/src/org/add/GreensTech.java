package org.add;

public class GreensTech {
	public void greensOmr(String place) {
		System.out.println(place);
	}
	public void greensOmr(String place,String state,int area) {
		System.out.println(place);
		System.out.println(state);
		System.out.println(area);
	}
	public void greensOmr(String place,int area,String state) {
		System.out.println(place);
		System.out.println(area);
		System.out.println(state);
	}
	public static void main(String[] args) {
		GreensTech green = new GreensTech();
		green.greensOmr("Chennai", "Tamil Nadu",3045);
		System.out.println("---------------------------");
		green.greensOmr("Chennai", 4308, "Tamil Nadu");


	}

}
