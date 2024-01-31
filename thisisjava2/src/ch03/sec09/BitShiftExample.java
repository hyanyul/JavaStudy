package ch03.sec09;

public class BitShiftExample {
	public static void main(String[] args) {
		int value = 722;            //00000000 00000000 00000011 00000100
		
		byte byte1 = (byte) (value >>> 24);     //00000000
		int int1 = byte1 & 255;             //255=11111111
		System.out.println("첫 번째 바이트 부호 없는 값: " + int1);
		
		byte byte2 = (byte) (value >>> 16);       //00000000
		int int2 = Byte.toUnsignedInt(byte2);
		System.out.println("두 번째 바이트 부호 없는 값: " + int2);
		
		byte byte3 = (byte)(value >>> 8);              //00000011
		int int3 = byte3 & 255;
		System.out.println("세 번째 바이트 부호 없는 값: " + int3);      
		
		byte byte4 = (byte) value;          //00000100   제일 마지막의 1byte가 저장됨
		int int4 = Byte.toUnsignedInt(byte4);
		System.out.println("네 번째 바이트 부호 없는 값: " + int4);
		
		byte b = -128;        //좌측==L value-변수 와야 함, 우측==R value-리터럴 와야 함(변수 넣으면 변수 안의 값을 끄집어내서 넣기때문에 상관없음)
		System.out.println(b >> 1);
	}

}