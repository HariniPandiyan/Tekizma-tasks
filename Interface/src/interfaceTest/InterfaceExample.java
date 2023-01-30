package interfaceTest;

interface TestInt {
	int a = 50;
	void display();
}

public class InterfaceExample implements TestInt {
	@Override
	public void display() {
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestInt test = new InterfaceExample();
		test.display();
	}

	

}
