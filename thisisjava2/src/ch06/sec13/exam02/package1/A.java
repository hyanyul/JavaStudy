package ch06.sec13.exam02.package1;

public class A {
	A a1 = new A(true);
	A a2 = new A(1);
	A a3 = new A("문자열");
	
	public A(boolean b) {	  //public 키워드: 누구나 접근 가능
	}
	
	A(int b){             //default 접근 제한자: 같은 패키지 내에서만 사용 가능
	}  
	
	private A(String s) {    //private: 같은 클래스 내에서만 사용 가능
	}
}
