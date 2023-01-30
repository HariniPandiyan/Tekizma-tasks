
public class AmstrongNumber {

	public static void main(String[] args) {
		
			int n=153,num=0,sum=0,rem=0,digit;
			digit=n;
			while(digit>0)
			{
				digit=digit/10;
				num++;
			}
			//System.out.println();
			digit=n;
			while(digit>0) {
				rem=digit%10;
				sum+=(Math.pow(rem, num));
				digit=digit/10;
				//System.out.println(sum);
			}
			
			if(n==sum) {
				System.out.println(n+" is Armstrong Number");
			}
			else{
				System.out.println(n+" is Not an Armstrong Number");
			}
	

	}

}
