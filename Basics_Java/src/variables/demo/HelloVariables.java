package variables.demo;

public class HelloVariables {

	public static void main(String[] args) {
	  //
	  // data-type variable-name = variable-value;
		
		//literals are the values given to variable
		
		int _a1 = 1;
		
		int $b1 = 2;
		
		int c;
		
		c = _a1;
		
		long count = 100;
		
		long total_revenue = 134L;
		
		total_revenue = count;
		
		count = total_revenue;
		
		System.out.println(count);
		
		System.out.println(count+1);
		
		char  dollar = '$';
		char  addition = '@';
		
        boolean uthere = true;
        
        double profit_percentage = 34.5;
        
        float rate_of_interest = 6.5f;
        
        
        profit_percentage = rate_of_interest;
        
        rate_of_interest  = (float)profit_percentage;
        
        
        boolean isEligible = false;
        
        System.out.println("Eligible:" + isEligible);
        
        
        String first_name = "Sumesh";
		
        String last_name = "Bhalla";
        
        String full_name = first_name + " " +last_name + ".";
        
        
        System.out.println(full_name);
        
        
        System.out.println(2+4+5+8+count+profit_percentage+ " HiHello "+" "+2+3+4);
  
        


	}

}
