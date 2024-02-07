package ch07.sec10.exam01;

public class SmartPhone extends Phone{
	SmartPhone(String owner){   //자식 생성자 생성
		super(owner);   //Phone 생성자 호출(부모 생성자 호출)
	}
	
	void internetSearch() {   //메소드 정의
		System.out.println("인터넷 검색을 합니다.");
	}
}
