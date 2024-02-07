package ch06.sec08.exam2;

public class ComputerExample {
	public static void main(String[] args) {	
		Computer myCom = new Computer();         //객체 생성
		 
		int result1 = myCom.sum(1, 2, 3);        //{1, 2, 3} 배열의 형태로 매개값 전달됨
		System.out.println("result1: " + result1);     //result1=6
		
		int result2 = myCom.sum(1, 2, 3, 4, 5);  
		System.out.println("result2: " + result2);
		
		int[] values = {1, 2, 3, 4, 5};        //배열 선언한 뒤 배열의 이름을 통해 전달
		int result3 = myCom.sum(values);
		System.out.println("result3: " + result3);
		
		int result4 = myCom.sum(new int[] {1, 2, 3, 4, 5});       //새로운 배열 생성
		System.out.println("result4: " + result4); 
		
		
	}
}
