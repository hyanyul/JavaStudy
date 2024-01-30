package ch02.sec01;

public class VariableExchangeExample {
	public static void main(String[] args) {         //함수 정의-함수 머리
		int x=3;                                     //함수 몸체
		int y=5;        //변수 x, y 선언 및 초기화 동시 진행
		System.out.println("x: " + x + ", y: " + y);
		
		int temp=x;      //변수 temp에 x값 저장
		x=y;             //변수 x에 y값 저장
		y=temp;          //변수 y에 temp값 저장
		System.out.println("바뀐 값-x: " + x + ", y: " + y);      
	}

}
