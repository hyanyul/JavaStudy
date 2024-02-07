package ch07.sec09;

public class Student extends Person {
	public int studentNo;         //필드 선언
	
	public Student(String name, int studentNo) {      //생성자 생성, 매개변수로 name과 studentNo 사용
		super(name);         //부모 클래스에서 초기화함, 부모 클래스의 생성자에 매개변수가 있으므로 super()를 명시적으로 사용
		this.studentNo = studentNo;    //studentNo 초기화해줌
	}
	
	public void study() {          //함수 정의
		System.out.println("공부를 합니다.");
	}
	
	
}
