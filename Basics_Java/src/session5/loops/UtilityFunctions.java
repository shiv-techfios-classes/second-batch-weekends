package session5.loops;

public class UtilityFunctions {

	public static void main(String[] args) {
		
		String test = "Welcome to Jumanji";
		
		System.out.println(test.isEmpty());
		
		System.out.println(test.startsWith("Wel"));
		
		System.out.println(test.endsWith("Jumanji"));
		
		int position = test.indexOf("come");
		
		System.out.println(position);
		
		String s1 = "Core Java";
		String s2 = "OOPS Fundamentals";
		String s3 = "core java";
		
		boolean e1 = s2.equals(s1);
		boolean e2 = s1.equals(s3);
		boolean e3 = s1.equalsIgnoreCase(s3);
		
		System.out.println(e1 +"," + e2 + "," + e3);
		
		System.out.println("JPA Spring Hibernate".equals(s3));
		

	}

}
