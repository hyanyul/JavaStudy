package ch03.sec02;

public class ArithmeticOperatorExample {
	public static void main(String[] args) {
		byte v1 = 10;
		byte v2 = 4;
		int v3 = 5;
		long v4 = 10L;
		
		int result1 = v1 + v2;       //+: 이항 연산자      x++: 단항 연산자
		System.out.println("result1: " + result1);
		
		long result2 = v1 + v2 - v4;           //int가 long으로 자동 변환
		System.out.println("result2: " + result2);
		
		double result3 = (double) v1 / v2;        //강제 변환, (double) 위치 v1 or v2 앞 or 둘 다 상관 없음
		System.out.println("result3: " + result3);
		
		int result4 = v1 % v2;
		System.out.println("result4: " + result4);
	}

}
