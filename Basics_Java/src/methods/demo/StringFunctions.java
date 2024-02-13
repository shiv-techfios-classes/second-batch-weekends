package methods.demo;

public class StringFunctions {

	public static void main(String[] args) {
		// Practice String class inbuilt methods

		//Two ways to create a string in Java
		
		String firstmsg = "Welcome User.";
		
		String secondmsg = "Welcome User";
		
		String message3 = new String("Welcome User");		
		
		String message4 = new String("Welcome User");	
		
		
		String result = firstmsg.concat(secondmsg);
		
	//	result = firstmsg+secondmsg;
		
//		System.out.println(result);
		
		System.out.println(result.toUpperCase());
		System.out.println(result.toLowerCase());
		
		String fifthmsg = "A String literal to test and learn function in strings.";
		
		
		
		System.out.println(fifthmsg.startsWith("If It is"));
		
		System.out.println(fifthmsg.startsWith("A String"));
		
		System.out.println(fifthmsg.startsWith("A string"));
		
		String $msg = "     Hello Ramesh.!  ";
		
		System.out.println($msg);
		
		$msg = $msg.trim();
		
		System.out.println($msg);
		
		
		String sample = "one two three # @ %";
		
		String[] tokens =sample.split(" ");
		
		System.out.println(tokens[0]);
		System.out.println(tokens[4]);
		
		sample = "boo:and:foo";
		
		tokens =sample.split(":");
		
		System.out.println(tokens[0]);
		System.out.println(tokens[1]);
		System.out.println(tokens[2]);
		
		
		
	}

}
