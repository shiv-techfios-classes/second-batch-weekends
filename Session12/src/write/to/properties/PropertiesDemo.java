package write.to.properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

/**
 * Properties is a subclass of Hashtable.
 * It is used to maintain a list of values in which the key is a string
 * and the value is also a string i.e; it can be used to store 4
 * and retrieve string type data from the properties file.
 *
 */
public class PropertiesDemo {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		
		Properties systemProps = System.getProperties();
		
		FileReader fr= null;
		
		try {
			fr = new FileReader("details.properties");
			
			prop.load(fr);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
		displayProperties(prop.entrySet());
		
		displayProperties(systemProps.entrySet());
		
		Properties p = new Properties(); 
		  
        // add properties to it 
        p.setProperty("name", "Ganesh Chowdhary Sadanala"); 
        p.setProperty("email", 
                      "ganeshs.gfg@gmail.com"); 
  
        // store the properties to a file 
        try {
		
        	p.store(new FileWriter("info.properties"), 
			        "GeeksforGeeks Properties Example");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}
	
	
	public static void displayProperties(Set<Entry<Object, Object>> set) {
		
		for(Entry entry: set) {

			System.out.println(entry.getKey() + "=" + entry.getValue());
					
		}
		
	}

}
