package manage.statics;

public class Test {
	
	double interest=2.0;
	
	static final double rate = 3.9;
	
	static String sentence = "Hereby you";
	
	static void display(String msg) {
		
		double sum = rate+rate;
		System.out.println(msg);
	}
	
	void calculateSquare(int n) {
		System.out.println("Inside calculatesquare()");
		System.out.println(n*n);
		
		display("static from non-static");
	}
	

}
