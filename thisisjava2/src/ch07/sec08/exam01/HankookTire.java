package ch07.sec08.exam01;

public class HankookTire extends Tire{   //Tire 객체 상속
	@Override
	public void roll() {                 //Tire 클래스의 roll() 오버라이딩
		System.out.println("한국 타이어가 회전합니다.");
	}
}
