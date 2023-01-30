import java.util.ArrayList;

public class ArrayListExample {

	
	public static void main(String[] args) {
		/*ArrayList<String> list = new ArrayList();
		list.add("hi");
		list.add("Welcome");
		list.add("to");
		list.add("Java");
		list.add("tutorials");
		
		System.out.println(list.size());
		
		for(String s:list) {
			System.out.println(s);
		}*/
		
		
		ArrayList list=new ArrayList();
		list.add("Welcome");
		list.add(10);
		list.add(10.456);
		list.add('c');
		
		
		//System.out.println(list.size());
		
		//inserting elements
		
		list.add(2, "training");//add after index 2
		list.add(1,2020);
		
		//System.out.println(list.size());
		System.out.println(list);
		
		//removing elements
		list.remove("Welcome");//directly remove value
		
		System.out.println(list);
		
		//removing elements
		
		list.remove(2);
				
		System.out.println(list);
		
		
	}

}
