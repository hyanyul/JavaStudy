package ch06.sec10.exam03;

public class Car {
	int speed;     //인스턴스 필드 선언
	
	void run(){
		System.out.println(speed + "으로 달립니다.");
	}         //인스턴스 메소드 정의
	
	static void simulate() {        //클래스 멤버 메소드(static, 출력 없음, 객체 생성 없이 사용 가능)
		Car myCar = new Car();      //필드는 스택 영역에 저장되며, 스택은 각 클래스마다 생성되기 때문에 simulate()와 main()에서 동일한 이름의 객체명 사용 가능
		myCar.speed = 200;          //생성한 객체에서 speed 변수 가져와서 초기화
		myCar.run();				//생성한 객체에서 run() 메소드 호출
	}
	
	public static void main(String[] args) {      //메인 메소드: 프로그램이 실행되면 가장 먼저 불려감
		simulate();        //같은 클래스에 존재하기 때문에 클래스명 앞에 붙여서 불러올 필요 없음(정적 멤버(static 키워드 붙어있음)-객체 생성 필요 없음)
		 
		Car myCar = new Car();   //인스턴스 멤버를 사용하기 위해서는 객체 생성 필요(myCar 객체 생성함)
		myCar.speed = 60;        //생성한 객체에서 speed 변수 가져와서 데이터 값 대입
		myCar.run();             //생성한 객체에서 run() 메소드 호출
	}
}
