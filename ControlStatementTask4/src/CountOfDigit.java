
public class CountOfDigit {

	public static void main(String[] args) {
		int n=123,num=0,digit;
		digit=n;
		while(digit>0)
		{
			digit=digit/10;
			num++;
		}
		System.out.println(num);

	}

}
