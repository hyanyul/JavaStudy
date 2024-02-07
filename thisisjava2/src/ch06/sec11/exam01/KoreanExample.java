package ch06.sec11.exam01;

public class KoreanExample {
	public static void main(String[] args) {
		Korean k1 = new Korean("123456-1234567", "김자바");   //생성자 통해 ssn, name 초기화
		
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);
		
		//k1.nation = "미국";   
		//k1.ssn = "124567-1356812";    //final 키워드 때문에 변경 불가
		k1.name = "김자바";     //name의 경우 final 키워드로 고정시키지 않았기 때문에 수정 가능
		System.out.println(k1.toString());   //ch06.sec11.exam01.Korean@279f2327 출력됨(JVM이 알아듣는 클래스의 이름이 출력됨)
	}
}
