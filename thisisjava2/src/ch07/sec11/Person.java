package ch07.sec11;

public sealed class Person permits Employee, Manager{   //봉인된 클래스 생성
	public String name;   //필드 선언
	
	public void work() {  //메소드 정의
		System.out.println("하는 일이 결정되지 않았습니다.");
	}
}
