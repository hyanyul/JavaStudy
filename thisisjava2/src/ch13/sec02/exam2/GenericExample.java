package ch13.sec02.exam2;

public class GenericExample {

	public static void main(String[] args) {
		HomeAgency hA = new HomeAgency();
		Home home = hA.rent();
		home.turnOnLight();
		
		CarAgency cA = new CarAgency();
		Car car = cA.rent();
		car.run();

	}

}
