package methods;

public class LauncherCodes {

	public static void main(String[] args) {

		Rectangle rec = new Rectangle(1.2, 2.4);
	}
	

	static void getSingleNewLine() {
		
		System.out.println();
		
	}
	
	static void getDoubleNewLine() {
		
		System.out.println();
		System.out.println();
		
	}
	
	
	static boolean isPalindrome(String in) {
	
		StringMethod obj = new StringMethod();
		
		String rev = obj.getReversed(in);
		
		if(rev.equals(in)) {
			return true;
		}else {
			return false;
		}
	}
	
	

}
