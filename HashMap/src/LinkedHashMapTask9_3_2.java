import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTask9_3_2 {

	public static void main(String[] args) {
		LinkedHashMap<Integer,Integer> list = new LinkedHashMap<Integer,Integer>();
		list.put(10,10);
		list.put(20,20);
		list.put(30,30);
		list.put(40,40);
		list.put(50,50);
		list.put(60,60);
		list.put(10,10);
		list.put(50,50);
		list.put(40,40);
		
		System.out.println(list.size());
		
		for(Map.Entry s:list.entrySet()) {
			System.out.println(s.getValue());
		}
	}

}
