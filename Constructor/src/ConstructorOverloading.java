
public class ConstructorOverloading {

	int a;
	int b;
	double c;
	ConstructorOverloading (){
		a =10;
		b =20;
		c = 20.5;
	}
	ConstructorOverloading (int x,int y){
		a = x;
		b = y;
	}
	ConstructorOverloading (int x,double y){
		a = x;
		c = y;
	}
	ConstructorOverloading (int x,int y,double z){
		a = x;
		b = y;
		c = z;
	}
	void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	public static void main(String[] args) {
		//First
		/*ConstructorOverloading co = new ConstructorOverloading();*/
		//Second
		/*ConstructorOverloading co = new ConstructorOverloading(10,20);*/
		//Third
		/*ConstructorOverloading co = new ConstructorOverloading(10,20.5);*/
		//Fourth
		//Second
		ConstructorOverloading co = new ConstructorOverloading(10,20,20.5);
		co.display();

	}

}
