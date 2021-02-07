//import java.util.HashMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MyMap {
	/* 
	 * java.util.Map interface stores the data in key value fashion
	 * here key can't be duplicate and key at most contain one value
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "Chain");
		map.put(2, "Vanshika");
		map.put(3, "Vojeer");
		
		Iterator iterator = map.entrySet().iterator();
		
		while(iterator.hasNext()) {
			Map.Entry entry =(Map.Entry)iterator.next();
			System.out.print(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		System.out.println("--------");
		map.forEach((key,value) -> System.out.println("key :"+key +
				"Value :"+value));
		
		System.out.println("--------");
		
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " - " +entry.getValue());
		}
	}

}
