package org.name.calc05;

//2개의 정수를 입력받는 생성자 만들어서 객체 생성
//그 객체를 통해 메서드 (+ - * /) 생성

public class Calc {
	int a;         //필드 a, b  선언
	int b;
	
	Calc(int a, int b){       
		this.a = a;             //생성자 사용, 멤버 변수와 지역 변수 구분을 위해 this 사용
		this.b = b;             //입력받은 데이터로 멤버변수를 초기화하기 위한 생성자
	}

	//더하기 메소드
	int sum() {               //멤버 변수가 있으므로 지역 변수 별개로 만들 필요 없음, 매개 변수 필요 없음
	//	System.out.printf("%d+%d=%d\n", a, b, a+b); 
		int sum = a+b;
		return sum;        //리턴값을 메인함수에서 사용하는 형태일 땐 리턴값 필요
	}
	
	//빼기 메소드
	void sub() {          //리턴값 없어도 잘 돌아감
		System.out.printf("%d-%d=%d\n", a, b, a-b);
	}
	
	//곱하기 메소드
	void mul() {
		System.out.printf("%d*%d=%d\n", a, b, a*b);
	}
	
	//나누기 메소드
	void div() {
		System.out.printf("%d/%d=%.2f\n", a, b, (double)a/b);
	}
	
	
	
}