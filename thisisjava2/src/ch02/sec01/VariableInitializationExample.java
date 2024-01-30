package ch02.sec01;

public class VariableInitializationExample {
	public static void main(String[] args) {
		int value;               //value 변수 선언
		int result=value+10;           //value 변수에 저장된 값과 10을 더해서 result라는 변수에 집어넣음
		System.out.println(result);     //변수 result 출력
	//value 변수에 저장된 값이 없어서 에러 뜸(초기화 필요)
	}
}