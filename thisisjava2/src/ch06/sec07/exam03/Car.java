package ch06.sec07.exam03;

public class Car {
	String company = "현대 자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car(String model){           
		this(model, "은색", 250);	             //효율적인 코드 작성을 위해 3개짜리 생성자 호출(겹치는 코드 대체)
	}
	
	Car(String model, String color){
		this(model, color, 250);
	}
	
	Car(String model, String color, int maxSpeed){   
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	
}
