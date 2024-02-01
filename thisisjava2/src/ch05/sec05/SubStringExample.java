package ch05.sec05;

public class SubStringExample {
	public static void main(String[] args) {
		String ssn = "123456-1234567";
		
		String firstNum = ssn.substring(0,6);    //인덱스 기준으로 자름 /(시작 인덱스, 끝 인덱스(이 앞까지 잘라냄))-범위 나타냄
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
	}

}
