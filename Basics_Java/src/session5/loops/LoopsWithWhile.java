package session5.loops;

public class LoopsWithWhile {

	public static void main(String[] args) {
		
		//Apart from For loop, we also have while and do-while loops
		// which can be used in Java
		
		//break keyword is used to jump out from the loop.
		/**
		int i = 10;
		while(i<20) {
			
			System.out.println("i=" +i);
			i--;
			
			if(i<= 0)
				break;
			
		}*/
		
		String s1 = "Welcome to USA! YYYYYYYY Enjjoy your stay for a month.";
		
		String s2 = s1.toUpperCase();
		
		int len = s2.length();
		
		System.out.println(len);
		
		int k=0;
		
		//add a check inside while loop to print only first 25 chars. Use break keyword.
		
		while(k<len) {
			
			char temp =s2.charAt(k);
			k++;
			if(temp == 'Y')
			{
				continue;
			}
			System.out.print(temp + " ");
						
			
		}
		
		
		
		
		
		
		
		

	}

}
