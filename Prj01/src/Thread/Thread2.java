package Thread;

public class Thread2 extends Thread{        //상속을 통한 스레드 생성

	@Override            //어노테이션
	public void run() {       //run() 메서드 재정의
		System.out.println("Thread run!!!");
	}
	
	public static void main(String[] args) {
		Thread2 tc = new Thread2();
		tc.start();
	}

	

}
