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
			e.printStackTrace();
		}
		
		
		int select = 0;
		
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
			
			try {
				select = sc.nextInt();
				sc.nextLine();
			}catch(InputMismatchException e){
				System.out.println("0~5번 중에서 골라주세요.");
				sc.nextLine();
				continue;
			}
			
			if(select == 1) {         //도서 등록
				System.out.print("\n책 제목을 입력하세요: ");
				String title = sc.nextLine();
				System.out.print("저자명을 입력하세요: ");
				String author = sc.nextLine();
				System.out.print("출판사를 입력하세요: ");
				String publisher = sc.nextLine();
				System.out.print("가격을 입력하세요: ");
				int price = sc.nextInt();
				sc.nextLine();
				System.out.print("전자책일 때 호환 기기를 입력해주세요: ");
				String supperDevices = sc.nextLine();
				System.out.print("종이책일 때 책 페이지 수를 입력하세요: ");
				int size = sc.nextInt();
				sc.nextLine();
				
				
				BookClass bC = new BookClass(title, author, publisher, price);
				EBookClass bC_E = new EBookClass(title, author, publisher, price, supperDevices);
				PaperBookClass bC_P = new PaperBookClass(title, author, publisher, price, size);
				bookList.add(bC);
				bookList.add(bC_E);
				bookList.add(bC_P);
				bC_E.deviceInfo(bookList);
				System.out.println("' 등록");
				bC_P.sizeInfo(bookList);
				System.out.println("' 등록");

			
			} else if(select == 2) {      //도서 검색
				System.out.print("\n찾고자 하는 도서명 또는 저자명을 입력해주세요: ");
				String search = sc.nextLine();
				bM.bookSearch(bookList, search);
				
			} else if(select == 3) {         //도서 삭제
				System.out.print("\n삭제하고자 하는 도서명을 입력해주세요: ");
				String delete = sc.nextLine();
				bM.bookDelete(bookList, delete);
			
			} else if(select == 4) {     //도서 전체 목록 확인
				bM.bookCheck(bookList);
			
			} else if(select == 5) {   //도서 구매
				System.out.print("\n구매할 도서명 또는 저자명을 입력해주세요: ");
				String purchase = sc.nextLine();
			
				bookPurchase bP = new bookPurchase();
				System.out.print("\n구매할 책의 유형을 선택해주세요(종이책, 전자책): ");
				String type = sc.nextLine();
				
				if(type.equals("전자책")) {
					bP.bookClass = new EBookClass();
					bP.pur(bookList, purchase);
					
				}else if(type.equals("종이책")) {
					bP.bookClass = new PaperBookClass();
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
		for(int i=0; i<bookList.size(); i++) {
			if((bookList.get(i).getTitle().equals(search) || bookList.get(i).getAuthor().equals(search)) && bookList.get(i) instanceof PaperBookClass) {
				System.out.printf("책 제목: %s, 저자: %s, 출판사: %s, 가격: %d원\n", bookList.get(i).getTitle(), bookList.get(i).getAuthor(), bookList.get(i).getPublisher(), (int)(bookList.get(i).getPrice()*1.1f));
			}
		}
	}
	
	
	public void bookDelete(List<BookClass> bookList, String delete) {   //3. 도서 삭제
	
		for(int i=0; i<bookList.size(); i++) {
			if(bookList.get(i).getTitle().equals(delete)) {
				bookList.remove(i);
				System.out.println("선택하신 책을 삭제하였습니다.");
				i--;
			}else {
				System.out.println("이미 삭제되었거나 등록되지 않은 책입니다.");
			}
		}
	}
	
	
	public void bookCheck(List<BookClass> bookList) {       //4. 도서 확인-도서 전체 출력
		if(bookList.size() == 0) {
			System.out.println("등록된 책이 없습니다.");
		}else{
			for(int i=0; i<bookList.size(); i++) {
				if(bookList.get(i) instanceof PaperBookClass) {
					System.out.printf("책 이름: %s, 저자명: %s, 출판사:%s, 가격: %d원\n", bookList.get(i).getTitle(), bookList.get(i).getAuthor(), bookList.get(i).getPublisher(), bookList.get(i).getPrice());
				}
			}
		}
	}
}