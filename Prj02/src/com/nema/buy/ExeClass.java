package com.nema.buy;

public class ExeClass {
	
	public static void main(String[] args) {
		
		//1. 회원등록	
		CustomerClass c1 = new CustomerClass(001, "이", 24);
		CustomerClass c2 = new CustomerClass(002, "오", 52);
		CustomerClass c3 = new CustomerClass(003, "한성지", 24);
		
		c1.customerInfo();
		c2.customerInfo();
		c3.customerInfo();
		
		System.out.println("\n-----------------------------------------------------------------\n");
		
		
		//2. 상품 등록
		ProductClass p1 = new ProductClass(001, "새우깡", 1000, 100);
		ProductClass p2 = new ProductClass(002, "콜라", 2000, 500);
		ProductClass p3 = new ProductClass(003, "천하장사", 800, 1000);
		ProductClass p4 = new ProductClass(004, "빼빼로", 1500, 800);
		ProductClass p5 = new ProductClass(005, "사이다", 2000, 500);
		
		p1.productInfo();
		p2.productInfo();
		p3.productInfo();
		p4.productInfo();
		p5.productInfo();
		
		
		//3. 상품 구매 - 장바구니에 담기
		c3.addToCart(물건, 수량);
		
		
		//4. 상품 구매 - 결제
		c3.purchase();  //회원 oo 이 ㅁㅁ을 n개 구매했습니다.
	}

}
