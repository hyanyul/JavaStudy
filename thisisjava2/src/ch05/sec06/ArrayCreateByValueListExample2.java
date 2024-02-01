package ch05.sec06;

public class ArrayCreateByValueListExample2 {
	public static void main(String[] args) {
		int[] scores;
		scores = new int[] {83, 90, 87};      //scores 배열 만들어서 대입
		
		int sum1 = 0;
		for(int i=0; i<3; i++) {
			sum1 += scores[i];             //총합 구함
		}
		System.out.println("총합: " + sum1);
		
		printItem(new int[] {83, 90, 87});      
	}
	public static void printItem(int[] scores) {   //매개변수
		for(int i=0; i<3; i++) {
			System.out.println("score[" + i + "]: " + scores[i]);
		}          //함수 정의, 각 점수 출력하는 함수
	}

}
