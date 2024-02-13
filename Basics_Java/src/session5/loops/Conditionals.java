package session5.loops;

import java.util.Scanner;

public class Conditionals {

	public static void main(String[] args) {
	
		int u = 10;
		
		if(u > 10) {
			
			System.out.println("You are bigger.");
			
		} 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		
		u = sc.nextInt();
		
		if(u%2==0) {			
			System.out.println("You entered an even number.");
		}else {
			System.out.println("It was an odd number.");
		}
		
		
	}

}
