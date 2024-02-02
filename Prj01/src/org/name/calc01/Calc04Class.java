package org.name.calc01;

//사칙연산 별개 메소드로 작성

import java.util.Scanner;

public class Calc04Class {
	public static void main(String[] args) {
		int a;       //변수 선언
		int b;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 a를 입력하세요: ");      //정수 a, b 입력란 
		a = sc.nextInt();
		
		System.out.print("정수 b를 입력하세요: ");
		b = sc.nextInt();
		
		sc.nextLine();    //엔터 없애기 용도
		
		while(true) {
		System.out.print("연산자(+, -, *, /)를 입력하세요: ");
		String c = sc.nextLine();      //연산자 입력
		
		if(c.equals("+")) {
			plus(a, b);
			break;
		} else if(c.equals("-")) {
			minus(a, b);
			break;
		} else if(c.equals("*")) {
			multiply(a, b);
			break;
		} else if(c.equals("/")) {
			divide(a, b);
			break;
		}
		}
	}
	
	public static void plus(int a, int b) {       // 더하기 메소드
		System.out.printf("%d + %d = %d", a, b, a+b);	 	
	}
	
	public static void minus(int a, int b) {     //빼기 메소드
		System.out.printf("%d - %d = %d", a, b, a-b);
	}
	
	public static void multiply(int a, int b) {    //곱하기 메소드
		System.out.printf("%d × %d = %d", a, b, a*b);
	}
	
	public static void divide(int a, int b) {      //나누기 메소드
		System.out.printf("%d ÷ %d = %.2f" , a, b, ((double)a/b));
	}
}


