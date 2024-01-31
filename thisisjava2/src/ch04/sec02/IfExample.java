package ch04.sec02;

import java.util.Scanner;

public class IfExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
		System.out.println("점수를 입력하세요: ");
		int score = sc.nextInt();
		
		if(score>100) {
			System.out.println("0~100 사이의 숫자를 작성해주세요.");
			continue;
		}else if(score >= 90) {
			System.out.println("점수가 90점보다 높습니다.\n등급은 A입니다.");         //else if를 if로 고치면 위의 조건에 부합하더라도 다 실행됨
			//break;
		}else if(score>=80) {
			System.out.println("점수가 80~89점입니다.\n등급은 B입니다.");
			//break;
		}else if(score>=70) {
			System.out.println("점수가 70~79점입니다.\n등급은 C입니다.");
			//break;
		}else if(score>=60) {
			System.out.println("점수가 60~69점입니다.\n등급은 D입니다.");
			//break;
		}else {
			System.out.println("점수가 60점 미만입니다.\n등급은 F이며, 낙제입니다.");
			//break;
		}
	}
	}
}
