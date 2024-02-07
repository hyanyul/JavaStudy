package ch07.sec02;

public class SmartPhone extends Phone {    //phone 클래스 상속-phone 클래스의 필드, 메소드 사용 가능
	public boolean wifi;
	
	public SmartPhone(String model, String color) {   //상속받은 필드 사용
		this.model = model;
		this.color = color;
	}
	
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태를 변경했습니다.");
	}
	
	public void internet() {
		System.out.println("인터넷에 연결합니다.");
	}
	
	SmartPhone(){
		System.out.println("나는 SmartPhone(자식)의 디폴트 생성자입니다.");       //디폴트 생성자 만듦
	}
}
