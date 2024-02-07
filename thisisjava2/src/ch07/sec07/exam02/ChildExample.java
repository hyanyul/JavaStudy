package ch07.sec07.exam02;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();      //자식 객체 생성
		 
		Parent parent = child;          
		
		parent.method1();      //부모 클래스에 있는 method1 출력
		child.method1(); 
		
		System.out.println("------------------------------");
		
		parent.method2();      //자식 클래스에 있는 method2 출력
		child.method2();
		
		System.out.println("------------------------------");
		
		//parent.method3();    //부모 클래스에 있는 멤버만 접근 가능하므로 출력 불가
		child.method3();
		
		System.out.println(child == parent);
	}
}
