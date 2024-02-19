package book;

import java.util.List;

public class bookPurchase {
	public BookClass bookClass;
	
	public void pur(List<BookClass> bookList, String purchase) {
		bookClass.bookPurchase(bookList, purchase);
	}
}
