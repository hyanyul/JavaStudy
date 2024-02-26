package buy2;

import java.util.*;

//장바구니 ver2 - ArrayList 사용
public class Exe {
	public static void main(String[] args) {
		//1. 회원 등록
		Customer c1 = new Customer(24022501, "한지우", 10, new ArrayList<>());		//ArrayList는 길이가 유동적이므로 방 개수 정해놓을 필요 없음
		Customer c2 = new Customer(24022502, "웅이", 15, new ArrayList<>());			//웅이는 늘 밥을 해줬어..
		Customer c3 = new Customer(24022503, "피카츄", 27, new ArrayList<>());
		
		c1.customerInfo();
		c2.customerInfo();
		c3.customerInfo();
		
		System.out.println();
		
		//2. 상품 등록
		Product p1 = new Product(1, "츄파춥스", 300, 1000);
		Product p2 = new Product(2, "삼각김밥", 1100, 50);
		Product p3 = new Product(3, "점보도시락", 8500, 5);
		Product p4 = new Product(4, "밤양갱", 900, 100);
		Product p5 = new Product(5, "초코우유", 1700, 60);
		
		p1.productInfo();
		p2.productInfo();
		p3.productInfo();
		p4.productInfo();
		p5.productInfo();
		
		System.out.println();
		System.out.println();
		
		//3. 장바구니 담기
		c1.addToCart(p3, 2);
		c1.addToCart(p3, 3);
		c1.addToCart(p3, 1);
		c1.addToCart(p5, 10);
		c1.addToCart(p2, 3);
		
		System.out.println();
	
		//4. 장바구니에 담긴 상품 구매
		c1.buyCart();
		c2.buyCart();
	}
}
