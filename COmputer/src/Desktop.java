
public class Desktop extends Computer {
	int desktop;
	public void desktopSize(int desk) {
		desktop=desk;
		System.out.println("No of computers:"+computer);
		System.out.println("Size of desktop:"+desktop);
	}
	
		public static void main(String[] args) {
			Desktop desk = new Desktop();
			desk.computer=5;
			desk.desktopSize(7);
	}
		
		
	

}
