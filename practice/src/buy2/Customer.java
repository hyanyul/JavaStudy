package buy2;

import java.util.*;

public class Customer {
	
	int id;
	String name;
	int age;
	ArrayList<Product> cart;
	
	Customer(int id, String name, int age, ArrayList<Product> cart){	//회원 등록 / 장바구니로 배열 대신 ArrayList 사용
		this.id = id;
		this.name = name;
		this.age = age;
		this.cart = cart;
	}
	
	public void customerInfo() {	//회원 등록 확인
		System.out.printf("[회원등록] '회원 번호: %d, 회원명: %s, 나이: %d세'가 등록되었습니다.\n", id, name, age);
	}
	
	public void addToCart(Product choice, int quantity) {	//장바구니 담기
		if(choice.quantity >= quantity) {
			choice.quantity -= quantity;
			cart.add(new Product(choice.num, choice.name, choice.price, quantity));
			System.out.printf("장바구니에 %s을(를) %d개 담았습니다.\n", choice.name, quantity);
		}else {
			System.out.printf("선택한 물품의 수량이 부족하여 장바구니에 담을 수 없습니다. 현재 %s의 재고는 %d개 입니다.\n", choice.name, choice.quantity);
		}
	}
	
	public void buyCart() {
		int total = 0;
		for(int i=0; i<cart.size(); i++) {
			total += cart.get(i).price * cart.get(i).quantity;
		}
		System.out.printf("%s님이 결제할 총 금액은 %d원입니다.\n", name, total);
	}
	
}
