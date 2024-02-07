package pck.class0206;

public class Student extends Person{
	int sId;   //학번
	int grade;
	String school;   //학교
	
	@Override
	void myInfo() {
		System.out.printf("나는 %s 학교 %d학년에 재학 중인 %d학번 %s %s입니다.", school, grade, sId, gender, name);
	}
	
	Student(String name, String gender, int sId, int grade, String school){
		super(name, gender);
		
		this.sId = sId;
		this.grade = grade;
		this.school = school;
		
	}
}
