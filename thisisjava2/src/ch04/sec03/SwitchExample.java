package ch04.sec03;

public class SwitchExample {
	public static void main(String[] args) {
		double random = Math.random();
		int num = (int)(random*6) + 1;
		System.out.printf("random: %f, num: %d\n", random, num);
		
		switch(num) {                  //num: 위에서 설정한 변수 이름 
			case 1:
				System.out.println("1번이 나왔습니다.");
				break;
			case 2:
				System.out.println("2번이 나왔습니다.");
				break;
			case 3:
				System.out.println("3번이 나왔습니다.");
				break;
			case 4: 
				System.out.println("4번이 나왔습니다.");
				break;
			case 5:
				System.out.println("5번이 나왔습니다.");
				break;
			default:         //default는 있어도 되고 없어도 됨
				System.out.println("6번이 나왔습니다.");
		}
	}
}
