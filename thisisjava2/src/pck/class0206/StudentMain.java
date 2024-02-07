package pck.class0206;

public class StudentMain {

	public static void main(String[] args) {
		Person ps = new Person("한성지", "여자");
		ps.myInfo();
		
		Student st = new Student("한성지", "여자", 123456, 4, "부경대");
		st.myInfo();
	}

}
