package calc;

import java.util.*;		//java.util 라이브러리에 있는 모든 메소드 사용 가능


//반복되는 계산기 프로그램(프로그램 종료 선택 가능)
public class Calc2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//Scanner 객체 생성(키보드로 값 입력받기 위함)
		
		
		System.out.println("계산기 프로그램을 시작합니다.");
		
		while(true) {		//조건이 false가 되지 않으면 계속 반복되도록 반복문 while 사용
			System.out.print("숫자 a를 입력하세요: ");	
			int a = 0;
			try{
				a = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("정수를 입력해주세요.");
			}
			
			System.out.print("숫자 b를 입력하세요: ");	
			int b = 0;
				try{
					b = sc.nextInt();
				}catch(InputMismatchException e) {
					System.out.println("정수를 입력해주세요.");
					sc.nextLine();
				}
			
				sc.nextLine();
			
				System.out.print("사용할 연산자를 입력해주세요: ");	
				String w = sc.nextLine();	
		
				if(w.equals("+")) {
					plus(a, b);		
				}else if(w.equals("-")) {	
					minus(a, b);	
				}else if(w.equals("*")) {
					multi(a, b);	
				}else if(w.equals("/")) {	
					divide(a, b);	
				}else {
					System.out.println("잘못 입력하셨습니다.");
				}
				
				System.out.print("\n프로그램을 종료하고 싶으시다면 \"q\", 아니면 아무 키를 눌러주세요.");	//종료 관련 안내 멘트 출력
				String end = sc.nextLine();		//종료 관련 변수 입력
				if(end.equals("q")) {	//end(입력한 값)가 q인지 조건문 통해 확인하고 true일 경우 {} 안 내용 실행
					System.out.println("\n계산기 프로그램을 종료합니다.");
					break;	//end가 q일 경우 while문 밖으로 빠져나가서 프로그램 종료됨
				}
		}
	
	}	

		
	public static void plus(int a, int b) {		
		System.out.printf("%d + %d = %d", a, b, a+b);	
	}
	
	public static void minus(int a, int b) {
		System.out.printf("%d - %d = %d", a, b, a-b);
	}
	
	public static void multi(int a, int b) {	
		System.out.printf("%d × %d = %d", a, b, a*b);
	}
	
	public static void divide(int a, int b) {	
		System.out.printf("%d ÷ %d = %.2f", a, b, (double)a/b);
	}
}
