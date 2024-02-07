package ch06.sec13.exam03.package2;

import ch06.sec13.exam03.package1.A;

public class C {
	public C() {
		A a = new A();
		
		a.field1 = 1;
		//a.field2 = 1;    //default 접근 제한자에 의해 같은 패키지에서만 접근 가능
		//a.field3 = 1;    
		
		a.method1();
		//a.method2();
		//a.method3();
	}
}
