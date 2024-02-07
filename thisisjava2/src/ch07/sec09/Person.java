package ch07.sec09;

public class Person {
	public String name;     //String 타입의 name 변수 선언
	
	public Person(String name) {    //생성자 생성, 매개변수로 name 변수를 가짐
		this.name = name;           //매개값을 받으면 name 필드를 초기화해줌
	}
	 
	public void walk() {            //walk() 함수 정의
		System.out.println("걷습니다.");
	}
}
