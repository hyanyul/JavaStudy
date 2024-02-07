package ch06.sec07.exam02;

public class Car {
	String company = "현대 자동차";       //공통된 데이터는 여기서 초기화
	String model;
	String color;
	int maxSpeed;
	
	Car(){}
	
	Car(String model){
		this.model = model;        //필드와 매개변수 구분위해 this 붙임
	}
	
	Car(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
