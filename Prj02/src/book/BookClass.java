package book;

import java.util.*;

public class BookClass {
	private String title;
	private String author;
	private String publisher;
	private int price;
	private float tax = 1.1f;
//	private int type;
	
	
	BookClass(){
		
	}
	
	
	BookClass(String title, String author, String publisher, int price){    //1. 도서 등록-생성자 이용
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}
	
	
	public void bookInfo() {     //도서 등록 후 확인 문구 출력
		System.out.printf("'책 제목: %s, 저자명: %s, 출판사: %s, 가격: %d원' 등록\n", title, author, publisher, price);
	}
	
	
	public void bookSearch(List<BookClass> bookList, String search) {   //2. 도서 검색-이름이나 작가로 검색
		System.out.println("확인");
		for(int i=0; i<bookList.size(); i++) {
			if(bookList.get(i).title.equals(search) || bookList.get(i).author.equals(search)) {
				System.out.printf("책 제목: %s, 저자: %s, 출판사: %s, 가격: %d원\n", bookList.get(i).title, bookList.get(i).author, bookList.get(i).publisher, bookList.get(i).price);
			}
		}
	}
	
	
	public void bookDelete(List<BookClass> bookList, String delete) {   //3. 도서 삭제
		for(int i=0; i<bookList.size(); i++) {
			if(bookList.get(i).title.equals(delete) || bookList.get(i).author.equals(delete)) {
				bookList.remove(i);
				System.out.println("선택하신 책을 삭제하였습니다.");
			}
		}
	}
	
	
	public void bookCheck(List<BookClass> bookList) {       //4. 도서 확인-도서 전체 출력
		for(int i=0; i<bookList.size(); i++) {
			System.out.printf("%d. 책 이름: %s, 저자명: %s, 출판사:%s, 가격: %d원\n", i+1, bookList.get(i).title, bookList.get(i).author, bookList.get(i).publisher, bookList.get(i).price);
		}
	}
	
	
	public void bookPurchase(List<BookClass> bookList, String purchase, int type) {    //도서 구매
		for(int i=0; i<bookList.size(); i++) {
			System.out.printf("책 이름: %s, 저자명: %s, 출판사:%s, 가격: %d원", bookList.get(i).title, bookList.get(i).author, bookList.get(i).publisher, bookList.get(i).price);
			if(type == 1) {
				System.out.printf("유형: %s을 선택하였습니다.\n", "종이책");
				
			}else if(type == 2) {
				System.out.printf("유형: %s을 선택하였습니다.\n", "전자책");
			}
		}
	}
	
}
