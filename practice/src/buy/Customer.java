package buy;

//고객 클래스
public class Customer {
	
	int id;		//회원 번호 필드
	String name;	//회원명 필드
	int age;	//회원 나이 필드
	Product cart[];	//회원의 장바구니 필드, 선택하는 상품을 담을 수 있어야 하기 때문에 배열 형태로 선언
	
	Customer(int id, String name, int age, Product cart[]){	//회원 등록용 생성자
		this.id = id;	//생성자 통해 필드 초기화
		this.name = name;
		this.age = age;
		this.cart = cart;
		
		System.out.printf("[회원 등록] '회원 번호: %d, 이름: %s, 나이: %d'가 등록되었습니다.\n", id, name, age);
	}
	
	
}
