package ch08.sec11.exam02;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();    //객체 생성
		
		Bus bus = new Bus();     
		Taxi taxi = new Taxi();
		 
		driver.drive(bus);    //bus는 vehicle의 구현객체이므로 대신 사용 가능(매개변수의 다형성)
		driver.drive(taxi);
	}
}
