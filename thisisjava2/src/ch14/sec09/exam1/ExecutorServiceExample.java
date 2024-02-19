package ch14.sec09.exam1;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class ExecutorServiceExample {

	public static void main(String[] args) {
		ExecutorService eS = Executors.newFixedThreadPool(5);
		
		eS.shutdownNow();

	}

}
