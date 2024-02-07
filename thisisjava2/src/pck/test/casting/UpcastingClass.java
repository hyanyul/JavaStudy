package pck.test.casting;

class Super {
	String superField;
 
	public void getSuperField() {                     //데이터값 출력
		System.out.println("super: " + superField); 
	}

	public void setSuperField(String superField) {    //데이터값 저장
		this.superField = superField;
	}
	
	public void overrideMethod() {
		System.out.println("나는 슈퍼 메소드");
	}
	
}

class Sub extends Super {
	String subFields;
	
	public void getsubFields() {
		System.out.println("sub: " + subFields);
	}
	
	public void setSubFields(String subFields) {
		this.subFields = subFields;
	}
	
	@Override
	public void overrideMethod() {
		System.out.println("나는 서브 메소드");
	}
}

public class UpcastingClass {
	public static void main(String[] args) {
		Super s = new Sub();      //부모 타입 참조 변수가 자식 객체를 가리킴(Upcasting, 자동 타입 변환)
		s.setSuperField("Parent");
		s.getSuperField();
		//s.setSubField("child");      //s는 부모 객체에 있는 멤버만 접근 가능하므로 오류 발생
		s.overrideMethod();      //오버라이딩된 함수 출력됨
		
		Sub sub = (Sub) s;
		sub.setSubFields("Child");
		sub.getsubFields();
	}
}
