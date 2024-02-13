package write.to.properties;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class TestProperties {

	public static void main(String[] args) {
		
		Properties props = new Properties();
		
		try {
			
			props.load(new FileReader("basic.properties"));
			
		} catch (IOException e) {
			
			System.out.println("::::::::::Caught IO Exception:::::::::::");
			e.printStackTrace();
		}
		
		Set<Entry<Object, Object>> entries = props.entrySet();
		
		Map<Integer, Double> emps = new HashMap<Integer, Double>();
		
		emps.put(1, 87.9);
		emps.put(2, 87.8);
		emps.put(3, 87.7);
		
		emps.entrySet();
		
		displayProperties(entries);
		Properties p1 = System.getProperties();	
		
		displayProperties(p1.entrySet());


	}
	
	public static void displayProperties(Set<Entry<Object, Object>> e) {
	
		for(Entry e1: e) {
			System.out.println(e1.getKey() + ">>>>" + e1.getValue());
		}
	}

}
