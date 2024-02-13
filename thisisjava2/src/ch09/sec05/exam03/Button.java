package ch09.sec05.exam03;

public class Button {
	public static interface ClickListener{     //정적 멤버 인터페이스 생성
		void onClick();          //추상메소드
	}
	
	private ClickListener clickListener;      //ClickListener 타입(인터페이스도 자료형)의 필드 선언
	
	public void setClickListener(ClickListener clickListener) {       //세터(값 저장)
		this.clickListener = clickListener;
	}
	
	public void click() {         //인터페이스의 onClick 사용
		this.clickListener.onClick();            //this 사용 안해도 됨(매개변수 하나만 쓰여서 구분할 필요 없음)
	}
}
