package ch09.sec05.exam03;

public class ButtonExample {

	public static void main(String[] args) {          //메인 메소드
		Button btn = new Button();        //디폴트 생성자 호출->객체 생성
		
		class OkListener implements Button.ClickListener{        //구현 클래스
			@Override                                     //재정의
			public void onClick() {
				System.out.println("Ok 버튼을 클릭했습니다.");
			}
		}
		
		btn.setClickListener(new OkListener());
		
		btn.click();
		
		
		//Button btnCancle = new Button();
		
		class CancelListener implements Button.ClickListener{
			@Override
			public void onClick() {
				System.out.println("Cancle 버튼을 클릭했습니다.");
			}
		}
		
		btn.setClickListener(new CancelListener());
		
		btn.click();
		

	}

}
