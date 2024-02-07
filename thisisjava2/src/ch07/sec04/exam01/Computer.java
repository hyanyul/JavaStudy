package ch07.sec04.exam01;

public class Computer extends Calculator {
	@Override        //생략 가능, 일반적으로 오버라이딩 시 많이 씀
	public double areaCircle(double r) {            //오버라이딩
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * Math.pow(r, 2);            //부모 클래스의 메소드와 함수명이나 매개변수는 다르지 않으나 안의 내용만 다름
	}
}
