package org.india;
import org.andrapradesh.AndhraPradesh;
public class India extends AndhraPradesh {
	String TamilNadu;
	String Kerala;
	String AndhraPradesh;
	public void india() {
		System.out.println("Tamil is spoken in "+TamilNadu);
		System.out.println("malayalam is spoken in "+Kerala);
		System.out.println("Telugu is spoken in "+AndhraPradesh);

	}
	public static void main(String[] args) {
		India ind = new India();
		ind.TamilNadu="TamilNadu";
		ind.Kerala="Kerala";
		ind.AndhraPradesh="AndhraPradesh";
		ind.india();

	}

}
