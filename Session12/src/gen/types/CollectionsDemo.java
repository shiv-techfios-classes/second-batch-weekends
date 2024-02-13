package gen.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionsDemo {

	public static void main(String[] args) {
		
		Map<Integer, String> hm = new HashMap<>();
		
		Map<Integer, String> lhm = new LinkedHashMap<>();
		
		
		hm.put(1, "Radha");
		hm.put(3, "Mira");
		hm.put(2, "Kallesh");
		hm.put(5, "Mallesh");
		hm.put(11, "Manohar");
		hm.put(25, "Kailash");
		
		System.out.println(hm);
		
		lhm.put(1, "Radha");
		lhm.put(3, "Mira");
		lhm.put(2, "Kallesh");
		lhm.put(5, "Mallesh");
		lhm.put(11, "Manohar");
		lhm.put(25, "Kailash");
		
		System.out.println(lhm);
		
		Collection<String> values = lhm.values();
		
		System.out.println(values);
		
		List<String> listOfValues = new ArrayList<>(values);
 		
		Collections.sort(listOfValues);
		
		System.out.println(listOfValues);
		
		Set<Integer> allkeys = lhm.keySet();
		
		System.out.println(allkeys);

	}

}
