package ch08.sec02;

public class RemoteControlExample {    //실행할 메인 함수 있는 클래스
	public static void main(String[] args) {
		RemoteControl rc;       //인터페이스 RemoteControl 타입의 필드 선언
		rc = new Television();  //참조 변수 rc에 Television 타입의 새로운 객체 생성해서 집어넣음, 구현 객체 집어넣음
		rc.turnOn();            //rc에 저장된 Television 객체 안에 있는 오버라이딩된 turnOn() 메소드 호출
		
		rc = new Audio();       //구현 객체 다른 거(Audio) 연결
		rc.turnOn();            
	}
}
