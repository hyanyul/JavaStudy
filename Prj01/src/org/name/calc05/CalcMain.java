package org.name.calc05;

import java.util.Scanner;

public class CalcMain {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 a를 입력하세요: ");
		int a = sc.nextInt();
		
		System.out.print("정수 b를 입력하세요: ");
		int b = sc.nextInt();
	
		Calc calc = new Calc(a, b);         //생성자 호출하면서 매개값으로 a, b 넣어줌
		
		int sumRes = calc.sum();   //도트 연산자를 통해 calc 객체에 있는 sum 함수를 호출
		System.out.printf("%d+%d=%d\n", a, b, sumRes);  

		calc.sub();
		calc.mul();
		calc.div();
	}
}

