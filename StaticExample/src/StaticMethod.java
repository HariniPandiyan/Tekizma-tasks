
public class StaticMethod {
	int a;
	static int b;

	static void m1() {//static
		System.out.println("this is static method");
	}
	void m2() {//non-static
		System.out.println("this is non static method");
	}
	void m3() {//non-static
		a=300;
		System.out.println(a);
		b=400;
		System.out.println(b);
		m1();
		m2();
	}
	public static void main(String[] args) {
		// Static method can access only static stuff(variable and method)
		/*b=100;
		System.out.println(b);
		m1();*/
		
		//Static method can access non-static,but through objects
		StaticMethod sm = new StaticMethod();
		/*sm.a=200;
		System.out.println(sm.a);
		sm.m2();*/
		
		//non static method can access both static and non-static variables and methods.
		sm.m3();

	}

}
