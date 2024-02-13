package sessionsix.loops;

import java.util.Scanner;

public class SearchInArray {

	public static void main(String[] args) {
		
		int[] numbers = {2, 22, 4, 33, 56, 87, 90, 100, 102, 110};
		
		int value;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value to search:");
		value = sc.nextInt();
		boolean isFound=false;
		int indexMatch = 0;
		//linear search
		for(int k =0; k<numbers.length; k++) {
			
			if(value==numbers[k]) {
				isFound = true;
				indexMatch = k;
				break;
			} 
		}
		
		if(isFound)
			System.out.println("Value found at index:" + indexMatch);
		else
			System.out.println("Value not found in array");

		System.out.println(numbers[indexMatch]);
	}

}
