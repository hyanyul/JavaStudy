package book;

import java.util.*;

public class PaperBookClass extends BookClass {
	private int size;
	
	PaperBookClass(){
		
	}
	
	PaperBookClass(String title, String author, String publisher, int price, int size){
		super(title, author, publisher, price);
		this.size = size;
	}
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	
	public void sizeInfo(List<BookClass> bookList) {
		super.bookInfo(bookList);
		System.out.printf("페이지 수: %sp", size);
	}
	
	
	@Override
	public void bookPurchase(List<BookClass> bookList, String purchase) {
		for(int i=0; i<bookList.size(); i++) {
			if((bookList.get(i).getTitle().equals(purchase) || bookList.get(i).getAuthor().equals(purchase)) && bookList.get(i) instanceof PaperBookClass) {
				sizeInfo(bookList);
				System.out.printf("'을 구매하였습니다.\n");
			}
		}
	}
	
	
	
}