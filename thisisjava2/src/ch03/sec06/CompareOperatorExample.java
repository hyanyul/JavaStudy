package ch03.sec06;

import java.util.Scanner;

public class CompareOperatorExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);
		
		char ch1 = 'A';
	    char ch2 = 'B';
	    boolean result4 = (ch1 < ch2);
	    System.out.println("result4: " + result4);
	    
	    int num3 = 1;
	    double num4 = 1.0;
	    boolean result5 = (num3 == num4);
	    System.out.println("result5: " + result5);           //컴파일러가 자동으로 형변환을 해서 같은 것으로 나옴
	    
	    float num5 = 0.1f;
	    double num6 = 0.1;
	    boolean result6 = (num5 == num6);                      //실수 비교는 정밀도에 의해 값 다르게 나옴(자동으로 형변환되지 않음)
	    boolean result7 = (num5 ==(float)num6);                //동일한 조건으로 비교하게 됨
	    System.out.println("result6: " + result6);
	    System.out.println("result7: " + result7);
	    
	    String str1 = "자바";                //참조변수:주소 저장         기본 자료형 가진 변수: 일반 변수
	    String str2 = "Java";
	    boolean result8 = (str1.equals(str2));
	    boolean result9 = (!str1.equals(str2));
	    System.out.println("result8: " + result8);
	    System.out.println("result9: " + result9);
	    
	    System.out.print("문자열을 입력하세요: ");
	    String input = sc.nextLine();
	    if (input.equals(str1)) {
	    	System.out.println("자바입니다.");
	    } else {
	    	System.out.printf("%s이군요. 제가 원하는 문자열은 아니네요ㅋ", input);
	    }
	}
}
