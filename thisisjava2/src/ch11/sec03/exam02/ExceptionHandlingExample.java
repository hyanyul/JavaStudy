package ch11.sec03.exam02;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		String[] array = {"100", "1oo"};
		for(int i=0; i<=array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]);
				System.out.printf("array[%d]: %d\n", i, value);
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("배열 인덱스가 초과됨:" + e.getMessage());    //하위 클래스 예외 먼저 작성(실행 시 catch문 위에서 아래로 차례대로 검사 상대 됨->상위 클래스 예외가 위에 있으면 그거 작동됨)
			}catch(Exception e) {
				System.out.println("실행에 문제가 있습니다.");
			}
		}

	}

}
