package ch07.sec10.exam01;

public abstract class Phone {   //추상 클래스
	String owner;     //필드 선언
	
	Phone(String owner){      //부모 생성자 생성
		this.owner = owner;   
	}
	
	void turnOn() {    //메소드 정의
		System.out.println("폰 전원을 켭니다.");
	}
	
	void turnOff() {   //메소드 정의
		System.out.println("폰 전원을 끕니다.");
	}
}
