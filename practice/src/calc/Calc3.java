package calc;

import java.util.*;		//java.util 라이브러리에 있는 모든 메소드 사용 가능


//반복되는 계산기 프로그램(프로그램 종료 선택 가능, 숫자나 연산자 잘못 입력 시 재입력 가능)
public class Calc3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("계산기 프로그램을 시작합니다.");
		
		while(true) {
			System.out.print("숫자 a를 입력하세요: ");	
			int a = 0;
			while(true) {	//a 잘못 입력 시 재입력을 위해 반복문 사용
				try{
					a = sc.nextInt();
					break;
				}catch(InputMismatchException e) {
					System.out.println("정수를 입력해주세요.");	
					sc.nextLine();	//nextInt() 사용 시 입력 스트림에 엔터 남아있어서 무한루프 돌게 됨->엔터 없애서 무한 루프 방지용
				}	
			}
			
			System.out.print("숫자 b를 입력하세요: ");	
			int b = 0;
			while(true) {	//b 잘못 입력 시 재입력을 위한 반복문
				try{
					b = sc.nextInt();
					break;
				}catch(InputMismatchException e) {
					System.out.println("정수를 입력해주세요.");
					sc.nextLine();	//무한 루프 방지
				}
			}
			
			sc.nextLine();	//연산자 입력 넘어가는 거 방지용
			
			System.out.print("사용할 연산자를 입력해주세요: ");	
				
			while(true) {	//연산자 잘못 입력 시 재입력 가능하도록 반복문 사용
				String w = sc.nextLine();
				
				if(w.equals("+")) {
					plus(a, b);		
					break;	//잘 입력했을 때는 break 통해서 반복문 탈출 가능하도록 작성
				}else if(w.equals("-")) {	
					minus(a, b);	
					break;
				}else if(w.equals("*")) {
					multi(a, b);	
					break;
				}else if(w.equals("/")) {	
					divide(a, b);	
					break;
				}else {
					System.out.println("연산자(+, -, *, /) 중 하나를 입력해주세요.");
					//w 입력 시 엔터 사용->입력 스트림에 엔터 없음->sc.nextLine()으로 엔터 없앨 필요 없음
				}
			}
				
			System.out.print("\n프로그램을 종료하고 싶으시다면 \"q\", 아니면 아무 키를 눌러주세요.");
			String end = sc.nextLine();
			if(end.equals("q")) {	
				System.out.println("\n계산기 프로그램을 종료합니다.");
				break;
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
