package pck.test.ck;

class Car{
	String modelName;        //멤버 변수(필드, 속성)
	String carColor;
	int carYear;
	
}

public class CreateCar {
	public static void main(String[] args){
		Car c1 = new Car();            //객체 생성, 클래스를 쓰기 위해서는 객체가 생성되어야 함, 생성자: 클래스의 이름과 똑같은 이름
	                                  //car 타입의 변수 c1에 car 클래스의 객체를 집어넣어라(변수 선언과 같음)
		Car c2 = new Car();           //객체 무한정 만들 수 있음
		Car c3 = new Car();           //디폴트 생성자 호출
		
		c1.modelName = "테슬라";
		c2.modelName = "벤츠";
		c3.modelName = "람보르기니";
		
		System.out.println(c1.modelName);
		System.out.println(c2.modelName);
		System.out.println(c3.modelName);
		
		System.out.println(c1.carColor);
		System.out.println(c1.carYear);
	}
}
