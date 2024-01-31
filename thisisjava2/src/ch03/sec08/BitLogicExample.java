package ch03.sec08;

//비트 논리 연산자

public class BitLogicExample {
	public static void main(String[] args) {
		System.out.println("45 & 25 = " + (45 & 25));            //논리곱
		System.out.println("45 | 25 = " + (45 | 25));            //논리합
		System.out.println("45 ^ 25 = " + (45 ^ 25));            //배타적 논리합
		System.out.println("~45 = " + (~45));                    //논리 부정
		System.out.println("----------");
	     
		byte receiveData = -120;
		
		int unsignedInt1 = receiveData & 255;
		System.out.println(unsignedInt1);
		
		int unsignedInt2 = Byte.toUnsignedInt(receiveData);
		System.out.println(unsignedInt2);
		
		int test = 136;
		byte btest = (byte) test;
		System.out.println(btest);
	}

}
