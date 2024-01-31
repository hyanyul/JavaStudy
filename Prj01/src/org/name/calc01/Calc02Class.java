package org.name.calc01;

import java.util.Scanner;

public class Calc02Class {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
		
	System.out.print("정수 a를 입력하세요: ");
	int a = sc.nextInt();
	
	System.out.print("정수 b를 입력하세요: ");
	int b = sc.nextInt();
	
	sc.nextLine();
	
	
	System.out.print("연산자를 입력하세요: ");
	char four = sc.next().charAt(0);
	
	if (four=='+') {
		//System.out.println("a+b= "+(a+b));
		System.out.printf("a+b= %d" ,(a+b));
	}else if(four=='-') {
		//System.out.println("a-b= "+(a-b));
		System.out.printf("a-b= %d", (a-b));
	}else if(four=='*') {
		//System.out.println("a*b= "+(a*b));
		System.out.printf("a*b= %d", (a*b));
	}else if(four=='/') {
		System.out.printf("a/b= %.2f", ((double)a/b));
	}else {
		System.out.println("연산자를 입력하세요!(+, -, *, /");			
	}
	}
	}


