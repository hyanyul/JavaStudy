package ch02.sec09;

public class OperationPromotionExample {
	public static void main(String[] args) {
		byte result1 = 10 + 20;       //int보다 작은 타입의 리터럴 연산은 별도의 형변환 발생하지 않음=30은 byte가 담을 수 있는 값이므로 상관 없음
		System.out.println("result1:" + result1);
		//System.out.println(result1.getClass().getName());  //클래스 타입만 알 수 있음 기본타입은 불가
		
		byte v1 = 10;
		byte v2 = 20;		
		int result2 = v1 + v2;
		System.out.println("result2: " + result2);     
		
		byte v3 = 10;
		int v4 = 100;
		long v5 = 1000L;
		long result3 = v3 + v4 + v5;                   //타입 섞여서 연산 시 작은 타입이 큰 타입으로 자동변환되어 계산됨
		System.out.println("result3: " + result3);
		
		char v6 = 'A';
		char v7 = 1;
		int result4 = v6 + v7;
		System.out.println("result4: "+result4);
		System.out.println("result4: "+(char)result4);
		int v8 = 10;
		int result5= v8 / 4;
		System.out.println("result5: "+result5);
		
		int v9 = 10;
		double result6 = v9 / 4.0;
		System.out.println("result6:" + result6);
		int v10 = 1;
		int v11 = 2;
		double result7 = (double) v10/v11;         //연산 시 컴파일러에 의한 자동 변환 안됨=강제 변환 필요
		System.out.println("result7: "+result7);
	}

}
