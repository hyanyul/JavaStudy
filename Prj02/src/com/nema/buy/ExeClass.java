package com.nema.buy;

import java.util.Scanner;

public class ExeClass {
	
	public static void main(String[] args) {
		
		//1. 회원등록	
		CustomerClass c1 = new CustomerClass(001, "이", 24, new ProductClass[10]);
		CustomerClass c2 = new CustomerClass(002, "오", 52, new ProductClass[10]);
		CustomerClass c3 = new CustomerClass(003, "한성지", 24, new ProductClass[10]);
		
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
		
		Scanner sc = new Scanner(System.in);
		
		//3. 상품 구매 - 장바구니에 담기
		//c3.addToCart(물건, 수량);
		//System.out.print("\n구매할 물품을 입력해주세요: ");
		ProductClass choise;
		
		//System.out.print("\n구매 수량을 입력해주세요: ");
		int quan;
		
		
		c3.addToCart(p1, 16);
		c3.addToCart(p1, 83);
		c3.addToCart(p4, 11);
			
		
		//4. 상품 구매 - 결제, 상품 수량 넘으면 구입 불가+현재 구입할 수 있는 수량 메시지 띄워야 함
		//c3.purchase();  //회원 oo 이 ㅁㅁ을 n개 구매했습니다.
		c3.purchase();
		
	}

}
