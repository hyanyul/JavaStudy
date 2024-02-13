package com.nema.buy_2;

public class CustomerClass {
	int id;                  //회원 번호
	String name;             //회원 이름
	int age;                 //회원 나이
	
	ProductClass[] cart;     //장바구니(물품 저장), 10개짜리 product 배열
	int[] total = new int[10]; 
	
	void customerInfo() {
		System.out.printf("'회원 번호: %d, 회원 이름: %s, 회원 나이: %d세'인 회원 생성\n", id, name, age);
	}
	
	CustomerClass(int id, String name, int age, ProductClass[] cart){
		this.id = id;
		this.name = name;
		this.age = age;
		this.cart = cart;
	}
	
	int purchaseIdx = 0;
	public void addToCart(ProductClass choice, int quantity) {	
		boolean Ok = choice.checkQty(quantity);
		if(!Ok) {          //구입 불가
			System.out.printf("\n수량이 부족합니다. 구입 가능 수량은 %d개 입니다.\n", choice.quantity);
		}else {          //구입 가능
			cart[purchaseIdx] = choice; 
			total[purchaseIdx] = quantity;
			purchaseIdx++;
			choice.quantity -= quantity;
			System.out.printf("\n나이가 %d인 %s이(가) 장바구니에 %d원짜리 %s을(를) %d개 담았습니다.\n", this.age, this.name, choice.price, choice.name, quantity);
		}
	}
	
	public void purchase() {
		int sum = 0;
		for(int i = 0;i<cart.length; i++) {
			if(cart[i]!=null) {
				System.out.printf("\n회원 %s이(가) %s을(를) %d개 구매하였습니다.\n", name, cart[i].name, total[i]);
				sum += cart[i].price*total[i];
			}
		}
		
		System.out.printf("\n계산하실 총 금액은 %d원 입니다.\n", sum);
		
	}
}