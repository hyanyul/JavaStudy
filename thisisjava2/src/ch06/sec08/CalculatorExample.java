package ch06.sec08;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		
		myCalc.powerOn();            //powerOn 실행
		
		int result1 = myCalc.plus(5, 6);      //plus 함수에 출력이 있으므로 result1에 저장 / 매개값 바로 넣을 수 있음
		System.out.println("result1: " + result1);
		
		int x = 10;          //int x, y 초기화
		int y = 4;
		
		double result2 = myCalc.divide(x,  y);          //미리 초기화해놓은 x, y를 매개값으로 넣음 / 매개값을 미리 초기화해놓고 변수로 사용 가능
		System.out.println("result2: " + result2); 
		
		myCalc.powerOff();
	}
}
