package ch03.sec07;

//아스키코드를 이용해 대문자, 소문자, 숫자를 구분해주는 프로그램

//import java.util

public class LogicalOperatorExample {
	public static void main(String[] args) {
		int charCode = 'A';
		//int charCode = 'a';
		//int charCode = '5';
		
		if ((65<=charCode) & (charCode<=90)) {               //비트 연산자라 좌항 우항 모두 연산함  두개 연산해서 0이 나와야 거짓이므로 둘다 연산 필요
			System.out.println("대문자군요.");
		} else if ((97<=charCode) && (charCode<=122)){       //좌항 연산이 거짓일 경우 결과는 거짓==우항 연산 안함  -> &보다 &&가 더 빠름
			System.out.println("소문자군요.");
		} else if ((48<=charCode) && (charCode<=57)){
			System.out.println("0~9 숫자이군요.");
		}
		
		int value = 6;
		//int value2 = 7;
		
		if ((value%2 == 0)|(value%3)==0) {
			System.out.println("2 또는 3의 배수이군요.");
		}
		
		boolean result = (value%2==0)||(value%3==0);
		if(!result) {
			System.out.println("2 또는 3의 배수가 아니군요.");
		}
	}

}
