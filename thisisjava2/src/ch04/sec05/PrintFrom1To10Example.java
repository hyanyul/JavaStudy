package ch04.sec05;

public class PrintFrom1To10Example {
	public static void main(String[] args) {
		int i = 1;
		while (i<=10) {
			System.out.print(i+" ");
			i++;
		}
		
		System.out.println();
		
		for(int a = 1; a<=10; a++) {
			System.out.print(a+" ");
		}
	}
}