package loops;

public class ContinueStatement {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++){
			if(i==5) {
				continue;//Skip the value and continue
			}
			System.out.println(i);
		}
		System.out.println("program exited");
	}


	}

