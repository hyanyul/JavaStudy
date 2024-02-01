package ch05.sec03;

public class ReferanceVariableCompareExample {
	public static void main(String[] args) {     //public: 아무나 접근 가능 / 클래스 밖에 작성 시 인식 못함
		int arr1[];     //[]: 타입 뒤, 변수명 뒤 아무곳에 붙여도 됨
		int[] arr2;     //배열: 연속적으로 값 저장, 동일한 타입이어야 함
		int[] arr3;
		
		arr1 = new int[] {1, 2, 3};
		arr2 = new int[] {1, 2, 3};
		arr3 = arr2;
		
		System.out.println(arr1 == arr2);
		
		System.out.println(arr2 == arr3);
	}

}
