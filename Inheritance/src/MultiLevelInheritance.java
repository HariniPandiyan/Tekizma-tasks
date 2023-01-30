	class Air {
		int a;
		int b;
		
		public void display() {
			System.out.println(a+b);
		}
	}
	class Bore extends Air{
		int x;
		int y;
		
		public void show() {
			System.out.println(x+y);
		}
	}
	class C extends Bore{
		int p;
		int q;
		
		public void put() {
			System.out.println(p+q);
		}
	}

public class MultiLevelInheritance {
	public static void main(String[] args) {
		C cobj = new C();
		cobj.p = 400;
		cobj.q = 200;
		cobj.put();
		
		cobj.x = 200;
		cobj.y = 300;
		cobj.show();
		
		cobj.a = 100;
		cobj.b = 200;
		cobj.display();
	}
}
