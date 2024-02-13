package session5.loops;

public class ExampleContinue {

	public static void main(String[] args) {
		
		int count = 0;
		
		while(count< 100) {
			
			count = count+ 4;
			
			if(count%12==0)
				continue;
			
			System.out.print(count + " ");
		
		}

	}

}
