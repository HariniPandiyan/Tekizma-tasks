import java.util.HashMap;
import java.util.Map;

public class HashMapTask9_2_1 {

	public static void main(String[] args) {
		HashMap<Integer,String> list = new HashMap<Integer,String>();
		list.put(10,"java");
		list.put(20,"sql");
		list.put(30,"oops");
		list.put(40, "Sql");
		list.put(50,"oracle");
		list.put(60, "DB");
		list.put(10,"selenium");
		list.put(50,"psql");
		list.put(40,"Hadoop");
		
		System.out.println(list.size());
		
		for(Map.Entry s:list.entrySet()) {
			System.out.println(s.getKey());
		}
	}

}
