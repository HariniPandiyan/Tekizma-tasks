	class A {
		int a;
		int b;
		
		public void display() {
			System.out.println(a+b);
		}
	}
	class B extends A{
		int x;
		int y;
		
		public void show() {
			System.out.println(x+y);
		}
	}

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*A aobj =new A();
		aobj.a=100;
		aobj.b=200;
		aobj.display();*/
		
		B bobj = new B();
		bobj.x = 200;
		bobj.y = 300;
		bobj.show();
		
		bobj.a = 100;
		bobj.b = 200;
		bobj.display();

	}

}
