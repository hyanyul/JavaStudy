package ch06.sec05.exam01;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();        //생성자 통해 myCar 객체 생성
		  
		System.out.println("모델명: " + myCar.model);         //생성한 객체의 변수에 저장된 값 출력->초기화하지 않았기 때문에 자동으로 초기화됨 / 모델명(string): null
		System.out.println("시동 여부: " + myCar.start);       //start(boolean): false
		System.out.println("현재 속도: " + myCar.speed);       //speed(int): 0
		}
}

