package sessionsix.loops;

public class SwitchStatements {

	public static void main(String[] args) {
		int n=4;
		
		switch(n) {		
		case 1:
			System.out.println("One");
			System.out.println("One");
			System.out.println("One");
			System.out.println("One");
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 4:
			System.out.println("Four");
			System.out.println("Matching case 4");
			System.out.println("Only this will work.");
	
		case 8:
			System.out.println("Eight");
		
		default:
			System.out.println("To the default case.");
			break;
		}
 
	}

}
