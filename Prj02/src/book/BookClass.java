package book;

import java.util.*;

public class BookClass {
	private String title;
	private String author;
	private String publisher;
	private int price;
	private float tax = 1.1f;
	
	
	BookClass(){
		
	}
	
	
	BookClass(String title, String author, String publisher, int price){    //1. 도서 등록-생성자 이용
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}
	
	
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getPublisher() {
		return publisher;
	}


	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public float getTax() {
		return tax;
	}


	public void bookInfo() {     //도서 등록 후 확인 문구 출력
		System.out.printf("'책 제목: %s, 저자명: %s, 출판사: %s, 가격: %d원' 등록\n", title, author, publisher, price);
	}
	
	
	public void bookPurchase(List<BookClass> bookList, String purchase) {
		for(int i=0; i<bookList.size(); i++) {
			System.out.printf("책 이름: %s, 저자명: %s, 출판사:%s, 가격: %d원", bookList.get(i).title, bookList.get(i).author, bookList.get(i).publisher, bookList.get(i).price);
		}
	}
}