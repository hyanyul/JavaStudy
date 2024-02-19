package book;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class BookMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<BookClass> bookList = new ArrayList<>();
		BookMain bM = new BookMain();
		
		System.out.println("도서 관리 프로그램을 시작합니다.\n");
		
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while(true) {
			
			System.out.println("""        
					\n****메뉴****
					1. 도서 등록
					2. 도서 검색
					3. 도서 삭제
					4. 도서 확인
					5. 도서 구입
					0. 종료\n
					""");
			
			
			System.out.print("메뉴를 선택해주세요: ");
			
			int select = sc.nextInt();
			sc.nextLine();
			
			if(select == 1) {         //도서 등록
				System.out.print("\n책 제목을 입력해주세요: ");
				String title = sc.nextLine();
				System.out.print("저자명을 입력해주세요: ");
				String author = sc.nextLine();
				System.out.print("출판사를 입력해주세요: ");
				String publisher = sc.nextLine();
				System.out.print("가격을 입력해주세요: ");
				int price = sc.nextInt();
				sc.nextLine();
				
			
				BookClass bC = new BookClass(title, author, publisher, price);
				bookList.add(bC);
				bC.bookInfo();
			
			} else if(select == 2) {      //도서 검색
				System.out.print("\n찾고자 하는 도서명 또는 저자명을 입력해주세요: ");
				String search = sc.nextLine();
				bM.bookSearch(bookList, search);
				
			} else if(select == 3) {         //도서 삭제
				System.out.print("\n삭제하고자 하는 도서명 또는 저자명을 입력해주세요: ");
				String delete = sc.nextLine();
				bM.bookDelete(bookList, delete);
			
			} else if(select == 4) {     //도서 전체 목록 확인
				bM.bookCheck(bookList);
			
			} else if(select == 5) {   //도서 구매
				System.out.print("\n구매할 도서명 또는 저자명을 입력해주세요: ");
				String purchase = sc.nextLine();
			
				bookPurchase bP = new bookPurchase();
				System.out.print("\n구매할 책의 유형을 선택해주세요(종이책, 전자책(전자책 10% 할인): ");
				String type = sc.nextLine();
				
				if(type.equals("종이책")) {
					bP.bookClass = new PaperBookClass();
					bP.pur(bookList, purchase);
					
				}else if(type.equals("전자책")) {
					bP.bookClass = new EBookClass();
					bP.pur(bookList, purchase);
					
				}
				
			} else if(select == 0) {       //프로그램 종료
				System.out.println("\n\n도서 관리 프로그램을 종료합니다.");
				break;
			
			} else {
				System.out.println("\n0~5번 중에서 골라주세요.");
	
			}
		}
	}
	
	
	public void bookSearch(List<BookClass> bookList, String search) {   //2. 도서 검색-이름이나 작가로 검색
		System.out.println("확인");
		for(int i=0; i<bookList.size(); i++) {
			if(bookList.get(i).getTitle().equals(search) || bookList.get(i).getAuthor().equals(search)) {
				System.out.printf("책 제목: %s, 저자: %s, 출판사: %s, 가격: %d원\n", bookList.get(i).getTitle(), bookList.get(i).getAuthor(), bookList.get(i).getPublisher(), bookList.get(i).getPrice());
			}
		}
	}
	
	
	public void bookDelete(List<BookClass> bookList, String delete) {   //3. 도서 삭제
		for(int i=0; i<bookList.size(); i++) {
			if(bookList.get(i).getTitle().equals(delete) || bookList.get(i).getAuthor().equals(delete)) {
				bookList.remove(i);
				System.out.println("선택하신 책을 삭제하였습니다.");
				i--;
			}
		}
	}
	
	
	public void bookCheck(List<BookClass> bookList) {       //4. 도서 확인-도서 전체 출력
		if(bookList.size() == 0) {
			System.out.println("등록된 책이 없습니다.");
		}else{
			for(int i=0; i<bookList.size(); i++) {
			System.out.printf("%d. 책 이름: %s, 저자명: %s, 출판사:%s, 가격: %d원\n", i+1, bookList.get(i).getTitle(), bookList.get(i).getAuthor(), bookList.get(i).getPublisher(), bookList.get(i).getPrice());
			}
		}
	}
}