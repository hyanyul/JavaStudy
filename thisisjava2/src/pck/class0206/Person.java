package pck.class0206;

//사람의 공통적인 특징

public class Person {
	String name;
	String gender;
	
	void myInfo() {
		System.out.printf("나의 이름은 %s이고, %s입니다.\n", name, gender);
	}
	
	Person(String name, String gender){
		this.name = name;
		this.gender = gender;	
	}
}