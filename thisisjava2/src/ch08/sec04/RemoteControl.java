package ch08.sec04;

public interface RemoteControl {  //인터페이스 생성
	int MAX_VOLUME = 10;    //상수 필드 선언
	int MIN_VOLUME = 0;
	
	void turnOn();    //추상 메소드 정의
	void turnOff();
	void setVolume(int volume);
}
