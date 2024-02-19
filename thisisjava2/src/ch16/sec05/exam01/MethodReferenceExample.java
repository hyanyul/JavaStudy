package ch16.sec05.exam01;

public class MethodReferenceExample {

	public static void main(String[] args) {
		Person person = new Person();
		
		//person.action((x, y)->Computer.staticMethod(x, y));      //람다식
		person.action(Computer :: staticMethod);                   //메소드 참조
		
		Computer com = new Computer();
		
		//person.action((x, y)->com.instanceMethod(x, y));
		person.action(com :: instanceMethod);

	}

}
