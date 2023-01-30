package org.air;

public class Air {
	int aeroPlane;
	int heliCopter;
	public Air(int aero,int heli){
		aeroPlane=aero;
		heliCopter=heli;
	}		
	public void displayAir() {
		System.out.println("No of AeroPlane Available:"+aeroPlane);
		System.out.println("No of HeliCopter Available:"+heliCopter);
	}
}
