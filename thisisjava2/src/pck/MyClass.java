package pck;

public class MyClass {
//클래스 구성 멤버: 멤버 변수 + 멤버 함수 + 생성자

	//================================멤버 변수
	
	String name;
	int age;

	//================================멤버 함수
	
	void printMyClass() {
		System.out.printf("나의 이름: %s, 나의 나이: %d", name, age);   //멤버 변수는 멤버 함수에서 맘대로 사용 가능
	}        //멤버 함수는 멤버 변수를 이용하는 형태가 될 수 밖에 없음(아니면 캡슐화에 위배됨, 외부에서 들어올 수 없어야 함)
	
	
	//================================생성자
	MyClass(String name, int age){
		this.name = name;
		this.age = age;
	}
	
}
