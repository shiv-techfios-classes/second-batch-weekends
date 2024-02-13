package exercise.abstraction;

public class ScientficCalculator implements Calculator {

	@Override
	public int add(int a, int b) {
		
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
	
		return a-b;
	}

	@Override
	public int square(int a) {
		
		return a*a;
	}

	@Override
	public double generateRandom() {
		
		return Math.random();
	}


}
