package buy;

//장바구니-Scanner 없는 버전
//실행 클래스
public class Exe {

	public static void main(String[] args) {
		
		//1. 회원 등록
		Customer c1 = new Customer(24022501, "잠만보", 20, new Product[10]);	//회원1 등록(회원 1에 대한 객체 생성) / 장바구니 10개로 통일
		Customer c2 = new Customer(24022502, "메타몽", 25, new Product[10]);	//회원2 등록(회원 2에 대한 객체 생성)
		Customer c3 = new Customer(24022503, "따라큐", 23, new Product[10]);	//회원3 등록(회원 3에 대한 객체 생성)
		
		c1.customerInfo();		//회원1 등록 확인 문구 출력
		c2.customerInfo();		//회원2 등록 확인 문구 출력
		c3.customerInfo();		//회원3 등록 확인 문구 출력
		
		System.out.println();	//회원 등록과 상품 등록 출력 한줄 띄우는 역할
		
		//2. 상품 등록
		Product p1 = new Product(1, "사이다", 1600, 100);		//상품1 등록(상품 1 객체 생성)
		Product p2 = new Product(2, "햇반", 2100, 300);		//상품2 등록(상품 2 객체 생성)
		Product p3 = new Product(3, "포카칩", 1700, 150);		//상품3 등록(상품 3 객체 생성)
		Product p4 = new Product(4, "월드콘", 2200, 120);		//상품4 등록(상품 4 객체 생성)
		Product p5 = new Product(5, "고구마맛 우유", 1700, 50);  //상품5 등록(상품 5 객체 생성)
		
		p1.productInfo();		//상품1 등록 확인 문구 출력
		p2.productInfo();		//상품2 등록 확인 문구 출력
		p3.productInfo();		//상품3 등록 확인 문구 출력
		p4.productInfo();		//상품4 등록 확인 문구 출력
		p5.productInfo();		//상품5 등록 확인 문구 출력
		
		System.out.println();	//등록 확인 문구와 장바구니 사이 2줄 띄우기 용도
		System.out.println();
		
		
		//3. 장바구니 담기
		c1.addToCart(p1, 20);	//c1 고객의 장바구니에 p1 20개 담음
		c1.addToCart(p1, 100);	//c1 고객의 장바구니에 p1 100개 담음->재고 부족 및 구매 가능 재고 안내 메시지 출력
		c1.addToCart(p2, 11);	//c1 고객의 장바구니에 p2 11개 담음
		c1.addToCart(p5, 10);	//c1 고객의 장바구니에 p5 10개 담음
		
		System.out.println();
		
		//4. 장바구니에 담긴 상품 구매
		c1.buyCart();	//c1이 구매 시 결제해야 할 총 금액 안내 메시지 출력 메소드 호출
	}
}	
