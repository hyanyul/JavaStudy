package ch02.sec12;

public class PrintTest {
	public static void main(String[] args) {      //ptintln을 사용해서 본인 이름, 나이 출력 / 이름과 나이 변수에 넣을 것
		String name="한성지";
		int age = 24;               //byte도 가능한듯 (127세까지는 별 문제 없을듯)
		
		System.out.println(name);
		System.out.println(age);
		System.out.println("나의 이름은 "+name+", 나이는 "+age);
		
		System.out.printf("내 이름은 %s이고, ", name);     //%s: 문자형, %d(decimal=십진법): 정수형
		System.out.printf("나이는 %d세 입니다.", age);      //out: 출력 스트림, in: 입력 스트림
		
		System.out.printf("\n나의 이름은 %s이고, 나이는 %d 입니다.", name, age);    //printf는 줄바꿈 안됨
	}
}
