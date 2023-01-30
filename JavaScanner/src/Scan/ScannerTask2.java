package Scan;
import java.util.Scanner;
public class ScannerTask2 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		
		System.out.println("Student Id ?");
		int id  = S.nextInt();
		System.out.println("Student Name ?");
		String name  = S.next();
		System.out.println("Mark1");
		int mark1  = S.nextInt();
		System.out.println("Mark2");
		int mark2  = S.nextInt();
		System.out.println("Mark3");
		int mark3  = S.nextInt();
		System.out.println("Mark4");
		int mark4  = S.nextInt();
		System.out.println("Mark5");
		int mark5  = S.nextInt();
		
		System.out.println("Student id :"+id);
		System.out.println("Student Name :"+name);
		System.out.println("Student Mark1 :"+mark1);
		System.out.println("Student Mark2 :"+mark2);
		System.out.println("Student Mark3 :"+mark3);
		System.out.println("Student Mark4 :"+mark4);
		System.out.println("Student Mark5 :"+mark5);
		System.out.println("Total :"+(mark1+mark2+mark3+mark4+mark5));
		System.out.println("Average :"+(mark1+mark2+mark3+mark4+mark5)/5);
	}
}
