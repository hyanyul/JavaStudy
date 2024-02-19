package Thread;

public class Thread3 extends Thread {
	
	@Override
	public void run() {
		System.out.println(getName() + " thread Strat!");      
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}
		
		System.out.println(getName() + " thread Stop.");
	}

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			Thread t = new Thread3();
			t.start();
			
			try {
				t.join();        //스레드 생성될 때까지 메인 스레드 대기 상태 만듦, 순서대로 실행되게 함, 생략 시 무작위적으로 실행됨
			} catch (InterruptedException e) {
			
			}
		}
		
	}

}
