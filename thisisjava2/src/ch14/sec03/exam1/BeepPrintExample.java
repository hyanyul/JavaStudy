package ch14.sec03.exam1;

import java.awt.Toolkit;

public class BeepPrintExample {

	public static void main(String[] args) {
		
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				//Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=1; i<=5; i++) {
					System.out.println(i);
					//Thread.sleep(500);    //try, catch 필요
					try {
						Thread.sleep(500);
					}catch(Exception e) {
						
					}
				}
			}
		});
		
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				
			}
		}

	}

}
