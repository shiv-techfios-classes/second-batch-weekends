package practice.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SortMapOnValues {

	public static void main(String[] args) {
		
		Map<String, Integer> marks = new HashMap<String, Integer>();
		
		marks.put("DBMS", 91);

		marks.put("OS", 78);
		
		marks.put("MircoProcessors", 89);
		
		marks.put("Java", 94);
		
		marks.put("Management Economics", 82);
		
		
		System.out.println(sortOnValues(marks));
	}

	static Map<String, Integer> sortOnValues(Map<String, Integer> mp) {
		
		List<Map.Entry<String, Integer>> list =  new LinkedList<>(mp.entrySet());
		
		
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				
				return o1.getValue().compareTo(o2.getValue());
			}
		});

		Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
		
		for(Map.Entry<String, Integer> ent:list) {
			
			sortedMap.put(ent.getKey(), ent.getValue());
		}
		
		return sortedMap;
	}
}
