package ch05.sec05;

public class ReplaceExample {
	public static void main(String[] args) {
		String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
		String newStr = oldStr.replace("자바", "JAVA");     //문자열이 바뀌는 것이 아니라 새로운 객체가 생성되는 것
		
		System.out.println(oldStr);
		System.out.println(newStr);
	}

}
