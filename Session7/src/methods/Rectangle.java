package methods;

public class Rectangle {
	
	double length;
	
	double breadth;
	
	public Rectangle() {
		
		
		System.out.println("default constructor");
		
	}
	
	public Rectangle(double len) {
		this();
		this.length =len;
		System.out.println("single parameter constructor.");
	}
	
	public Rectangle(double len, double b) {
		
		this(len);
		this.breadth =b;
		System.out.println("Why I got at the end.");
	}
	
	
	
	
	public static void main(String[] args) {
		
		Rectangle rec = new Rectangle(1,2);
		
		Rectangle r1  = new Rectangle();
	}

}
