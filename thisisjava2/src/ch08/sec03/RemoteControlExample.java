package ch08.sec03;



public class RemoteControlExample {
	public static void main(String[] args) {
		System.out.println("리모컨 최대 볼륨: " + RemoteControl.MAX_VOLUME);  //상수는 정적 멤버(인터페이스 멤버)이므로 인터페이스명으로 접근 가능
		System.out.println("리모컨 최저 볼륨: " + RemoteControl.MIN_VOLUME);
		
	}
}
