package ch06.sec07.exam01;

public class Korean {
	String nation  = "대한민국";    
	String name;
	String ssn;
	
	public Korean(String n, String s) {    //생성자 오버로딩
		name = n;
		ssn = s;
	}
		
	public Korean() {        //디폴트 생성자
		int n = 100;        //생성자 내에서 지역 변수 사용 가능
		System.out.println("나는 디폴트 생성자입니다. n(지역변수): " + n);
	}
	

}
