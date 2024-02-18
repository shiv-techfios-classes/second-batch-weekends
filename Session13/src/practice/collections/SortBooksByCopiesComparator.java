package practice.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortBooksByCopiesComparator {

	public static void main(String[] args) {
		
		Book b1 = new Book("Ferrari ki Savaari", "2345", 25.4, 143500);
		
		Book b2 = new Book("Origin", "5445", 45.4, 4500);
		
		Book b3 = new Book("Da Vinci Code", "3421", 55.4, 24500);
		
		Book b4 = new Book("DS Using Java", "9870", 85.4, 189500);
		
		List<Book> books = new ArrayList<>();
		
		books.add(b4);
		books.add(b3);
		books.add(b2);
		books.add(b1);
		
		Collections.sort(books, new SortByCopiesSold());
		
		System.out.println(books);
		
		//sort on names of books
		
		Collections.sort(books, new SortByBooksName());
		
		System.out.println(books);
		
		
	}

}
