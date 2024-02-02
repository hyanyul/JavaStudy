package pck.test.ck;


//1. Setter 이용하여 초기화하기
class Car3{
	//++++++++++++++++++++++++++++멤버 변수(속성, 필드, 데이터)
	String kind = "세단";        //공통으로 적용될 속성은 초기화 진행
	String modelName;
	String carColor;
	int carYear;
	//++++++++++++++++++++++++++++메소드 영역(멤버 함수, 기능, 행위)
	public void setModelName(String modelName) {        //modelName의 셋팅 메소드    /(): setModelName에서만 사용할 수 있는 지역 변수
		this.modelName = modelName;     //멤버 변수에 지역 변수 넣음    /의미 부여를 위해 이름 같게 했을 뿐 다르게 해도 됨
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	public void setCarYear(int carYear) {
		this.carYear = carYear;
	}
}

//출력 형태: 세단, 흰색, 2024
public class CreateCar2 {
	public static void main(String[] args) {
		Car3 c = new Car3();
		
		c.setModelName("람보르기니");
		c.setKind("세단");
		c.setCarColor("흰색");
		c.setCarYear(2024);
		
		System.out.printf("이 차는 %s %s이고, %s이며, %d형입니다.", c.kind, c.modelName, c.carColor, c.carYear);
		
		
		
	}

}
