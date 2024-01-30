package ch02.sec13;

import java.util.Scanner;       //class: 사용자 정의 자료형, 다른 사람이 미리 만들어놓은 클래스 들고와서 사용 가능

public class ScannerExample {
	public static void main(String[] args) throw Exception { 
		Scanner scanner = new Scanner(System.in);     //scanner 변수 만듦(우변 주소 들어가있는 참조변수)
		                       
	
		System.out.print("x값 입력: ");         
		String strX = scanner.nextLine();             //x값을 이용자가 입력할 수 있게 만듦(문자열로 받음)
		int x = Integer.parseInt(strX);    // 문자열을 정수로 변환
		
		System.out.print("y값 입력: ");
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);
		
		int result = x + y;                    
		System.out.println("x+y: "+result);
		System.out.println();
		
		while(true) {         //반복문(무한 반복)
			System.out.print("입력 문자열: ");
			String data = scanner.nextLine();        
			if(data.equals("q")) {         
				break;                              //q 입력 시 중지됨
			}
			System.out.println("출력 문자열: " + data);        
			System.out.println();
		}
		System.out.println("종료");
	}


}