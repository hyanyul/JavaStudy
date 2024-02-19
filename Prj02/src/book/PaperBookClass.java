package book;

import java.util.*;

public class PaperBookClass extends BookClass {
	private int size;
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	
	public void sizeInfo() {
		System.out.printf("페이지 수: %s\n", size);
	}
	
	@Override
	public void bookPurchase(List<BookClass> bookList, String purchase) {
		for(int i=0; i<bookList.size(); i++) {
			if(bookList.get(i).getTitle().equals(purchase) || bookList.get(i).getAuthor().equals(purchase)) {
				System.out.printf("\n'책 이름: %s, 저자명: %s, 출판사:%s, 가격: %d원'\n을 구매하셨습니다.", bookList.get(i).getTitle(), bookList.get(i).getAuthor(), bookList.get(i).getPublisher(), (int)(bookList.get(i).getPrice()*getTax()));
			}
		}
	}
}