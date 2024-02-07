package ch07.sec04.exam01;

public class ComputerExample {
	public static void main(String[] args) {
		int r = 10;
		
		Calculator calc = new Calculator(); 
		System.out.println("원 면적: " + calc.areaCircle(r) + "\n");  //부모 클래스의 areaCircle() 실행됨
		
		Computer com = new Computer();        
		System.out.println("원 면적: " + com.areaCircle(r));           //자식 클래스의 areaCircle() 실행됨
	}
}
