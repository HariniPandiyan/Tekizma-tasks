package Scan;
import java.util.Scanner;
public class JavaScan {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		
		System.out.println("What's Your Name ?");
		String name  = S.next();
		System.out.println("What's Your Age ?");
		int age  = S.nextInt();
		System.out.println(name);
		System.out.println(age);
	}
}
