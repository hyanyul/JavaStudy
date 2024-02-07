package pck.method;

public class MethodTest {
	int num;
	String name;
	
	public static void method1() {     //method1 정의, 출력 없음, 입력 없음, 객체 생성없이 사용 가능
		System.out.println("method1(); 실행, 입력 없음"
				+ "");
	}
	
	public static void method2(int num) {
		System.out.println("나는 입력을 하나 갖는 메소드입니다. num=" + num);
	}
	
	public static int method3(int num) {             //입출력에 객체 올 수 있음
		int n;
		System.out.printf("나는 입력(%d)과 출력(%d)을 가지는 메소드입니다.\n", num, num);
		n = num;
		return n;      //출력이 있는 메서드이기 때문에 return 필요
	}
	
	public static void main(String[] args) {
		method1();        //method1() 메소드 호출 -> 실행
		method2(3);       //실인자 전달 -> 매개변수에 저장해서 사용
		
		int res = method3(1);     //return된 값 res에 저장, 빨리 저장하지 않으면 다음 줄에는 사용하지 못함
		System.out.println("리턴 값: " + res);
	}
}
