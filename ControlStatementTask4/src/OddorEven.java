import java.util.Scanner;

public class OddorEven {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int Num = scan.nextInt();
		if(Num%2==0) {
			System.out.println("Even");
		}
		else{
			System.out.println("Odd");
		}
		System.out.println("program exited");
	}
	}


