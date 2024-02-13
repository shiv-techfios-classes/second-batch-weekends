package exercise.abstraction;

public class Demo {

	public static void main(String[] args) {
		
		Calculator calc = new ScientficCalculator();
		
		double random = calc.generateRandom();
		
		double square = calc.square(13);
		
		System.out.println(random);
		
		System.out.println(square);
		
		I1 ob1 = new OneImpl();
		
		if(ob1 instanceof OneImpl) {
			
			System.out.println("object of oneImpl");
		}		
		
		if(ob1 instanceof I1) {
			
			System.out.println("object of I1");
		}

	}

}
