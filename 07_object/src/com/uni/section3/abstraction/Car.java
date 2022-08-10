package com.uni.section3.abstraction;

public class Car {
	
	private boolean isOn; // 초기에는 시동이 꺼진 false 상태 초기값 false
	private int speed; // 초기값이 0, 출발 메소드 안 부터 들어간다
	
	public void startUp() { // 시동 메소드
		
		if(isOn) {
			System.out.println("이미 시동이 걸려있습니다.");
		} else {
			this.isOn = true; // 시동이 안걸린 상태라면 시동 상태를 true로 변경
			System.out.println("시동을 걸었습니다. 이제 출발할 준비가 완료되었습니다.");
		}
	}
	
	
	
	public void go() { // 출발 메소드
		
		if(isOn) {
			System.out.println("차가 앞으로 움직입니다.");
			this.speed += 10;
			System.out.println("현재 차의 시속은 "+ this.speed + "km/h 입니다.");
		} else { // 시동이 안걸려있다면
			System.out.println("차의 시동이 걸려있지 않습니다. 시동을 걸어주세요.");
		}
	}
	
	
	public void stop() { // 멈춤 메소드
		if(isOn) { // 시동이 걸려있어야 멈출 수 있다
			if(this.speed>0) { // 자동차가 달리고 있다면
				this.speed = 0;
				System.out.println("브레이크를 밟았습니다. 차를 멈춥니다.");
				
			} else {
				System.out.println("차는 이미 멈춰있는 상태입니다.");
			}
		} else {
			System.out.println("차의 시동이 걸려있지 않습니다. 시동을 걸어주세요.");
		}
	}
	
	public void turnOff() { // 시동 끔 메소드
		if(isOn) {
			if(this.speed > 0) {
				System.out.println("달리는 상태에서 시동을 끌 수 없습니다. 차를 우선 멈추세요");
			} else { // 멈춰있는 상태라면
				this.isOn = false;
				System.out.println("시동을 끕니다. 다시 운행하려면 시동을 켜주세요.");
			}
			
		} else {
			System.out.println("이미 시동이 꺼져 있는 상태입니다. 시동상태를 확인해주세요");
		}
	}
}
