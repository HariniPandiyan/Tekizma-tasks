
public class ArratTask7_2 {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int sum=0,avg=0;
		for(int i:a) {
			//System.out.println(i);
			sum=sum+i;
			avg=sum/a.length;
		}
		System.out.println(avg);
	}
}
