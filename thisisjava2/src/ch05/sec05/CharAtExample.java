package ch05.sec05;

import java.util.Scanner;

public class CharAtExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호를 입력하세요: ");
		String num = sc.nextLine();
		
		//String num = "9506241230123";
		char sex = num.charAt(6);
		
		/*switch(sex) {
			case '1', '3'->System.out.println("남자입니다.");
			case '2', '4'->System.out.println("여자입니다.");
		}*/
		
		if(sex=='2' || sex=='4') {
			System.out.println("여자입니다.");
		}else if(sex=='1' || sex=='3') {
			System.out.println("남자입니다.");
		}
	}

}
