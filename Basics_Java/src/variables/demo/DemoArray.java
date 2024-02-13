package variables.demo;

public class DemoArray {

	public static void main(String[] args) {
		
		//Array can store multiple values of same data-type in memory
		
		//Array elements are stored in contiguous memory locations
		
		//Array allows index bases access.  ages[0], ages[1]......
		
		//Array indexing starts 0 always and ends at length-1.
		
		int[] ages = new int[5];
		
	//	int[] Ages= new int[100];
		
		ages[0] = 21;
		
		ages[1] = 22;
		
		System.out.println("first Element:" + ages[0]);
		System.out.println("Second element:" + ages[1]);
		
		int[] inline_ages = {10, 15, 20, 25, 50, 70, 80};
		
		System.out.println(inline_ages[6]);
		
//		System.out.println(inline_ages[-5]);
		
		System.out.println("It will not be printed because of Array Out of bounds Exception.");
		
		System.out.println("Size of inline array:" + inline_ages.length);
		
		System.out.println("Size of ages array:" + ages.length);
	
	}

}
