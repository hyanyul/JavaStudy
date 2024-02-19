package book;

import java.util.*;

public class BookMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		                                  //메뉴 출력
		System.out.println("""        
				****메뉴****
				1. 도서 등록
				2. 도서 검색
				3. 도서 삭제
				4. 도서 확인
				5. 도서 구입
				0. 도서 구입
				""");
		int select = sc.nextInt();
		sc.nextLine();
		
		System.out.print("책 제목을 입력해주세요: ");     //책 등록
		String title = sc.nextLine();
		System.out.print("저자명을 입력해주세요: ");
		String author = sc.nextLine();
		System.out.print("출판사를 입력해주세요: ");
		String publisher = sc.nextLine();
		System.out.print("가격을 입력해주세요: ");
		int price = sc.nextInt();
		sc.nextLine();
		
		List<BookClass> bookList = new ArrayList<>();
		BookClass bC = new BookClass(title, author, publisher, price);
		bC.bookInfo();
		bookList.add(bC);        //ArrayList에 넣음
		
		bC.bookCheck(bookList);   //도서 전체 출력
		
		
		
	}

}
