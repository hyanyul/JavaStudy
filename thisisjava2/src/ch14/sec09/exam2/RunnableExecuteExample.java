package ch14.sec09.exam2;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class RunnableExecuteExample {

	public static void main(String[] args) {
		String[][] mails = new String[1000][3];      //1000개 메일 생성
		for(int i=0; i<mails.length; i++) {
			mails[i][0] = "admin@my.com";
			mails[i][1] = "member" + i + "@my.com";
			mails[i][2] = "신상품 입고";
		}
		
		ExecutorService eS = Executors.newFixedThreadPool(5);   //작업 큐 만들어짐, 대기 가능 스레드: 5개
		
		for(int i=0; i<1000; i++) {         //메일 보내는 작업 생성 및 처리 요청
			final int idx = i;    //
			eS.execute(new Runnable() {   //작업 큐에 블럭 안의 작업 내용 미리 넣음->놀고 있는 스레드 있으면 작업 처리함
				@Override                 //로컬 클래스
				public void run() {
					Thread t = Thread.currentThread();
					String from = mails[idx][0];         //i를 안에 쓰면 i가 final 특성 갖게 됨->증가 불가
					String to = mails[idx][1];
					String content = mails[idx][2];
					System.out.println("[" + t.getName() + "]" + from + "==>" + to + ":" + content);
				}
			});
		}
		
		eS.shutdown();

	}

}
