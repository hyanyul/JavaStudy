package ch06.sec15;

public class SingletonExample {
	public static void main(String[] args) {
		//Singleton obj1 = new Singleton();     //private로 선언되어 있기 때문에 생성자를 통해 새로운 객체 생성 불가
		//Singleton obj2 = new Singleton();     //컴파일 에러
		
		Singleton obj1 = Singleton.getInstance();     //메소드를 통해 미리 만들어놓은 객체 내보냄
		Singleton obj2 = Singleton.getInstance();     //정적 메소드 호출해서 싱글톤 객체 얻음
		
		if(obj1 == obj2) {
			System.out.println("같은 singleton 객체입니다.");    //미리 만들어놓은 객체를 참조한 것이기 때문에 obj1과 obj2는 동일한 객체를 참조함
			System.out.println(obj1 + ", " + obj2);
		}else {
			System.out.println("다른 singleton 객체입니다.");
		}
	}
}
