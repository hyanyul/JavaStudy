package ch04.sec04;

import java.util.Scanner;

public class Calc2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원하는 구구단의 단을 쓰세요: ");     //단 입력
		int input = sc.nextInt();
		
		System.out.println("<<"+ input + "단>>");
		for(int i=1; i<10; i++) {                        //for문을 이용해서 x1~x9까지 작성
			System.out.println(input + "x" + i + "=" + (input*i));
		}
	}

}
