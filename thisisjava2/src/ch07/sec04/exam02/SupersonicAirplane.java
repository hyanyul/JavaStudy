package ch07.sec04.exam02;

public class SupersonicAirplane extends Airplane {    //Airplane 클래스 상속
	public static final int NORMAL = 1;      //상수 선언
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;        //필드 정의와 동시에 초기화(초기값으로 NORMAL 상수 사용)
	
	@Override              //오버라이딩 시 정확히 됐는지 체크해주는 역할
	public void fly() {
		if(flyMode == SUPERSONIC) {         //flyMode가 SUPERSONIC 되면 초음속 비행 출력
			System.out.println("초음속 비행합니다.");
		}else {
			super.fly();           //부모 메소드 호출
		}
	}
}
