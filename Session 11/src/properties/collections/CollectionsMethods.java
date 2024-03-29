package properties.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsMethods {

	public static void main(String[] args) {
		
		List<String> countries =  new ArrayList<String>();
		
		Set<String> asianCountries  =  new HashSet<String>();
		
		asianCountries.add("Singapore");
		asianCountries.add("Japan");
		asianCountries.add("Hong Kong");
		asianCountries.add("Malaysia");
		asianCountries.add("Japan");
		asianCountries.add("Hong Kong");
		
		displayCollection(asianCountries);
		System.out.println("****************************************");
		
		countries.add("Malaysia");
		countries.add("Singapore");
		countries.add("US");
		countries.add("UK");
		countries.add("Scotland");
		countries.add("Hong Kong");
		countries.add("Malaysia");
		countries.add("Singapore");
		
		asianCountries.remove("Malaysia");		
		countries.remove("Singapore");
		
			
		displayCollection(countries);
		
		System.out.println(asianCountries.size());

	}

	public static <T> void displayCollection(Collection<T> c) {
		
		for(T t:c) {
			System.out.println(t);
		}
	}
}
