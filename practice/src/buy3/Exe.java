package buy3;

import java.util.*;

//장바구니 프로그램-키보드로 회원, 상품 등록
public class Exe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Customer> cusList = new ArrayList<>();
		ArrayList<Product> proList = new ArrayList<>();
		
		end : while(true) {
			
			System.out.print("""
					---<메뉴>---
					1. 회원 등록
					2. 상품 등록
					3. 상품 담기
					4. 상품 구매
					5. 종료
					-----------	
					""");
			System.out.print("메뉴를 선택하세요: ");
			int select = sc.nextInt();
			
			switch(select){
				case 1: 
					//1. 회원 등록
					System.out.print("[회원등록] 회원 번호를 입력하세요: ");
					int id = sc.nextInt();
					sc.nextLine();
					System.out.print("[회원등록] 회원명을 입력하세요: ");
					String nameC = sc.nextLine();
					System.out.print("[회원등록] 회원 나이를 입력하세요: ");
					int age = sc.nextInt();
					sc.nextLine();
		
					Customer c = new Customer(id, nameC, age, new ArrayList<>());
					cusList.add(c);
		
					c.customerInfo();
					
					System.out.println();
					
					continue;
					
				case 2:
					//2. 상품 등록
					System.out.print("[상품등록] 상품 번호를 입력하세요: ");
					int num = sc.nextInt();
					sc.nextLine();
					System.out.print("[상품등록] 상품명을 입력하세요: ");
					String nameP = sc.nextLine();
					System.out.print("[상품등록] 가격을 입력하세요: ");
					int price = sc.nextInt();
					System.out.print("[상품등록] 수량을 입력하세요: ");
					int quantity = sc.nextInt();
					sc.nextLine();
					
					Product p = new Product(num, nameP, price, quantity);
					
					p.productInfo();
					proList.add(p);
					
					System.out.println();
					
					continue;
					
				case 3:
					//3. 상품 담기
					System.out.print("회원번호를 입력해주세요: ");
					int input = sc.nextInt();
					sc.nextLine();
					for(int i=0; i<cusList.size(); i++) {
						if(cusList.get(i).id == input) {
							System.out.print("장바구니에 담을 상품명을 입력해주세요: ");
							String choice = sc.nextLine();
							System.out.print("구매할 수량을 입력해주세요: ");
							int quan = sc.nextInt();
							sc.nextLine();
							
							for(int a=0; a<proList.size(); a++) {
								if(choice.equals(proList.get(i).name)){
									cusList.get(i).addToCart(proList.get(a), quan);
								}
							}
						}
					}
					
					continue;
				
				case 4:
					//4. 상품 구매
					System.out.print("회원번호를 입력해주세요: ");
					int in = sc.nextInt();
					sc.nextLine();
					for(int i=0; i<cusList.size(); i++) {
						if(cusList.get(i).id == in) {
							cusList.get(i).buyCart();
						}
					}
					
					continue;
						
				case 5:
					//5. 프로그램 종료
					System.out.println("프로그램을 종료합니다.");
					break end;
			}
		}
	}
}
