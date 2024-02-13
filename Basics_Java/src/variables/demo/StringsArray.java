package variables.demo;

public class StringsArray {

	public static void main(String[] args) {
		
		//Java is case-sensitive so cars and Cars are two different variable names for arrays
		
		String[] cars = {"Honda", "Hyundai", "Maruti", "BMW Motors"};
		
		String[] Cars = new String[10];
		
		Cars[0] = "Mahindra";
		
		Cars[1] ="Nissan";
		
		System.out.println(cars.length);
		
		System.out.println(cars[1]);
		
		System.out.println(cars[3]);
		
		
		System.out.println(Cars[5]);
		
		Cars[5] = "Maruti Swift";
		
		System.out.println(Cars[5]);
		
		
		

	}

}
