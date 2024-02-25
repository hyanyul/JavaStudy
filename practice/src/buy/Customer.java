package buy;

//고객 클래스
public class Customer {
	
	int id;		//회원 번호 필드
	String name;	//회원명 필드
	int age;	//회원 나이 필드
	Product cart[];	//회원의 장바구니 필드, 선택하는 상품을 담을 수 있어야 하기 때문에 배열 형태로 선언->다음 버전에서 ArrayList으로 변경해볼 것
	
	Customer(int id, String name, int age, Product cart[]){	//회원 등록용 생성자
		this.id = id;	//생성자 통해 필드 초기화
		this.name = name;
		this.age = age;
		this.cart = cart;
	}
	
	public void customerInfo() {	//회원 등록 시 확인 문구 출력용 메소드
		System.out.printf("[회원 등록] '회원 번호: %d, 이름: %s, 나이: %d세'가 등록되었습니다.\n", id, name, age);
	}
	
	int i = 0;	//카트 인덱스 선언 및 초기화 역할
	public void addToCart(Product choice, int quantity){	//상품과 개수 입력 시 cart에 담기는 메소드 정의
		if(choice.quantity > quantity) {	//선택 수량이 재고보다 적을 경우에만 cart에 넣을 수 있도록 if 조건문 사용
			choice.quantity -= quantity;	//선택한 상품의 재고에서 선택 수량만큼 빼줌(재고 변경)
			cart[i] = new Product(choice.num, choice.name, choice.price, quantity);	//cart[i]에 재고 바뀐 새로운 Product 객체 생성해서 넣어줌
			i++;	//다음에 장바구니에 담을 때 다음 인덱스로 넘어갈 수 있도록 i에 1 더해줌
			System.out.printf("%s님의 장바구니에 %s %d개가 담겼습니다.\n",name, choice.name, quantity);	//장바구니에 상품에 성공적으로 담겼을 때 출력되는 메시지, 회원 이름과 상품 이름, 선택한 수량이 뜸
		}else {
			System.out.printf("재고가 부족하여 상품을 장바구니에 담을 수 없습니다. 현재 %s의 재고는 %d개 입니다.\n", choice.name,choice.quantity);	//재고가 부족할 때 출력되는 메시지
		}
	}
	
	public void buyCart() {		//상품 구매 메소드
		int total = 0;		//총 금액 구할 때 사용할 변수 선언 및 초기화
		for(int i = 0; i<10; i++) {	//for문 이용해서 총 금액 구함
			if(cart[i] != null) {	//cart[i]에 담긴 값이 null일 경우 nullPointException 뜨므로 방지 위해 조건문 사용
				total += cart[i].quantity * cart[i].price;	//총 금액 구하기 위해 변수에 가격 * 수량 더함
			}else if(cart[i] == null) {	 //메모리 절약을 위해 배열이 null일 때 반복문 빠져나오도록 함
				break;
			
			}
		}
		System.out.printf("결제할 총 금액은 %d원입니다.\n", total);		//결제할 총 금액 안내 메시지 출력
	}
	
}
