package ch07.sec06.exam01;

public class B {
	public void method() {  //A와 같은 패키지이기 때문에 protected 붙은 필드와 메소드 사용 가능
		A a = new A();
		a.field = "value";
		a.method();
	}
}
