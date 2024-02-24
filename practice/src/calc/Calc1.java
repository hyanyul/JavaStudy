package calc;

import java.util.*;		//java.util 라이브러리에 있는 모든 메소드 사용 가능


//반복되지 않는 단순한 계산기 프로그램
public class Calc1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//Scanner 객체 생성(키보드로 값 입력받기 위함)
		
		
		System.out.println("계산기 프로그램을 시작합니다.");		//계산기 프로그램 시작 멘트 출력
		
		System.out.print("숫자 a를 입력하세요: ");		//숫자 a 입력하라는 안내 출력
		int a = 0;	//int 형 a 필드 선언 및 초기화(밑에서 함수 호출할 때 초기화 안돼있으면 오류 발생)
		try{
			a = sc.nextInt();	//try문 안에 있는 a는 지역변수 취급 돼서 밑에서 사용하면 오류 발생함
		}catch(InputMismatchException e) {		//정수 외의 값 입력 시 예외처리로 프로그램 종료됨(종료->재입력으로 업글 필요)
			System.out.println("정수를 입력해주세요.");
		}
			
		System.out.print("숫자 b를 입력하세요: ");		//숫자 b 입력하라는 안내 출력
		int b = 0;	//int형 필드 b 선언 및 초기화
			try{
				b = sc.nextInt();
			}catch(InputMismatchException e) {	//예외 처리
				System.out.println("정수를 입력해주세요.");
				sc.nextLine();
			}
			
		sc.nextLine();	//입력 스트림에 남아있는 엔터 없애는 용도
			
		System.out.print("사용할 연산자를 입력해주세요: ");	//연산자 입력 안내 멘트 출력(+, -, *, / 중 하나 입력)
		String w = sc.nextLine();	//연산자 입력 시 w에 String의 형태로 저장됨
		
		if(w.equals("+")) {		//+입력 시
			plus(a, b);		//plus() 메소드 호출
		}else if(w.equals("-")) {	//- 입력 시
			minus(a, b);	//minus() 메소드 호출
		}else if(w.equals("*")) {	//*입력 시
			multi(a, b);	//multi() 메소드 호출
		}else if(w.equals("/")) {	// /입력 시	
			divide(a, b);	//divide() 메소드 호출
		}else {
			System.out.println("잘못 입력하셨습니다.");	//연산자 외의 값 입력 시 안내 멘트
		}
			
	
	}	

		
	public static void plus(int a, int b) {		//더하기 메소드 정의
		System.out.printf("%d + %d = %d", a, b, a+b);	
	}
	
	public static void minus(int a, int b) {	//빼기 메소드 정의
		System.out.printf("%d - %d = %d", a, b, a-b);
	}
	
	public static void multi(int a, int b) {	//곱하기 메소드 정의
		System.out.printf("%d × %d = %d", a, b, a*b);
	}
	
	public static void divide(int a, int b) {	//나누기 메소드 정의
		System.out.printf("%d ÷ %d = %.2f", a, b, (double)a/b);		//결과값이 소수점 둘째자리까지 나올 수 있도록 처리)
	}
}
