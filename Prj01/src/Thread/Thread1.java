package Thread;

public class Thread1 {
	public static void main(String[] args) {
		Thread tc = Thread.currentThread();       //Thread: 클래스 이름, currentThread(): 정적 멤버, 스레드 주소값 얻음
		System.out.println(tc.getName());       //현재 실행 스레드 이름 가져옴  //main
		
		
	}
}
