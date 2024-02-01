package org.name.calc01;

//계산기 무한반복, 반복은 아무 키, 종료는 q

import java.util.Scanner;

public class Calc03Class {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {

			System.out.print("계산기를 실행합니다.\n정수 a를 입력하세요: ");
			int a = sc.nextInt();
		
			System.out.print("\n정수 b를 입력하세요: ");
			int b = sc.nextInt();
		
			sc.nextLine();
		
			System.out.print("\n실행할 연산자를 입력하세요: ");
			String four = sc.nextLine();
		
			if (four.equals("+")) {
				System.out.println(a + "+" + b + "=" + (a+b));
			} else if (four.equals("-")) {
				System.out.println(a + "-" + b + "=" + (a-b));
			} else if (four.equals("*")) {
				System.out.println(a + "*" + b + "=" + (a*b));
			} else if(four.equals("/")) {
				System.out.println(a + "/" + b + "=" + ((double)a/b));
			} else {
				System.out.println("\n연산자 중 하나를 입력해주세요.");
				
			}
			
			System.out.println("\n계산기를 종료하고 싶다면 'q', 계속하고 싶다면 아무 키를 눌러주세요.");
			String input = sc.nextLine();
			
			if(input.equals("q")) {
				System.out.println("계산기 종료");
				break;
				
			}
		}	
	}	
	

}
