package demo.except;

public class TestExceptn1 {

	public static void main(String[] args) {
		
		int x = 3;
		
		int y = 0;
		
		System.out.println("Before divide");
		
		double z = 0;
		
		try {
			
			z= x/y;
			
		}catch( ArithmeticException ae) {
			
			System.out.println("Handled the Arithmetic exception.");
			try {
				//nested try catchs are allowed.
				//you can return from inside catch block.
			}catch(Exception e) {
				
			}
			
		}finally {
			
			System.out.println("Guessing on finally block.");
			
			try {
				
				//try-catch is allowed inside finally also.
			
			}catch(Exception e) {
				
			}
			
		}			
		
		System.out.println("Result:" + z);
	
		doOtherStuff();

	}

	private static void doOtherStuff() {
			System.out.println("Inside doStuff");
		
	}

}