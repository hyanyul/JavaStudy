package com.nema.buy;

public class ProductClass {
	int id;              //상품 번호
	static String name;         //상품명
	int price;           //상품 가격
	int quantity;        //수량
	
	void productInfo(){
		System.out.printf("'상품 번호: %d, 상품명: %s, 상품 가격: %d원, 수량: %d개'인 상품 등록\n", id, name, price, quantity);
		
	}
	
	ProductClass(int id, String name, int price, int quantity){
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
}
