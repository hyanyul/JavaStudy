package ch02.sec10;

public class PrimitiveAndStringConversionExample {
	public static void main(String[] args) {                   //String: 문자열, []: 배열, 동일한 타입의 데이터를 연속적으로 저장
		int value1 = Integer.parseInt("10");                    // parseInt와 valueOf 같은 결과 나옴
		Integer value11 = Integer.valueOf("10");                 //변수 타입을 Integer로 선언할 경우 객체로서 선언된 것
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");      //기본 자료형 젤 앞 문자가 대문자일 시 객체로 바뀜(원랜 객체 아님)
		
		System.out.println("value1: " + value1);
		System.out.println("value11: " + value11);
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);
		 
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println("str3: " + str3);
	}

}
