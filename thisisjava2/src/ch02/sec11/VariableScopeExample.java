package ch02.sec11;

//int v2 와 같이 이 영역에 변수 선언 시 이 프로그램의 모든 곳에서 사용 가능(영역 지정 안됨)
public class VariableScopeExample {
	public static void main(String[] args) {
		int v1=15;
		if (v1>10) {
			int v2 = v1-10;     //지역 변수
			System.out.print(v2);
		}
		//int v3=v1+v2+5;              //v2를 사용할 수 없기 때문에 에러 발생(v2는 if 함수 중괄호 속에서만 사용 가능함)
	}

}
