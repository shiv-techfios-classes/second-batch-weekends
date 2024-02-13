package sessionsix.loops;

import java.util.Scanner;

public class SwitchExamplePaths {

	public static void main(String[] args) {
		
		String path = "/test";
		
		int id = 2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a path to website:");
		path = sc.nextLine();
		
		if(path.equals("/list")) {
			System.out.println("Enter the id to fetch result:");
			id = sc.nextInt();
		}
		
		switch(path) {
		
		case "/":
			System.out.println("Application root path.");
			break;
		case "/test":
			System.out.println("www.demourl.com/test");
			break;
		case "/list":
			System.out.println("@ /list path");
			switch(id) {
			case 1:
				System.out.println("You cleared the exam. Congrats!");
				break;
			case 2:
				System.out.println("You cleared the exam. Congrats!");
				break;
			case 3:
				System.out.println("You cleared the exam. Congrats!");
				break;
			case 4:
				System.out.println("You cleared the exam. Congrats!");
				break;
			default:
				System.out.println("Only top 4 were listed.");
				break;
			}
			break;
		
		default:
			System.out.println("Enter a valid path value.");
			break;
		
		}

	}

}
