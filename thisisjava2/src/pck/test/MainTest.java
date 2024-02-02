package pck.test;
 
public class MainTest {       //클래스 사용을 위해서는 객체 있어야 함=객체 만들어야 함       /static: 객체를 생성하지 않더라도 메인 메소드 호출 가능
	public static void main(String[] args) {
		System.out.printf("args: %d\n", args.length);
		
		for(int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		
	}
}
