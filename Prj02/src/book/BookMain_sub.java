package book;

import java.util.*;

public class BookMain_sub {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("""        
				****메뉴****
				1. 도서 등록
				2. 도서 검색
				3. 도서 삭제
				4. 도서 확인
				5. 도서 구입
				0. 도서 구입
				""");
		
		System.out.print("책 제목을 입력해주세요: ");     //책 등록
		String title = sc.nextLine();
		System.out.print("저자명을 입력해주세요: ");
		String author = sc.nextLine();
		System.out.print("출판사를 입력해주세요: ");
		String publisher = sc.nextLine();
		System.out.print("가격을 입력해주세요: ");
		int price = sc.nextInt();
		sc.nextLine();
		

		BookClass bC = new BookClass(title, author, publisher, price);
		List<BookClass> bookList = new ArrayList<>();
		bC.bookInfo();
		bookList.add(bC);
		
		
		System.out.print("검색할 도서명이나 저자명을 입력해주세요: ");     //도서 검색
		String search = sc.nextLine();
		bC.bookSearch(bookList, search);
		
		
		bC.bookCheck(bookList);
		
		
		System.out.print("삭제할 도서명이나 저자명을 입력해주세요: ");     //도서 삭제
		String delete = sc.nextLine();
		bC.bookDelete(bookList, delete);
		
		
		bC.bookCheck(bookList);   //도서 검색
		
		
		System.out.print("구매할 도서명이나 저자명을 입력해주세요: ");     //도서 구매
		String purchase = sc.nextLine();
		System.out.print("종이책을 구매하신다면 '1', 전자책을 구매하신다면 '2'를 눌러주세요: ");
		int type = sc.nextInt();
		sc.nextLine();
		bC.bookPurchase(bookList, purchase, type);
	}

}
