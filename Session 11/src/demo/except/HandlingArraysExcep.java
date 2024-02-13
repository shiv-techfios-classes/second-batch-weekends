package demo.except;

import java.util.Scanner;

public class HandlingArraysExcep {

	public static void main(String[] args) {
		
		int[] years = {2019, 2024, 2023, 2020,2021};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the index for accessing the element in years:");
		
		int idx  = sc.nextInt();
		
		if(idx <0 || idx >= years.length) {
			System.out.println("Invalid index.");
		} else {
			System.out.println(years[idx]);
		}
		
		
		try {
			
			System.out.println(years[idx]);
			
		} catch(ArrayIndexOutOfBoundsException aie) {
			
			System.out.println("Index exception handled.");
			
		}finally {
			
			System.out.println("finally block.");
		}

	}

}