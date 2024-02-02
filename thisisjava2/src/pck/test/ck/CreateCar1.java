package pck.test.ck;

class Car2 {
	String modelName = "테슬라";
	String carColor = "노란색";
	int carYear = 2050;            //이렇게 초기화하면 안됨(모든 생성된 값이 공통된 값을 가질 때는 괜춘)
	String kind = "세단";
}

public class CreateCar1 {
	public static void main(String[] args) {
		Car2 c = new Car2();
		Car2 c1 = new Car2();
		
		System.out.println(c.modelName);
		System.out.println(c.carYear);
		System.out.println(c1.modelName);     
		System.out.println(c.kind);
	}
}
