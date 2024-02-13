package session5.loops;

import java.util.Scanner;

public class ChainingConditions {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");

		int n = sc.nextInt();

		if (n >= 1 && n < 100) {

			System.out.println("Not in Hundreds.");

		} else if (n >= 100 && n < 1000) {

			System.out.println("Not in Thousands");

		} else if (n >= 1000 && n <= 10000) {

			System.out.println("Not in Ten Thousands");

		} else {

			System.out.println("Not within expected ranges.");

			if (n <= 0) {

				System.out.println("Either a zero or a -ve number.");

			} else {

				System.out.println("Bigger than Ten Thousands.");
			}
		}

	}

}
