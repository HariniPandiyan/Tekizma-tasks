
public class Desktop implements Software{
	public void hardwareResources() {
		System.out.println("HardwareResourses");
		
	}

	public void softwareResources() {
		System.out.println("SoftwareResourses");
		
	}
	public static void main(String[] args) {
		Software des = new Desktop();
		des.softwareResources();
		des.hardwareResources();
		
		HardWare har = new Desktop();
		har.hardwareResources();
		
	}

}
