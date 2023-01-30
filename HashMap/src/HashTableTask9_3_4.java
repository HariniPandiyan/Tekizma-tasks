import java.util.Hashtable;
import java.util.Map;

public class HashTableTask9_3_4 {

	public static void main(String[] args) {
		Hashtable<String,String> list = new Hashtable<String,String>();
		list.put("vel","Selenium");
		list.put("Ganesh","framework");
		list.put("Dinesh","oracle");
		list.put("Vengat","corejava");
		list.put("subash","jira");
		
		
		System.out.println(list.size());
		
		for(Map.Entry s:list.entrySet()) {
			System.out.println(s.getValue());
		}

	}

}
