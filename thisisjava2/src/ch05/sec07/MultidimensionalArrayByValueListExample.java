package ch05.sec07;

public class MultidimensionalArrayByValueListExample {
	public static void main(String[] args) {
		int[][] scores= {      //2차원 배열
				{80, 90, 96},   //각각 행의 길이 달라도 됨
				{76, 88}
				};
		
		/*
		 *2차원 배열 생성 시 각 행의 열의 수 달라도 됨
		 *방부터 만들고 이후에 데이터 넣을 수 있음
		*/
		
		System.out.println("1차원 배열 길이(반의 수): "+ scores.length);  //행 개수
		System.out.println("2차원 배열 길이(첫 번째 반의 학생 수): " + scores[0].length);    //각 행의 길이
		System.out.println("2차원 배열 길이(두 번째 반의 학생 수): " + scores[1].length);
		
		System.out.println("scores[0][2]: " + scores[0][2]);      //0번째 행의 2번 출력
		System.out.println("scores[1][1]: " + scores[1][1]);
		
		int class1Sum = 0;
		for(int i=0; i<scores[0].length; i++) {
			class1Sum += scores[0][i];
		}
		double class1Avg = (double) class1Sum / scores[0].length;
		System.out.println("첫 번째 반의 평균 점수: " + class1Avg);
		
		int class2Sum = 0;
		for(int i=0; i<scores[1].length; i++) {
			class2Sum += scores[1][i];
		}
		
		double class2Avg = (double) class2Sum / scores[1].length;
		System.out.println("두 번째 반의 평균 점수: " + class2Avg);
		
		int totalStudent = 0;
		int totalSum = 0;
		for(int i=0; i<scores.length; i++) {
			totalStudent += scores[i].length;          //반을 나타냄
			for(int k=0; k<scores[i].length; k++) {
				totalSum += scores[i][k];                //반 안의 학생 수 나타냄
			}
			
		}
		double totalAvg = (double) totalSum / totalStudent;
		System.out.println("전체 학생의 평균 점수: " + totalAvg);
		
		}
	}


