package properties.collections;

public class GenericDemo<T> {
	
//	String prop;
	
	T prop;
	
	public GenericDemo() {
		
	}
	
	public GenericDemo(T pr) {
		
		this.prop = pr;
		
	}
	
	
	public static void main(String args) {
		
		GenericDemo<Integer> o1 =  new GenericDemo<Integer>();
		
		GenericDemo<Double> o2 =  new GenericDemo<Double>();
		
		GenericDemo<String> o3 =  new GenericDemo<String>();
		
		
	}
	

}
