package buy;

//상품 클래스
public class Product {
	
	int num;	//상품 번호 필드
	String name;	//상품명 필드
	int price;	//상품 가격 필드
	int quantity;	//상품 수량 필드
	
	Product(int num, String name, int price, int quantity){
		this.num = num;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		
		System.out.printf("[상품 등록] '상품 번호: %d, 상품명: %s, 가격: %d, 수량: %d'가 등록되었습니다.\n", num, name, price, quantity);
	}
}
