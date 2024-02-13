package methods;

public class A {

	A(){
	
		this(3);
		
		System.out.println("default constructor");
	}
	
	A(int x) {
		
		this(3, 4);
	
		System.out.println("Received:" +x);
		
	}
	
	A(int x, int y) {
		
		System.out.println("x+y="+( x+y));
	}
	
	
	
}
