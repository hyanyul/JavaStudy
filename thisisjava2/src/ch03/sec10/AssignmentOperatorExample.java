package ch03.sec10;

public class AssignmentOperatorExample {
	public static void main(String[] args) {
		int result = 0;
		result += 10;          //result=10
		System.out.println("result= " + result);
		result -= 5;           //result=5
		System.out.println("result= " + result);
		result *= 3;           //result=15
		System.out.println("result= " + result);
		result /= 5;           //result=3
		System.out.println("result= " + result);
		result %= 3;           //result=0
		System.out.println("result= " + result);
		
		
		int result1 = 100;
		int res = (result1 == 100) ?  1 : 0;              //result1이 100이 맞으면 1, 틀리면 0
		System.out.println(res);                           //(조건식)?(참일 때 나올 값)!(거짓일 때 나올 값)
		
	}

}
