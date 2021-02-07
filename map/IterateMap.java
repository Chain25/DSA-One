package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IterateMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
		
		myMap.put(1, 5);
		myMap.put(2, 4);
		myMap.put(3, 3);
		myMap.put(4, 2);
		myMap.put(5, 1);
		
		Iterator<Map.Entry<Integer, Integer>> iterator =myMap.entrySet().iterator();
		
		while(iterator.hasNext()) {
			Map.Entry<Integer, Integer> entry =iterator.next();
			System.out.println("key : "+entry.getKey()
			+" value : "+entry.getValue());
		}
		
		System.out.println("-----------");
		
		for(Map.Entry<Integer, Integer> iteratoor : myMap.entrySet()) {
			System.out.println(iteratoor);
		}
		
		myMap.forEach((k,v) -> System.out.println(k+"-"+v));
	}

}
