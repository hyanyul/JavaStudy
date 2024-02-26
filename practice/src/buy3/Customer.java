package buy3;

import java.util.*;

public class Customer {
	
	int id;
	String name;
	int age;
	ArrayList<Product> cart;
	
	Customer(int id, String name, int age, ArrayList<Product> cart){
		this.id = id;
		this.name = name;
		this.age = age;
		this.cart = cart;
	}
	
	public void customerInfo() {
		System.out.printf("[회원등록] '회원번호: %d, 회원명: %s, 나이: %d세'가 등록되었습니다.", id, name, age);
	}
	
	public void addToCart(Product choice, int quantity) {
		if(choice.quantity >= quantity) {
			choice.quantity -= quantity;
			cart.add(new Product(choice.num, choice.name, choice.price, quantity));
			System.out.printf("%s님이 %s을(를) %d개 담았습니다.\n", name, choice.name, quantity);
		}else {
			System.out.printf("수량이 부족하여 장바구니에 담을 수 없습니다. 현재 구매 가능한 재고는 %d개 입니다.\n", choice.quantity);
		}
	}
	
	public void buyCart() {
		int sum = 0;
		for(int i=0; i<cart.size(); i++) {
			sum += cart.get(i).price * cart.get(i).quantity;
		}
		System.out.printf("결제할 총 금액은 %d원 입니다.\n", sum);
	}
}
