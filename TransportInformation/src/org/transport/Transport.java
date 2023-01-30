package org.transport;

import org.air.Air;
import org.road.Road;
import org.water.Water;

public class Transport {
	int TransportForm;
	Transport(int Transport){
		TransportForm=Transport;
	}
	public void displayTransport() {
		System.out.println("No of TransportForm Available:"+ TransportForm);
	}
	public static void main(String[] args) {
		Transport t = new Transport(3);
		t.displayTransport();
		Road r =new Road(5,3,6,8);
		r.displayRoad();
		Air a = new Air(2,1);
		a.displayAir();
		Water w = new Water(4,3);
		w.displayWater();
		

	}

}
