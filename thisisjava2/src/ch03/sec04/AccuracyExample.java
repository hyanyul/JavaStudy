package ch03.sec04;

public class AccuracyExample {
	public static void main(String[] args) {
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		
		double result = apple - number*pieceUnit;
		System.out.println("사과 1개에서 남은 양: " + result);
		System.out.printf("사과 1개에서 남은 양: %.1f\n", result);   //소수점 1자리까지 나옴
		
	}

}
