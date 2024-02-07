package ch06.sec07.exam03;

public class CarExample {

	public static void main(String[] args) {
		Car car1 = new Car("자가용");         //1개짜리 생성자 호출-연결되어 있어서 결국 3개짜리 생성자 호출됨(color 출력하면 은색 뜸)
		System.out.println("car1.company: " + car1.company); 
		System.out.println("car1.model: " + car1.model + "\n");        
		
		Car car2 = new Car("자가용", "빨강");
		System.out.println("car2.company: " + car2.company);
		System.out.println("car2.model: " + car2.model);
		System.out.println("car2.color: " + car2.color + "\n");
		
		Car car3 = new Car("택시", "검정", 200);
		System.out.println("car3.company: " + car3.company);
		System.out.println("car3.model: " + car3.model);
		System.out.println("car3.color: " + car3.color);
		System.out.println("car3.maxSpeed: " + car3.maxSpeed);

	}

}
