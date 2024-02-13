package test.access;

public class Horse extends Animal{

	@Override
	String makesSound() {
		String sound = "Horse makes horse sound.";
		System.out.println(sound);
		
		return sound;
	}
	
	void speedUp() {
		
		System.out.println("Horses speeds are very high");
	}

}
