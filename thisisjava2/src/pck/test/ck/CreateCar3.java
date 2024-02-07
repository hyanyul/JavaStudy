package pck.test.ck;


//2. 생성자를 이용한 초기화

class Car4{
	String kind = "세단";
	String modelName;
	String carColor;
	int carYear;
	
	Car4(){                 //디폴트 생성자: 입력값이 없는 생성자  //생성자: 출력 없음, 멤버 변수를 초기화하는 역할
		System.out.println("나는 디폴트 생성자입니다.");
	}
	
	Car4(String modelName, String carColor, int carYear){       //디폴트 생성자와 다르게 입력을 하나 갖고 있음
		this.modelName = modelName;    //this: 속성에 있는 kind임을 나타냄
		this.carColor = carColor;
		this.carYear = carYear;
		System.out.println("나는 매개변수 3개를 갖는 생성자입니다.");        //입력값의 개수 혹은 타입이 다르면 생성자 오버로딩 가능
	}
}

public class CreateCar3 {

	public static void main(String[] args) {
		Car4 c = new Car4();           //자동으로 디폴트 생성자가 호출됨
		Car4 c1 = new Car4("마티즈", "검정색", 2023);
		System.out.printf("나의 차 종류는 %s %s이고, 색깔은 %s이고, 연식은 %d년식 입니다.", c1.modelName, c1.kind, c1.carColor, c1.carYear);
	}

}
