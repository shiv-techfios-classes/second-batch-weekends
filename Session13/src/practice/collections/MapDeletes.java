package practice.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapDeletes {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "India");
		map.put(2, "Australia");
		map.put(3, "Chile");
		map.put(4, "Austria");
		map.put(5, "Sweden");
		
		System.out.println("Before calling delete:"+ map);
		
		String value =  "Chile";
		
		map  = delete(map, value);
		
		System.out.println("After calling delete:" + map);
		

	}
	
	static Map<Integer, String> delete(Map<Integer, String> mp, String valueTo) {

		Iterator<Entry<Integer, String>> iterator  = mp.entrySet().iterator();
		
		while(iterator.hasNext()) {
			
			if(valueTo.equals(iterator.next().getValue())) {
				
				iterator.remove();
			}
		}
		
		return mp;
	}

}
