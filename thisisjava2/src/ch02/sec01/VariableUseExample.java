package ch02.sec01;

public class VariableUseExample {
	public static void main(String[] args) {
		int hour=3;        //hour 변수 선언 및 초기화(동시에 가능)
		int minute=5;        //minute 변수 선언 및 초기화
		System.out.println(hour+"시간"+minute+"분");     //시간 출력
		System.out.println(hour);   //hour 변수 출력
		System.out.println(3);      //3 정수 출력
		System.out.println("3");    //3 문자 출력
		
		int totalMinute=(hour*60)+minute;      //totalMinute 변수 선언 및 초기화(시간과 분 이용해서 총 분 계산
		System.out.println("총"+totalMinute+"분");       //totalMinute 출력
	}

}