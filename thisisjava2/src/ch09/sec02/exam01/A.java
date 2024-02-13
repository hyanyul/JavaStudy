package ch09.sec02.exam01;

public class A {
	class B{}         //중첩 클래스 (인스턴스 멤버 클래스-객체 생성 필요)
	
	B field = new B();       //객채 생성(B타입의 멤버 변수 field에 B객체 대입)
	
	A(){                   //생성자
		B b = new B();     //지역 변수->생성자 내에서만 사용 가능
		
	}
	
	void method() {       //b 객체 만드는 함수
		B b = new B();
	
	}
}
