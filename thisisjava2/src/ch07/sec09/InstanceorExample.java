package ch07.sec09;

public class InstanceorExample {
	
	public static void personInfo(Person person) {   //함수 정의, 매개변수로 Person 타입의 person 참조 변수를 가짐
		System.out.println("name: " + person.name);  //실행 시 name: + (person에서 초기화된 name), person에 있는 walk() 메소드 실행
		person.walk();
		
		//person이 가리키는 객체가 Student 객체인지 확인
//		if(person instanceof Student) {                              //만약 person이 Student 객체를 가리키고 있다면 / 연산 결과로 true, false만 출력하기 때문에 강제 변환 필요
//			Student student = (Student) person;                      //person 객체를 Student 타입으로 바꾸어라(부모 클래스+오버라이딩 함수 사용 -> 자식 클래스를 모두 사용할 수 있도록 변환)
//			System.out.println("studentNo: " + student.studentNo);   //강제 타입 변환으로 인해 Student에 있는 필드 사용 가능
//			student.study();                                         //Student에 있는 메소드 사용 가능
//		}
		
		if(person instanceof Student student) {      //연산 결과가 true일 경우 우측 타입 변수를 사용할 수 있기 때문에 강제 변환 필요 없음
			System.out.println("studentNo: " + student.studentNo);
			student.study();
		}
	}
	
	public static void main(String[] args) {       //프로그램 실행 시 가장 먼저 호출됨
		Person p1 = new Person("홍길동");        //생성자 통해 객체 생성하고 매개값 넣음
		personInfo(p1);     //p1은 Person 타입이므로 if문 작동 안함     
		
		System.out.println();
		
		Person p2 = new Student("김길동", 10);    
		personInfo(p2);     //p2는 student 타입이므로 if문 작동

	}

}
