package ch08.sec13;

public class SealedExample {

	public static void main(String[] args) {
		Impl impl = new Impl();
		
		InterA ia = impl;
		ia.methodA();
		
		System.out.println();
		
		InterB ib = impl;
		ib.methodA();
		ib.methodB();
		
		System.out.println();
		
		InterC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();

	}

}
