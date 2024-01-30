package ch02.sec04;

public class FloatDoubleExample {
	public static void main(String[] args) {
		float var1 = 0.123456789f;
		double var2 = 0.123456789;
		System.out.println("var1: "+var1);         //+: 연결자 
		System.out.println("var2: "+var2);         // 자료형 다른데 연결 어떻게?-몰루 암튼 보기 좋게 하려면 변수를 문자열로 바꿔서 넣어야 한대...
		
		double var3 = 3e6;
		float var4 = 3e6F;
		double var5 = 2e-3;
		System.out.println("var3: "+var3);
		System.out.println("var4: "+var4);
		System.out.println("var5: "+var5);
	}

}
