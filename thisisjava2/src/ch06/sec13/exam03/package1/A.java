package ch06.sec13.exam03.package1;

public class A {
	public int field1; //public: 누구나 접근 가능
	int field2;        //default: 같은 패키지에서만 접근 가능
	private int field3; //private: 같은 클래스에서만 접근 가능
	
	public A() {
		field1 = 1;    
		field2 = 1;
		field3 = 1;
		
		method1();
		method2();
		method3();
	}
	
	public void method1() {
		
	}
	
	void method2() {
		
	}
	
	private void method3() {
		
	}
}
