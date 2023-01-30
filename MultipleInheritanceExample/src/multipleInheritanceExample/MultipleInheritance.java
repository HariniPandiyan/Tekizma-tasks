package multipleInheritanceExample;

interface A{
	int a = 20;
    void display();
}

interface B{
	int b = 30;
	void show();
}
public class MultipleInheritance implements A,B{

	public void display() {
			System.out.println(a);
		
	}
	public void show() {
		System.out.println(b);
	}
	public void add() {
		System.out.println(a+b);
	}
	

	public static void main(String[] args) {
		MultipleInheritance multi =new MultipleInheritance();
		multi.display();
		multi.show();
		multi.add();

	}

}
