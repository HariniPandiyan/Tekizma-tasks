package org.road;

public class Road {
	int bike;
	int cycle;
	int bus;
	int car;
	public Road(int b,int c,int bu,int ca){
		bike=b;
		cycle=c;
		bus=bu;
		car=ca;
	}
	public void displayRoad() {
		System.out.println("No of Bike Available:"+bike);
		System.out.println("No of Cycle Available:"+cycle);
		System.out.println("No of Bus Available:"+bus);
		System.out.println("No of Car Available:"+car);
	}
}
