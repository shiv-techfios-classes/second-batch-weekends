package methods.demo;

public class CalculateSum {

	public static void main(String[] args) {

      double[] rates =  {2.34, 4.56, 5.5, 6.7, 8.9, 9.9, 11.1};
      
      //For loop in action
      
      double total =0;
      
      for(int j=0; j<= rates.length-1; j++) {
    
    	  System.out.println("j=" + j);
    	  total = total + rates[j];
    	     	  
      }
		
      System.out.println("Total is:" + total);
		
		

	}

}
