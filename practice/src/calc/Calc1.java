package calc;

import java.util.*;

public class Calc1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String end = "q";
		
		System.out.println("계산기 프로그램을 시작합니다.");
		
		boolean s = true;
		
		while(true){
			System.out.print("숫자 a를 입력하세요: ");
			int a = 0;
			while(s) {
				try{
					a = sc.nextInt();
					s = false;
				}catch(InputMismatchException e) {
					System.out.println("정수를 입력해주세요.");
					sc.nextLine();
					sc.nextLine();
					continue;
				}
			}
			
			sc.nextLine();
			
			System.out.print("숫자 b를 입력하세요: ");
			int b = 0;
			while(s) {
				try{
					b = sc.nextInt();
					s = false;
				}catch(InputMismatchException e) {
					System.out.println("정수를 입력해주세요.");
					sc.nextLine();
					continue;
				}
			}
			
			sc.nextLine();
			
			do{
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
					s = false;
				}
			}while(!s);
			
			System.out.println("\n프로그램을 종료하고 싶다면 'q'를, 계속 하고싶다면 아무 버튼을 눌러주세요.");
			end = sc.nextLine();
			
			if(end.equals("q")) {
				System.out.println("계산기 프로그램이 종료되었습니다.");
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
