package ch08.sec11.exam02;

public class Taxi implements Vehicle {
	@Override
	public void run() {      //오버라이딩
		System.out.println("택시가 달립니다.");
	}
}
