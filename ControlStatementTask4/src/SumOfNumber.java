
public class SumOfNumber {

	public static void main(String[] args) {
		int n=153,num=0,digit,rem=0,sum=0;
		digit=n;
		while(digit>0) {
			rem=digit%10;
			sum+=rem;
			digit=digit/10;
			
		}
		System.out.println(sum);
	}

}
