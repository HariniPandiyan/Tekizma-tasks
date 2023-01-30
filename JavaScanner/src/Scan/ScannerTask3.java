package Scan;
import java.util.Scanner;
public class ScannerTask3 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		
		System.out.println("Student Id ?");
		int id  = S.nextInt();
		System.out.println("Student Name ?");
		String name  = S.next();
		System.out.println("Student Email ?");
		String email  = S.next();
		System.out.println("Student Phone no ?");
		long phno  = S.nextLong();
		System.out.println("Student Department ?");
		String dept  = S.next();
		System.out.println("Student Gender ?");
		String gender  = S.next();
		System.out.println("Student City ?");
		String city  = S.next();
		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
		System.out.println(phno);
		System.out.println(dept);
		System.out.println(gender);
		System.out.println(city);
	}
}
