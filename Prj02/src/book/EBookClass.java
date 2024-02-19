package book;

import java.util.*;

public class EBookClass extends BookClass{
	private String supperDevices;
	
	public String getSupperDevices() {
		return supperDevices;
	}

	public void setSupperDevices(String supperDevices) {
		this.supperDevices = supperDevices;
	}
	
	
	public void deviceInfo() {
		System.out.printf("호환 기기: %s\n", supperDevices);
	}
	

	@Override
	public void bookPurchase(List<BookClass> bookList, String purchase) {
		for(int i=0; i<bookList.size(); i++) {
			if(bookList.get(i).getTitle().equals(purchase) || bookList.get(i).getAuthor().equals(purchase)) {
				System.out.printf("\n'책 이름: %s, 저자명: %s, 출판사:%s, 가격: %d원'\n을 구매하셨습니다.", bookList.get(i).getTitle(), bookList.get(i).getAuthor(), bookList.get(i).getPublisher(), (int)((bookList.get(i).getPrice()*0.9)*getTax()));
			}
		}
	}
}