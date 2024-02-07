package ch08.sec02;

public class Television implements RemoteControl {  //구현 클래스 생성
	@Override
	public void turnOn() {   //오버라이딩, 메소드 재정의, 추상메소드는 무조건 재정의해야 함
		System.out.println("TV를 켭니다.");
	}
}
