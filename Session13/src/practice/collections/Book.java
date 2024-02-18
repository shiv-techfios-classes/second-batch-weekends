package practice.collections;

public class Book {	
	
		private String bookname;
		
		private String isbn;
		
		private Double price;
		
		private Integer copiesSold;
		
		public Book() {
			
		}

		public Book(String bookname, String isbn, Double price, Integer copiesSold) {
			super();
			this.bookname = bookname;
			this.isbn = isbn;
			this.price = price;
			this.copiesSold = copiesSold;
		}

		public String getBookname() {
			return bookname;
		}

		public void setBookname(String bookname) {
			this.bookname = bookname;
		}

		public String getIsbn() {
			return isbn;
		}

		public void setIsbn(String isbn) {
			this.isbn = isbn;
		}

		public Double getPrice() {
			return price;
		}

		public void setPrice(Double price) {
			this.price = price;
		}

		public Integer getCopiesSold() {
			return copiesSold;
		}

		public void setCopiesSold(Integer copiesSold) {
			this.copiesSold = copiesSold;
		}

		@Override
		public String toString() {
			return "Book [bookname=" + bookname + ", isbn=" + isbn + ", price=" + price + ", copiesSold=" + copiesSold
					+ "]";
		}
	

}
