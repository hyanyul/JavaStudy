package ch08.sec05;

public interface RemoteControl {
	int MAX_VOLUME = 10;   //상수 필드
	int MIN_VOLUME = 0;
	
	void turnOn();     //추상메서드: 자식이 재정의해야 함
	void turnOff();
	void setVolume(int volume);
	
	default void setMute(boolean mute) {       //디폴트 메소드-자식이 공통적으로 실행할 동작, 재정의 가능
		if(mute) {
			System.out.println("무음 처리합니다.");
			setVolume(MIN_VOLUME);
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
}
