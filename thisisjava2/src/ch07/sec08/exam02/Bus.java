package ch07.sec08.exam02;

public class Bus extends Vehicle{    //자식 클래스 상속 클래스
	@Override
	public void run() {     //오버라이딩
		System.out.println("버스가 달립니다.");
	}
}
