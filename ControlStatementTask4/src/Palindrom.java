
public class Palindrom {

	public static void main(String[] args) {
		int n=121,rem=0,rev=0;
		int digit = n;
		while(digit!=0)
		{
			rem=digit%10;
			rev=rev*10 + rem;
			digit=digit/10;
		
			
		}
		System.out.println(rev);
		if(n==rev) {
			System.out.println("Number is Palindrom");
		}
		else {
			System.out.println("Number is Not Palindrom");
		}
	}

}
