package Thread;

public class Thread4 implements Runnable {
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Thread start!");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}
		System.out.println(Thread.currentThread().getName() + " Thread stop");
	}

	public static void main(String[] args) {
		for(int i=0; i<10; i++) { 
			Thread thread = new Thread(new Thread4());        //구현 객체를 매개변수로 한 작업 스레드 객체 생성
			
			thread.start();         //스레드 작업 시작
			try {
				thread.join();         //스레드 작업 종료까지 다른 스레드 대기 상태 만듦
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
