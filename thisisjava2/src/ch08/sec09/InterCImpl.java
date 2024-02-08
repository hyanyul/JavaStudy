package ch08.sec09;

public class InterCImpl implements InterC {
	@Override   //어노테이션, 생략 가능, 코드 이해하기 좋음
	public void methodA() {
		System.out.println("InterCImpl-methodA() 실행");
	}
	
	@Override
	public void methodB() {
		System.out.println("InterCImpl-methodB() 실행");
	}
	
	@Override
	public void methodC() {
		System.out.println("InterCImpl-methodC() 실행");
	}
}
