package ch07.sec07.exam01;

//자동 타입 변환

class A{
	
}

class B extends A{         //B가 A 상속받음
	
}

class C extends A{         //C가 A 상속 받음
	
}

class D extends B{         //D가 B 상속받음, B가 A를 상속 받았으므로 A도 상속받음
	 
}

class E extends C{         //E가 C 상속받음, C가 A를 상속받았으므로 A도 상속받음
	
}



public class PromotionExample {
	public static void main(String[] args) {
		B b = new B();          //정석: 동일한 타입 객체 생성
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;            //상속 관계에 해당
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
		//B b2 = e;       //상속 관계가 아님
		//C c2 = d;       
		
	}
}
