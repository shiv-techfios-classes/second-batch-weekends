package sessionsix.loops;

import java.util.Arrays;

public class CopyingArrays {

	public static void main(String[] args) {
		
		//original array
		int[] numbers = {3, 5, 7,11, 19, 21};
		
		int[] copy;
		
		copy = numbers;
		System.out.println(numbers);
		System.out.println("Before modifying original");
		System.out.println("Copy array:" + Arrays.toString(copy));
		
		numbers[1] = 14;
		
		System.out.println("After modifying original");
		System.out.println("Copy array:" + Arrays.toString(copy));
		
		
		int[] clonedNumbers = numbers.clone();
		
		System.out.println("clonedNumbers:"+ Arrays.toString(clonedNumbers));
		
		numbers[2] = 100;
		
		System.out.println("clonedNumbers:"+ Arrays.toString(clonedNumbers));
		
		System.out.println("Original Array now():"+ Arrays.toString(numbers));
		
		int[] c= new int[numbers.length];
		
		for(int j=0;j<numbers.length; j++) 
			c[j] = numbers[j];
		
		System.out.println("Third Array:C:"+ Arrays.toString(c));

	}

}
