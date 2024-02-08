package ch08.sec11.exam02;

public class Bus implements Vehicle{    //Vehicle 인터페이스의 구현 객체
	
	@Override
	public void run() {      //오버라이딩, 추상 메소드는 오버라이딩이 필수
		System.out.println("버스가 달립니다.");
	}
}
