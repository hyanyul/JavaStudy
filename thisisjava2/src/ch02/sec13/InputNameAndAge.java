package ch02.sec13;

//이름이랑 나이 입력받아서 출력
 
import java.util.Scanner;           //scanner class 가져옴

public class InputNameAndAge {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);     //새로운 Scanner 객체 생성 후 변수 scanner에 대입
		
		System.out.print("이름 입력: ");          //이름 입력란 출력
		String name = scanner.nextLine();       //이름을 입력하도록 함
			
		System.out.print("나이 입력: ");
		String strAge = scanner.nextLine();      //next: 공백 기준으로 잘라버림, 공백 이후의 값은 다음으로 넘어가는듯..?, nextLine: 엔터 기준으로 데이터 입력
		int age = Integer.parseInt(strAge);      //나이를 문자열로 저장한 뒤, 정수 형태로 변환
		
		System.out.printf("이름은 %s이고, 나이는 %d세 입니다.\n\n", name, age);   //  \n 2개 써도 됨
		
		while(true) {
			System.out.print("\n지정한 알파벳을 입력하세요: ");
			String al = scanner.nextLine(); 
			if(al.equals("s")) {          //equals 앞은 변수
				break;
			}
			
		}
		System.out.println("종료");
	}

}
