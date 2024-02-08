package ch08.sec05;

import ch08.sec04.Television;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc;
		
		rc = (RemoteControl) new Television();
		rc.turnOn();
		rc.setVolume(5);
		
		rc.setMute(true);
		rc.setMute(false);
	}
}
