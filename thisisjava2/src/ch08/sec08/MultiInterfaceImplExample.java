package ch08.sec08;

public class MultiInterfaceImplExample {
	public static void main(String[] args) {
		RemoteControl rc = new SmartTelevision();
		
		rc.turnOn();
		rc.turnOff();
		
		Searchable sa = new SmartTelevision();
		
		sa.search("https://www.youtube.com");
		
	}

}
