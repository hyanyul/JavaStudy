package pck.poly;

class Car{
	Model model;
	
	void drive() {
		model.run();
	}
}

class Model{
	public Bentley model;

	void run() {      //인스턴스 멤버: 객체가 생성되어야만 사용 가능
		System.out.println("차가 달린다.");    
	}
}

class Avante extends Model {
	@Override
	void run() {
		System.out.println("아반떼가 달린다.");
	}
}

class Ramborghini extends Model{
	@Override
	void run() {
		System.out.println("람보르기니가 달린다.");
	}
}

class Bentley extends Model{
	@Override
	void run() {
		System.out.println("벤틀리가 달린다.");
	}
}

public class PolyClass {
	public static void main(String[] args) {
//		Bentley b = new Bentley();
//		b.run();
//		
//		Ramborghini r = new Ramborghini();
//		r.run();
//		
//		Avante a = new Avante();
//		a.run();
//		
		Car c = new Car();
		
		c.model = new Model();
		c.drive();
		
		c.model = new Ramborghini();
		c.drive();
		
		c.model = new Bentley();
		c.drive();
		
		c.model = new Avante();
		c.drive();
	}
}
