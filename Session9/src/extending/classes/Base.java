package extending.classes;


/**
 * Four access modifiers are there in Java: default, public, private and protected
 * 
 *
 */

public class Base {

	private int x =1;
	
	int y =2;
	
	protected int z =3;
	
	public int p= 4;
	
	
	void displayInfo() {
		
		System.out.println("Base class");
	
	}
	
	//protected access modifier means default+ child classes
	
	protected int getX() {		
		return x;
	}

	 protected int getY() {
		return y;
	}
}
