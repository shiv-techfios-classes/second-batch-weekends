package sessionsix.loops;

public class WeeksExample {

	public static void main(String[] args) {		
		int day=5;		
		switch(day) {		
		case 1:
			System.out.println("Mondays are fun.");
			break;
		case 2:
			System.out.println("Tuesdays are tiring.");
			break;
		case 3:
			System.out.println("Wednesdays are fulfilling.");
			break;
		case 4:
			System.out.println("Thursdays are normal.");
			break;
		case 5:
			System.out.println("Friday is TGIF.");
		case 6:
		case 7:
			System.out.println("Aha! It's the weekend finally.");
			break;
		default:
			System.out.println("Not a valid day.");
			break;
		
		}

	}

}
