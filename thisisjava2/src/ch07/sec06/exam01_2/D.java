package ch07.sec06.exam01_2;

import ch07.sec06.exam01.A;

public class D extends A {
	public D() {
		super();       //부모 생성자 호출
	}
	
	public void method1() {
		this.field = "value";       //A 클래스를 상속받았기 때문에 필드값 변경 가능, this를 이용해 자신의 객체에 접근해서 변경하는 것이기 때문에 가능
		this.method();              //A 클래스를 상속받았기 때문에 메소드 호출 가능
	}                               //this: 객체 자신을 가리키는 레퍼런스 변수, 자신의 객체에 접근할 때 사용(주로 멤버변수와 매개변수의 이름이 동일할 때 구분을 위해 사용)
		
//	public void method2() {         //상속 받았다 하더라도 직접 객체를 생성해서 사용하는 건 불가
//		A a = new A();
//		a.field = "value";
//		a.method();
//	}
	}