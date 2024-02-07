package ch06.sec14;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.setSpeed(-50);
		System.out.printf("현재 속도: %d\n", myCar.getSpeed());   //잘못된 속도 변경
		
		myCar.setSpeed(60);
		System.out.printf("현재 속도: %d\n", myCar.getSpeed());   //올바른 속도 변경
		
		if(!myCar.isStop()) {
			myCar.setStop(true);    
		}                                  //멈춤
		
		System.out.printf("현재 속도: %d\n", myCar.getSpeed());
	}
}
