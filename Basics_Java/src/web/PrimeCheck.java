package web;

import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
				
		System.out.println("Enter a number to determine if it is prime:");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
	
		int i=2;
		boolean isPrime = true;
		while(i<n) {
			
			if(n%i==0) {
				isPrime = false;
			}
			i++;
		}
		
		if(isPrime)
			System.out.println(n +" is a prime number");
		else
			System.out.println(n+" is not a prime number");
		
		sc.close();

	}

}
