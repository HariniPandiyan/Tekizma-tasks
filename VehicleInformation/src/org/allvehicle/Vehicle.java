package org.allvehicle;

import org.twowheeler.*;
import org.fourwheeler.*;
import org.threewheeler.*;

public class Vehicle {
	public void VehicleNecessery(String trainNo,String trainName) {
		System.out.println("Train No : "+trainNo);
		System.out.println("Train Name : "+trainName);
	}
	public static void main(String[] args) {
		TwoWheller tw = new TwoWheller();
		ThreeWheeler thw = new ThreeWheeler();
		FourWheeler fw = new FourWheeler();
		Vehicle veh = new Vehicle();
		System.out.println("BIKE");
		System.out.println("----------");
		tw.bike("TN 38 TY 4587", "bullet");
		System.out.println("CYCLE");
		System.out.println("----------");
		tw.cycle("Lady Bird");
		
		System.out.println("AUTO");
		System.out.println("----------");
		thw.auto("TN 38 AU 3056");
		
		System.out.println("CAR");
		System.out.println("----------");
		fw.car("KA 58 GV 3548", "Hexa");
		System.out.println("BUS");
		System.out.println("----------");
		fw.bus("TN 37 KJ 6749", "TNSTC");
		System.out.println("LORRY");
		System.out.println("----------");
		fw.lorry("KA 67 SD 5058");
		
		System.out.println("TRAIN");
		System.out.println("----------");
		veh.VehicleNecessery("567889", "Chennai Express");
	}

}
