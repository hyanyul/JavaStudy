package ch06.sec07.exam02;

public class CarExample {

	public static void main(String[] args) {
		Car car1 = new Car();          //객체 생성, 디폴트 생성자 호출
		System.out.println("car1.company: " + car1.company + "\n");       //company의 경우 car 클래스에서 초기화해놓았기 때문에 디폴트 생성자를 호출해도 데이터 출력됨
		
		Car car2 = new Car("자가용");   //매개변수 1개짜리 생성자 호출
		System.out.println("car2.company: "+ car2.company);
		System.out.println("car2.model: " + car2.model + "\n");
		
		Car car3 = new Car("자가용", "빨강");       //2개짜리 호출
		System.out.println("car3.company: "+ car3.company);
		System.out.println("car3.model: " + car3.model);
		System.out.println("car3.color: " + car3.color + "\n");
		
		Car car4 = new Car("택시", "검정", 200);      //3개짜리 호출
		System.out.println("car4.company: "+ car4.company);
		System.out.println("car4.model: " + car4.model);
		System.out.println("car4.color: " + car4.color);
		System.out.println("car4.maxSpeed: " + car4.maxSpeed);
	}

}
