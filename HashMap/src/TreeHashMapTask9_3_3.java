import java.util.Map;
import java.util.TreeMap;

public class TreeHashMapTask9_3_3 {

	public static void main(String[] args) {
		TreeMap<Character,Integer> list = new TreeMap<Character,Integer>();
		list.put('!',10);
		list.put('@',20);
		list.put('#',30);
		list.put('$',40);
		list.put('%',50);
		list.put('^',60);
		list.put('&',10);
		list.put('*',50);
		list.put('(',40);
		
		System.out.println(list.size());
		
		for(Map.Entry s:list.entrySet()) {
			System.out.println(s.getValue());
		}
	}

}
