
public class Fibonacci {

	public static void main(String[] args) {
		int p=0,q=1,r;
		System.out.println(p);
		System.out.println(q);
		for(int i=2;i<100;++i) {
			r=p+q;
			//System.out.println("program exited");
			System.out.println(r);
			p=q;
			q=r;
		}
		

	}

}
