package ch06.sec08.exam2;

//총합 더하는 프로그램

public class Computer {
	int sum(int ... values) {     //가변길이 매개변수, 배열의 형태로 전달됨, 동일 타입 여러개 입력 가능, 배열 형태 입력 가능   / 입력부를 배열로 고칠 시 
		int sum = 0;              //변수 선언
	
	for(int i=0; i<values.length; i++) {    //for문을 이용해 총합 계산
		sum += values[i];
	}
	
	return sum;      //출력이 class인 메소드이므로 return문을 통해 값 리턴해줌
	
}
}
