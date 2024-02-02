package pck.test;

import java.util.Scanner;

public class ArrTest01 {
	public static void arrPrint(int[] a) {        //메소드 만드는 기본 형태, 메소드의 정의, 배열을 입력값으로 받음(배열 선언 부분 작성): 매개변수
		for(int i=0; i<a.length; i++) {
			System.out.printf("a[%d]=%d\n", i, a[i]);
		}
	}
	
	public static void main(String[] args) {
		
		int[] ary = {10, 20, 30, 40, 50};  //배열 선언과 동시에 초기화
		
		for(int i=0; i<ary.length; i++) {
			//System.out.println("ary[" + i + "]= " + ary[i]);
			System.out.printf("ary[%d]=%d\n" , i, ary[i]);
		}
		
		int[] ary1;    //배열 선언, stack 영역에 저장되어 있음
		ary1 = new int[] {50, 60, 70, 80, 90, 100};      //ary1과 새로 만든 객체(heap에 저장) 연결시켜줌. ary1: 참조변수-주소 저장되어 있음
		
		for(int a=0; a<ary1.length; a++) {
			System.out.printf("ary1[%d]=%d\n", a, ary1[a]);    
		}
		
		Scanner sc = new Scanner(System.in);
		
		arrPrint(new int[] {1, 2, 3});      //호출 시 출력을 제외한 함수 머리부분 입력, 입력 부분에 새로운 객체 생성해서 넣어줘야 함
		arrPrint(ary);       //기존에 만들어놓은 객체와 연결 가능(입력 부분에 기존 배열 넣을 수 있음
		
		
	}
}