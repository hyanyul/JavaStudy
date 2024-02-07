package ch06.sec10.exam01;

public class Calculator {
	static double pi = 3.14159;         //정적 멤버로 만듦(클래스 멤버로서 만들어짐)
	                                    //정적 멤버 변수는 선언과 동시에 초기화가 원칙임(바로 메모리가 할당되기 때문)
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x-y;
	}
}
