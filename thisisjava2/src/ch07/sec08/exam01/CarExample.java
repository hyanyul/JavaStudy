package ch07.sec08.exam01;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();      //Car 타입의 myCar 객체 생성
		
		myCar.tire = new Tire();    //myCar 객체 내의 tire 참조 변수가 Tire 객체를 가리키도록 초기화
		myCar.run();                //Tire 객체 내의 run() 함수 사용
		
		myCar.tire = new HankookTire();   //HankookTire 클래스로 자동 변환
		myCar.run();                      //HankookTire에서 오버라이딩한 run() 메소드 실행
		
		myCar.tire = new KumhoTire();     //KumhoTire 클래스로 자동 변환
		myCar.run();                      //KumhoTire에서 오버라이딩한 run() 메소드 실행
		

	}

}
