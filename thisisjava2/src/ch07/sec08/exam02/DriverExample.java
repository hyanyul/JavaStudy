package ch07.sec08.exam02;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();         //Driver 타입의 driver 객체 생성
		
		Bus bus = new Bus();    //Bus 타입의 bus 객체 생성
		driver.drive(bus);      //drive() 메서드는 vehicle 객체 타입을 매개변수로 갖지만, 자식 클래스인 bus, taxi도 가능
		
		Taxi taxi = new Taxi();
		driver.drive(taxi);

	}

}
