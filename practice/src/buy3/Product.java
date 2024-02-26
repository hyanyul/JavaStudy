package buy3;

public class Product {
	
	int num;
	String name;
	int price;
	int quantity;
	
	Product(int num, String name, int price, int quantity){
		this.num = num;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void productInfo() {
		System.out.printf("[상품등록] '상품번호: %d, 상품명: %s, 가격: %d원, 수량: %d개'를 등록하였습니다.", num, name, price, quantity);
	}
	
}
