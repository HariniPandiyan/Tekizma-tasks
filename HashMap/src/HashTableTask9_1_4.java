import java.util.*;

public class HashTableTask9_1_4 {

	public static void main(String[] args) {
		Hashtable<String,String> list = new Hashtable<String,String>();
		list.put("vel","Selenium");
		list.put("Ganesh","framework");
		list.put("Dinesh","oracle");
		list.put("Vengat","corejava");
		list.put("subash","jira");
		
		
		System.out.println(list.size());
		
		for(Map.Entry s:list.entrySet()) {
			System.out.println(s.getKey()+" "+s.getValue());
		}
	}

}
