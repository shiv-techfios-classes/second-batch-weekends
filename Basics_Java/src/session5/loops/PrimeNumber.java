package session5.loops;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to check if it is prime:");
		
		int n = sc.nextInt();
		
		boolean isPrime = true;
		
		for(int i =2; i<n; i++) {
			
			if(n%i==0) {
				isPrime =false;
			}
			
		}
		
		if(isPrime)
			System.out.println(n +" is a Prime Number");
		else
			System.out.println(n +" is not a Prime Number");
		

	}

}
