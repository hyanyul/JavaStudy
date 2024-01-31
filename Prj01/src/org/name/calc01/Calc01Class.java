package org.name.calc01;

//두개의 정수를 입력해서 사칙연산

import java.util.Scanner;

public class Calc01Class {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1. 이름: ");
		String str1 = sc.nextLine();
		
		System.out.print("2. 나이: ");
		//int int2 = sc.nextInt();
		int int2 = Integer.parseInt(sc.nextLine());
		
		//sc.nextLine();
		
		System.out.print("3. 사는 곳: ");
		String str2 = sc.nextLine();
		
		//-----------------------------------------
		
		System.out.println("사칙연산을 시작합니다. 정수 a를 입력하세요: ");
		int a = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("정수 b를 입력하세요: ");
		int b = sc.nextInt();
				
		sc.nextLine();
		
		System.out.println("원하는 사칙연산 하나를 입력하세요.(더하기, 빼기, 곱하기, 나누기):");
		String four = sc.nextLine();
		
		if (four.equals("더하기")) {               // if: 조건이 참일 때 실행됨
			System.out.println("a+b= " + (a+b));
		}else if(four.equals("빼기")) {
			System.out.println("a-b= " + (a-b));
		}else if(four.equals("곱하기")) {
			System.out.println("a×b= " + (a*b));
		}else if(four.equals("나누기")) {
			System.out.println("a÷b= " + (((double)a/b)));
		}else {
			System.out.println("보기 중 하나를 골라주세요.");
			
		}
		
	}

}
