package ch07.sec02;

public class Phone {
	public String model;   //필드 선언
	public String color;
	
	public void bell() {   //메소드 선언
		System.out.println("벨이 울립니다.");   //전화 신호
	}
	
	public void sendVoice(String message) {
		System.out.println("자기: " + message);   //입력받은 메시지 출력
	}
	
	public void receiveVoice(String message) {
		System.out.println("상대방: " + message);    //입력받은 메시지 출력
	}
	
	public void hangUp() {
		System.out.println("전화를 끊습니다.");     //전화 끊음
	}
	
	Phone(){
		System.out.println("나는 Phone(부모)의 디폴트 생성자입니다.");    //디폴트 생성자 만듦
	}
}
