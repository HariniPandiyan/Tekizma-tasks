import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer,String> list = new HashMap<Integer,String>();
		list.put(101,"abilash");
		list.put(103,"Boopal");
		list.put(106,"Chandru");
		
		System.out.println(list.size());
		
		for(Map.Entry s:list.entrySet()) {
			System.out.println(s.getKey()+" "+s.getValue());
		}
		
		list.remove(103);
		System.out.println(list);

	}

}
