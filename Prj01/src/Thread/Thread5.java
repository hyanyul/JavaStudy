package Thread;

class MyClass {
	private int count;
	
	public synchronized void increment() {
		count++;
	}
	
	public void decrement() {
		synchronized(this) {
			count--;
		}
	}
	
	public void getCount() {
		System.out.println("count: " + count);
	}
}

public class Thread5 {
	public static void main(String[] args) {
		
		MyClass my = new MyClass();
		
		Thread tIn = new Thread(new Runnable() {
			@Override
			public void run(){
				for(int i=0; i<10000; i++) {
					my.increment();
				}
			}
		});
		
		Thread tDe = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0; i<10000; i++) {
					my.decrement();
				}
			}
		});
			my.getCount();
		
			tIn.start();
			tDe.start();
			
			try {
				tIn.join();
				tDe.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
			my.getCount();
		}
		
	
	}