package com.nema.buy;

public class CustomerClass {
	int id;                  //회원 번호
	String name;             //회원 이름
	int age;                 //회원 나이
	
	ProductClass[] cart;     //장바구니(물품 저장), 10개짜리 product 배열
	
	void customerInfo() {
		System.out.printf("'회원 번호: %d, 회원 이름: %s, 회원 나이: %d세'인 회원 생성\n", id, name, age);
	}
	
	CustomerClass(int id, String name, int age, ProductClass[] cart){
		this.id = id;
		this.name = name;
		this.age = age;
		this.cart = cart;
	}
	
	int i = 0;
	public void addToCart(ProductClass choice, int quantity) {	
		if(quantity<=choice.quantity) {
			choice.quantity -= quantity;
			cart[i] = new ProductClass(choice.id, choice.name, choice.price, quantity);
			i++;
			
			System.out.printf("\n장바구니에 %s을(를) %d개 담았습니다.\n", choice.name, quantity);
			
		}else {
			System.out.printf("\n구매 수량이 재고를 초과하여 장바구니에 담을 수 없습니다. 현재 재고는 %d개입니다.\n", choice.quantity);
			
		}
	}
	
	public void purchase() {
		int sum = 0;
		for(int i = 0;i<cart.length; i++) {
			if(cart[i]!=null) {
				System.out.printf("\n회원 %s이(가) %s을(를) %d개 구매하였습니다.\n", name, cart[i].name, cart[i].quantity);
				sum += cart[i].price*cart[i].quantity;
			}
		}
		
		System.out.printf("\n계산하실 총 금액은 %d원 입니다.\n", sum);
		
	}
}