package buy;

//장바구니-Scanner 없는 버전
//실행 클래스
public class Exe {

	public static void main(String[] args) {
		Customer c1 = new Customer(24022501, "잠만보", 20, new Product[10]);	//회원1 등록(회원 1에 대한 객체 생성)
		Customer c2 = new Customer(24022502, "메타몽", 15, new Product[10]);	//회원2 등록(회원 2에 대한 객체 생성)
		Customer c3 = new Customer(24022503, "따라큐", 13, new Product[10]);	//회원3 등록(회원 3에 대한 객체 생성)
		
		System.out.println();
		
		Product p1 = new Product(1, "사이다", 1600, 100);		//상품1 등록(상품 1 객체 생성)
		Product p2 = new Product(2, "햇반", 2100, 300);		//상품2 등록(상품 2 객체 생성)
		Product p3 = new Product(3, "포카칩", 1700, 150);		//상품3 등록(상품 3 객체 생성)
		Product p4 = new Product(4, "월드콘", 2200, 120);		//상품4 등록(상품 4 객체 생성)
		Product p5 = new Product(5, "고구마맛 우유", 1700, 50);  //상품5 등록(상품 5 객체 생성)
		
	}

}
