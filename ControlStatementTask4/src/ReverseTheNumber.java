
public class ReverseTheNumber {
	public static void main(String[] args) {
		int digit=123,rem=0,rev=0;
		while(digit!=0)
		{
			rem=digit%10;
			rev=rev*10 + rem;
			digit=digit/10;
		
			
		}
		System.out.println(rev);
}

	
}
