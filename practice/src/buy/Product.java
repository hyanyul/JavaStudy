package buy;

//상품 클래스
public class Product {
	
	int num;	//상품 번호 필드
	String name;	//상품명 필드
	int price;	//상품 가격 필드
	int quantity;	//상품 수량 필드
	
	Product(int num, String name, int price, int quantity){		//상품 등록용 생성자
		this.num = num;		//생성자 통해 필드 초기화
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void productInfo() {		//상품 등록 시 확인 문구 출력용 메소드
		System.out.printf("[상품 등록] '상품 번호: %d, 상품명: %s, 가격: %d원, 수량: %d개'가 등록되었습니다.\n", num, name, price, quantity);
	}
}
