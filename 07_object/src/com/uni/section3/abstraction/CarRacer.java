package com.uni.section3.abstraction;

public class CarRacer {

	//차가 필요하기 때문에 차를 만든다
	private Car car = new Car();
	
	public void startUp() {
		
//		Car car = new Car(); 이러면 시동 걸 때마다 새 차가 생성되는 것이다
		car.startUp(); // 시동 거는 행위
		
	}
	
	public void stepAccelator() {
		car.go();
	}
	
	public void stepBreak () {
		car.stop();
	}
	
	public void turnOff() {
		car.turnOff();
	}
	
}
