package ch05.sec10;

public class AdvencedForExample {         //외부에서 접근이 가능하도록 class 앞에 public 붙음
	public static void main(String[] args) {
		int[] scores = {95, 71, 84, 93, 87};
		
		int sum = 0;
		
		/*for(int score : scores) {
			sum += score;
		}*/
		
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		
		System.out.println("점수 총합= " + sum);
		double avg = (double) sum / scores.length;
		System.out.println("점수 평균= " + avg);
	}

}
