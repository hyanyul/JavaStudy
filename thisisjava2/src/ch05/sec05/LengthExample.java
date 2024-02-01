package ch05.sec05;

//주민등록번호 길이 구하고 if문 써서 13자리 맞는지 확인

public class LengthExample {
	public static void main(String[] args) {
		String ssn = "123";
		int len = ssn.length();
		
		if (len==13) {
			System.out.print("주민등록번호 자릿수가 맞습니다.");
		} else {
			System.out.print("주민등록번호 자릿수가 틀립니다.");
		}
	}
}
