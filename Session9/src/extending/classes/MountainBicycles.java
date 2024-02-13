package extending.classes;

//this class is derived class of base class Bicycle

public class MountainBicycles extends Bicycle {

	private int seatElevation;
	
	public MountainBicycles() {
		
	}
	
	public MountainBicycles(String brand, int nogears, int elevation) {
		
		super(nogears, brand);
		
		this.seatElevation = elevation;
	}

	public int getSeatElevation() {
		return seatElevation;
	}

	public void setSeatElevation(int seatElevation) {
		this.seatElevation = seatElevation;
	}
	
	public void stopMountainBicycle() {
		
		super.applyBrakes();
	}
	
}
