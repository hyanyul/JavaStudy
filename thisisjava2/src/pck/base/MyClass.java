package pck.base;

public class MyClass {
	public static void main(String[] args) {
	int a = 10;
	int b = 20;
	double x = 1.2;
	double y = 2.4;
	
	plus(a, b);
	plus(x, y);
	plus(a);
	plus(a, x);    //자동 형변환
	}
	
	public static void plus(int a, int b) 
		int res = a + b;
		System.out.printf("res: %d\n", res);	
	}
	
	public static void plus(double x, double y) {    //메서드 오버로딩(입력값이 달라서 동일한 메서드 사용 가능) - 다형성?
		double res = x + y;
		System.out.printf("res: %f\n", res);
	}
	
	public static void plus(int a) {
		int res = a;
		System.out.printf("res: %d\n", res);	
	}
}