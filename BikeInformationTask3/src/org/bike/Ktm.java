package org.bike;

public class Ktm implements Bike{
	public void cost() {
		System.out.println("Cost of Bike is 1,50,000/-");
	}
	public void speed() {
		System.out.println("Speed of Bike is xxxxx");
	}
	public static void main(String[] args) {
		/*Ktm ktm = new Ktm();
		ktm.cost();
		ktm.speed();*/
		Bike bike = new Ktm();
		bike.cost();
		bike.speed();
	}

}
