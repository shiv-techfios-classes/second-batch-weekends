package web;

public class HelloWeb {
	

	public static void main(String[] args) {
		
		int x =8;
		
		int y = 5;
		
//		y = 20;
		
		System.out.println("X=" +x);

		System.out.println("Y=" +y);
		
		
		//array indexes starts from 0 to length-1

		
		String[] names = {"david", "ayesha", "bushra", "test"};
		
		String[] duplicates;
		
		duplicates = names;
		
		
		duplicates[0] = "Peter";
		
		
		System.out.println(names[0]);
	
		
		
		
		
		
		//////////////////////////////////////////////////////////////////	
		
		String firstname = "Rizwan";
		
		String secondname = firstname;
		
		
		System.out.println("Initially:" + firstname);
		
		secondname = "naveen";
		
		System.out.println("Afterwards:" + firstname);
	
		
		
	}
	
	

}
