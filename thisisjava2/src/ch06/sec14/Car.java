package ch06.sec14;

public class Car {
	private int speed;
	private boolean stop;
	
	
	public int getSpeed() {
		return speed;     
	}                               //getter: 내보내는 것
	
	public void setSpeed(int speed) {
		if(speed<0) {
			this.speed = 0;
			return;
		}else {
			this.speed = speed; 
		} 
	}                              // setter: 값 저장
	
	public boolean isStop() {
		return stop;
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
		if(stop == true) this.speed = 0;
	}
}
