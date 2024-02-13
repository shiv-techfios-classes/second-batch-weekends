package example.reporting;

import java.util.Scanner;

public class LaunchReporting {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the type of report you wish to create:");
		
		String reportType = sc.nextLine();
		
		createReports(reportType.toUpperCase());


	}
	
	static void createReports(String type) {
		
		Report rep = null;
		
		switch(type) {
		
			case "PDF":
				rep = new PDFReports();
				rep.generateReport(type);
				break;
			case "HTML":
				rep = new HTMLReports();
				rep.generateReport(type);
				break;
			default:
				System.out.println("Only PDF and HTML formats are supported in reporting application.");
				break;
				
		}
	}

}
