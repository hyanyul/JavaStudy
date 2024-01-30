package ch02.sec02;

public class LongExample {
	public static void main(String[] args) {
		long var1=10;
		long var2=20L;
		//long var3=1000000000000;                 //뒤에 L/l 안붙이면 int로 간주, int의 범위 벗어나서 에러뜸
		long var4=1000000000000L;                  //소문자 l도 가능하지만 1과 구별 힘들기 때문에 대문자 L 사용
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}

}
