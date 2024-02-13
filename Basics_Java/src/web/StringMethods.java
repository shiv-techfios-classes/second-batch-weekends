package web;

/**
 * Class for practicing string class methods
 * 
 * @author Shiv Jindal
 *
 */

public class StringMethods {

	public static void main(String[] args) {
		
		
		String str = "Alice in wonderland";
		
		System.out.println(str.length());
		
		System.out.println(str.contains("init"));
		
		System.out.println(str.concat("$$$"));
		
		
		System.out.println(str+"$$$");
		
		System.out.println(1+1);
		
		System.out.println("1".concat("2"));
		 

	
	
		
		String testStr = "Alice in wonderland. It is a beautiful movie and a book."
		                      + "\nthese lines"
				              +" \nwill be appended accordingly"
		                        + " \nbecause of concatenation using + operator";
		
		
		
		System.out.println(testStr.substring(6));
		
		System.out.println(testStr.substring(6,8));
		
		System.out.println(testStr.indexOf("wonderland"));
		
		System.out.println(testStr.substring(testStr.indexOf("It")));
		
	    int beginIndex = testStr.indexOf("lines");
		
		System.out.println(testStr.substring(beginIndex));
		
		
		
		
	}

}
