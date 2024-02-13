package exercise.abstraction;

public class HeroMountainBicycles implements MountainBicycles {

	int gears;
	int seatHeight;
	int cadence;
	
	@Override
	public void applyBrakes() {
		System.out.println("Brakes applied.");
	}

	@Override
	public void changeGear(int gearNumber) {
		this.gears = gearNumber;
	}

	@Override
	public void pedalUp(int cadence) {
		this.cadence +=cadence;
	}

	@Override
	public void adjustElevationOfSeat(int hg) {
		this.seatHeight = hg;
	}

}
