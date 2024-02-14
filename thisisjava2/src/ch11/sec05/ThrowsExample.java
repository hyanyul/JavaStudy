package ch11.sec05;

public class ThrowsExample {
	public static void main(String[] args) {
		try {
			findClass();        //호출한 곳에서 예외 처리
		}catch(ClassNotFoundException e) {
			System.out.println("예외 처리: " + e.toString());
		}
	}
	
	public static void findClass() throws ClassNotFoundException{   //예외 떠넘김
		Class.forName("java.lang.String2");
	}
}
