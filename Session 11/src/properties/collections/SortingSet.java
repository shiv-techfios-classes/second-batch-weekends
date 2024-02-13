package properties.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SortingSet {

	public static void main(String[] args) {
		
	//	Set<String>  names = new HashSet<String>();	
		
		Set<String>  names = new TreeSet<String>();
		
		names.add("Prerna");
		names.add("Abhimanyu");
		names.add("Subhash");
		names.add("Charu");
		names.add("Ellie");
		names.add("Ellie");
		
		CollectionsMethods.displayCollection(names);
		
		Set<Integer> integers =  new TreeSet<>();
		
		integers.add(12);
		integers.add(23);
		integers.add(new Integer(100));
		integers.add(Integer.valueOf(34));
		
		CollectionsMethods.displayCollection(integers);
		
		
		
		
		

	}

}
