package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);     //scanner 변수 만듦(우변 주소 들어가있는 참조변수)
		
		System.out.print("x값 입력: ");         
		String strX = scanner.nextLine();             //x값을 이용자가 입력할 수 있게 만듦(문자열로 받음)
		int x = Integer.parseInt(strX);               // 문자열을 정수로 변환
		
		System.out.print("y값 입력: ");
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);
		
		int result = x + y;                    
		System.out.println("x+y: "+result);
		System.out.println();
		
		while(true) {
			System.out.print("입력 문자열: ");
			String data = scanner.nextLine();        
			if(data.equals("q")) {
				break;                              //q 입력 시 중지됨
			}
			System.out.println("출력 문자열: " + data);        
			System.out.println();
		}
	}

}
