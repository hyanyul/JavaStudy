package ch07.sec05.exam02;

public class SportsCar extends Car {
	
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	@Override
	public void stop() {             //stop()을 final로 선언했기 때문에 오버라이딩 불가
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}
}
