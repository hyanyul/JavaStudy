package ch09.sec05.exam01;

public class A {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	class B{
		void method() {
			field1 = 10;
			method1();
			field2 = 10;
			method2();
		}
	}
	
	static class C{   
		void method() {
			//field1 = 10;    //static 클래스는 객체 생성 없이도 사용 가능해야 하므로 인스턴스 멤버나 메소드 사용 불가, 객체 생성하고 사용 시 가능
			//method1();      
			
			field2 = 10;
			method2();
		}
	}
}	
