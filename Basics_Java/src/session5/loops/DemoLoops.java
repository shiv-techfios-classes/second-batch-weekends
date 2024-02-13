package session5.loops;

public class DemoLoops {

	public static void main(String[] args) {
		
		//----------Do-While------------------
	
		int x = 4;
		
		do {
			
			x++;
			
			if(x==7) 
				continue;
			
			System.out.println("Do-While "+x);
			
		}while(x<10);
		
		
		
		//--------------While--------------------
		
		int i=25;
		
		while(i>10) {
			
			if(i%2 ==0) {
				
				System.out.println("While "+i);
				
			}
			
			i--;
			
		}

	}

}
