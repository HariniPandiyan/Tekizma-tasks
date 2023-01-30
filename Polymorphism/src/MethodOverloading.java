
public class MethodOverloading {
	
	int a=10;
	int b=12;
	
	void sum() {
		System.out.println(a+b);
	}
	void sum(int x, int y) {
		System.out.println(x+y);
	}
	
	void sum(int x, int y, int z) {
		System.out.println(x+y+z);
	}
	
	void sum(int x, double y) {
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		MethodOverloading mo = new MethodOverloading();
		mo.sum();
		mo.sum(11, 20);
		mo.sum(30,40, 30);
		mo.sum(35, 35.5);
	}

}
