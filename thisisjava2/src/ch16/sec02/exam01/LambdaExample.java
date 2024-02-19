package ch16.sec02.exam01;

public class LambdaExample {

	public static void main(String[] args) {
		Person person = new Person();
		
		person.action(()->{        //인터페이스 Workable에 있는 work() 메소드 재정의
			System.out.println("출근을 합니다."); 
			System.out.println("프로그래밍을 합니다.");
		});
		
		person.action(()-> System.out.println("퇴근합니다."));
	}

}
