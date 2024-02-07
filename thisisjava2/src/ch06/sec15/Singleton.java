package ch06.sec15;

public class Singleton {
	private static Singleton singleton = new Singleton();    //private 접근 권한을 갖는 정적 필드 선언과 초기화-미리 객체 생성해놓음
	
	private Singleton() {   //private 접근 권한을 갖는 생성자 선언-외부에서의 생성자 호출 차단
	}
	  
	public static Singleton getInstance() {   //public 접근 권한을 갖는 정적 메소드 선언-getter()를 통해 생성한 객체 보내줌
		return singleton;
	}
}
