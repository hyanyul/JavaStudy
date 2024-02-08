package ch08.sec09;

public class ExtendsExample {

	public static void main(String[] args) {
		InterCImpl impl = new InterCImpl();
		
		InterA ia = impl;
		ia.methodA();
		System.out.println();
		
		InterB ib = impl;
		ib.methodB();
		System.out.println();
		
		InterC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
