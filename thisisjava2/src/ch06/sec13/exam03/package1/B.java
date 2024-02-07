package ch06.sec13.exam03.package1;

public class B {
	public void method() {     //메소드 정의이므로 출력 적어줘야 함
		A a = new A();
		
		a.field1 = 1;
		a.field2 = 1;
		//a.field3 = 1;    //private 접근 제한자에 의해 같은 클래스에서만 접근 가능하므로 에러 뜸
		 
		a.method1();
		a.method2();
		//a.method3();
	}
	
}
