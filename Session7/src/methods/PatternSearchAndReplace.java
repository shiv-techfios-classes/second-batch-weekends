package methods;

public class PatternSearchAndReplace {
	
	public static void main(String[] args) {
		
		String s1 = "Too --hot to;&&^^^ hoot";
		
		String s2 = "12321";
		String op = cleanInput(s1);
		
		System.out.println(op);
		
		boolean res = checkPalindrome(cleanInput(s2));
		
		System.out.println(res);

	}
	
	static String cleanInput(String str) {
		
//		String replaceOne = str.replaceAll("[^a-zA-Z0-9\\s+]", "");
		String replaceOne = str.replaceAll("[^a-zA-Z0-9\\s+]", "");
		return replaceOne;
	}

	static boolean checkPalindrome(String s) {
		
		StringBuffer sb =new StringBuffer(s);
		sb.reverse();
		if(s.equals(sb.toString())) 
			return true;
		else 
			return false;
	}
}
