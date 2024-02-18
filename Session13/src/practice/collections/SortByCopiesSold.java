package practice.collections;

import java.util.Comparator;

public class SortByCopiesSold implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		
		return o2.getCopiesSold().compareTo(o1.getCopiesSold());
	}

}
