package methods;

public class StringMethod {

	public static void main(String[] args) {
		
		String str = "write on console";

		String output;
		
		StringMethod obj = new StringMethod();
		
		output = obj.getReversed(str);
		
		System.out.println(output);
//		System.out.println(obj.getReversed("Hello"));
//		System.out.println(obj.getReversed("Febin"));
//		System.out.println(obj.getReversed("Sajitha"));
		
		System.out.println("-----------------------------------------");
		
		LauncherCodes.getSingleNewLine();
		
		System.out.println(obj.reverseBuilder("Sarritha"));

	}
	
	String getReversed(String input) {		
		String revStr= "";
		
		int n = input.length()-1;       //refers to the ending index of str
		
		for(int i=n; i>=0;i--) {		
			
			revStr = revStr+ input.charAt(i);
		
		}
		
		return revStr;	
	}
	
	String reverseBuilder(String token) {
		
		StringBuffer sb = new StringBuffer(token);
		
		return sb.reverse().toString();
		
	}
	
	
	
	

}
