package practice.collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortStocksUtil {

	public static void main(String[] args) {
		
		List<Stock> allStocks =  new LinkedList<>();
		
		allStocks.add(new Stock("wipro", Double.valueOf(600)));
		allStocks.add(new Stock("tcs", Double.valueOf(3400)));
		allStocks.add(new Stock("infosys", Double.valueOf(1500)));
		allStocks.add(new Stock("techM", Double.valueOf(1900)));
		
		System.out.println("- - - - - -  - Before calling sort:" );
		
		displayStocks(allStocks);
		
	//	Collections.sort(allStocks);
		
	//	Collections.sort(allStocks, );
		
		System.out.println("- - - - - - - After calling sort:" );
		
		displayStocks(allStocks);

	}
	
	static void displayStocks(List<Stock> lis) {
		
		for (Stock st: lis) {
			System.out.println(st);
		}
	}

}
