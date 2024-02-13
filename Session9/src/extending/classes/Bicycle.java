package extending.classes;

/**
 * Base Class for selling bicycles
 * @author shivj
 *
 */
public class Bicycle {
	
	private int gears;
	
	private String brand;
	
	String color;
	
	long sp;
	
	long cp;
	
	public Bicycle() {
		
	}
	
	public Bicycle(int gears, String b) {
		
		this.brand =b;
		this.gears = gears;
		
	}

	public int getGears() {
		return gears;
	}

	public void setGears(int gears) {
		this.gears = gears;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	void applyBrakes() {
		
		System.out.println("Applying brakes from the base class-bicycle");
	}
	
	

}
