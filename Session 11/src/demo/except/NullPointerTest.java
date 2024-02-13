package demo.except;

public class NullPointerTest {

	public static void main(String[] args) {
		
		String firstName = null;
		
		if(firstName !=null) {
			System.out.println(firstName.toUpperCase());
		} else {
			
			firstName = "Sam";
		}
		
		System.out.println(firstName);

	}

}
