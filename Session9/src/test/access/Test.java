package test.access;

import extending.classes.Base;

public class Test extends Base{

	public static void main(String[] args) {
		
		 Test test = new Test();
		 
		 System.out.println(test.getX());
		 
		 System.out.println(test.getY());
		
	  
		 Animal ae = new Horse();
		 
		 ae.makesSound();
		 
		 ae.eats();
		 
		 Horse ho = new Horse();
		 
		 ho.speedUp();
		 
		 //instanceof operator
		 if(ae instanceof Animal) {
			 System.out.println("An animal object.");
		 }
		 
		 if (ae instanceof Horse) {
			 System.out.println("Horse Object.");
		 } 
		 
		 if(!(ae instanceof Animal))
			 System.out.println("Other animals");
		 
		
		 
		 
		 
		 
	}

}
