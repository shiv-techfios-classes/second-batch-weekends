package practice.collections;

import java.util.Comparator;

public class SortByBooksName implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		
		return o1.getBookname().compareTo(o2.getBookname());
	}

}
