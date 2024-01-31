package ch03.sec05;

public class InfinityAndNaNCheckExample {
	public static void main(String[] args) {
		int x = 5;
		double y = 0.0;
		double z = x / y;      //출력 시 Infitity 뜸
		double zz = x % y;     //출력 시 NaN 뜸
		
		System.out.println(zz + 2); 
		
		if(Double.isInfinite(zz)||Double.isNaN(zz)) {
			System.out.println("값 산출 불가");
		} else {
			System.out.println(zz + 2);
		}
	}

}
