package methods;

public class MethodOverload {

	public static void main(String[] args) {
		
		MethodOverload obj = new MethodOverload();
	
		double result =obj.sum(1, 9.8);
		
		System.out.println(result);
	}
	
	double sum(int x, double y) {
		
		System.out.println("first");
		
		int p = (int)y;
		double add = sum(x, p);
		return add;
	}
	
	double sum(int x, int y) {
		
		System.out.println("second");
		double sum =sum(x, y, x+y);
		return sum;
	}
	
	double sum(int x, int y, int z) {
		System.out.println("third");
		return x+y+z;
	}
	

}
