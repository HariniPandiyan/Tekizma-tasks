
public class ArrayUsingObjectClass {

	public static void main(String[] args) {
		Object obj[] = new Object[5];
		obj[0]=10;
		obj[1]=12.556;
		obj[2]="Welcome";
		obj[3]='F';
		obj[4]=true;
		
		for(Object i:obj) {
			System.out.println(i);
		}
	}

}
