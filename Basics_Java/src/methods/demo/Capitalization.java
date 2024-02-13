package methods.demo;

import java.util.Arrays;
import java.util.Collections;

public class Capitalization {

	public static void main(String[] args) {


		String[] cities = {"connecticut", "oklahoma" , "dallas" , "princeton", "frisco"};
		
		String derivedString = cities[0].replace('n', 'm');
		
		String[] b= cities.clone();
		
		System.out.println(Arrays.toString(b));
		
		System.out.println(derivedString);
		
		System.out.println("Before:");
		
		
		Arrays.sort(cities);
		
		System.out.println(Arrays.toString(cities));
		
		Arrays.sort(cities, Collections.reverseOrder());
		
		System.out.println("\nAfter:" + Arrays.toString(cities));
		
	}
		
}
