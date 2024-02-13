package ch09.sec02.exam01;

public class AExample {
	public static void main(String[] args) {
		A a = new A();          //생성자 호출-A 객체 만들어짐
		
		A.B b = a.new B();   //A 객체를 통해 B 접근, B 객체 생성
		
		System.out.println(b.toString());
	}
}
