package com.nema.buy;

public class CustomerClass {
	int id;                  //회원 번호
	String name;             //회원 이름
	int age;                 //회원 나이
	
	ProductClass[] cart;     //장바구니(물품 저장)
	
	
	void customerInfo() {
		System.out.printf("'회원 번호: %d, 회원 이름: %s, 회원 나이: %d세'인 회원 생성\n", id, name, age);
	}
	
	CustomerClass(int id, String name, int age){
		this.id = id;
		this.name = name;
		this.age = age;
		
	}
	
	
	
}
