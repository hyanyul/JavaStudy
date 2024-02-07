package ch08.sec03;

public interface RemoteControl {  //인터페이스 생성
	int MAX_VOLUME = 10;          //상수 선언(상수는 상수명 적을 때 대문자로 작성하고, 단어 연결 시 언더바(_) 사용
	int MIN_VOLUME = 0;           //원래 상수 선언 시 public static final 붙여야 하는데 생략 시 컴파일러가 작성해주므로 생략 가능
}
