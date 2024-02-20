package book;

import java.util.*;

public class EBookClass extends BookClass{
	private String supperDevices;
	
	EBookClass(){
		
	}
	
	EBookClass(String title, String author, String publisher, int price, String supperDevices){
		super(title, author, publisher, price);
		this.supperDevices = supperDevices;
	}
	
	public String getSupperDevices() {
		return supperDevices;
	}

	public void setSupperDevices(String supperDevices) {
		this.supperDevices = supperDevices;
	}
	
	
	public void deviceInfo(List<BookClass> bookList) {
		super.bookInfo(bookList);
		System.out.printf("호환 기기: %s", supperDevices);
	}
	

	@Override
	public void bookPurchase(List<BookClass> bookList, String purchase) {
		for(int i=0; i<bookList.size(); i++) {
			if((bookList.get(i).getTitle().equals(purchase) || bookList.get(i).getAuthor().equals(purchase)) && bookList.get(i) instanceof EBookClass) {
				deviceInfo(bookList);
				System.out.printf("'을 구매하였습니다.\n");
			}
		}
	}
}