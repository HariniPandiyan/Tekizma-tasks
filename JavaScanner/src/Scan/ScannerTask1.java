package Scan;
import java.util.Scanner;
public class ScannerTask1 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		
		System.out.println("Employee Id ?");
		int id  = S.nextInt();
		System.out.println("Employee Name ?");
		String name  = S.next();
		System.out.println("Employee Email ?");
		String email  = S.next();
		System.out.println("Employee Phone no ?");
		long phno  = S.nextLong();
		System.out.println("Employee Salary ?");
		int salary  = S.nextInt();
		System.out.println("Employee Gender ?");
		String gender  = S.next();
		System.out.println("Employee City ?");
		String city  = S.next();
		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
		System.out.println(phno);
		System.out.println(salary);
		System.out.println(gender);
		System.out.println(city);
	}
}
