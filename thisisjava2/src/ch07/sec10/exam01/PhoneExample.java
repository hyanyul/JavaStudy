package ch07.sec10.exam01;

public class PhoneExample {

	public static void main(String[] args) {
		//Phone phone = new Phone();      //추상 클래스는 객체 생성 불가
		 
		SmartPhone smartPhone = new SmartPhone("홍길동");    //자식 생성자 호출 (->부모 생성자(추상 클래스) 호출->부모 생성자 실행->자식 생성자 실행)
		
		smartPhone.turnOn();   //추상 클래스 Phone을 상속 받았으므로 smartPhone 객체를 통해 Phone의 메소드 접근 및 사용 가능
		smartPhone.internetSearch();
		smartPhone.turnOff();

	}

}
