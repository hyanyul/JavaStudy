package ch06.sec11.exam01;

public class Korean {
	final String nation = "대한민국";   //필드 선언 시 초기값 대입 - final 키워드 붙어서 수정 불가
	final String ssn;         //생성자에서 초기값 대입 - 생성자 통해 초기화 이후 수정 불가
	
	String name;    //final 키워드 없기 때문에 초기화 이후에도 변경 가능
	
	public Korean(String ssn, String name) {   //생성자를 통해 ssn, name 초기화
		this.ssn = ssn;
		this.name = name;
	}
}
