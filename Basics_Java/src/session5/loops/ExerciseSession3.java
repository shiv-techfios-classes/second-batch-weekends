package session5.loops;

import java.util.Scanner;

public class ExerciseSession3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a string:");
		
		String userinput = sc.nextLine();
		
		String formattedInput = userinput.toUpperCase();
		
		System.out.println(formattedInput);
		
		System.out.println(userinput.length());
		
		String replacedInput = formattedInput.replace('O', 'Z');
		
		System.out.println(replacedInput);
		
		int len = replacedInput.length();
		
		System.out.println(replacedInput.charAt(len-1));
		
		System.out.println(userinput.concat(" test"));

	}

}
