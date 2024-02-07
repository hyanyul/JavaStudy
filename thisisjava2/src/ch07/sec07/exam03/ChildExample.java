package ch07.sec07.exam03;

//field1, method1, 2: 부모  / field2, method3: 자식

public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child();          //부모 타입으로 자동 변환된 parent 객체 생성(자식 객체에서 Parent에게 상속 받은 부분만 사용 가능)
		
		parent.field1 = "data1";  //변경 및 호출 가능
		parent.method1();
		parent.method2();
		
		//parent.field2 = "data2";  //parent는 자식 멤버들에게 접근 권한이 없으므로 변경/호출 불가
		//parent.method3();
		
		Child child = (Child) parent;      //parent를 Child 타입으로 강제 변환
		
		child.field2 = "data2";     //parent가 자식 객체 이용할 수 있게 됨
		child.method3();
		
	}
}
