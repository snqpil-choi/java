package com.uni.section1.extend;

public class RacingCar extends Car{
	
	public RacingCar() {
		System.out.println("Racing클래스 기본생성자 호출됨");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("레이싱카가 전속력으로 질주합니다.");
	}

	@Override
	public void soundHorn() {
		// TODO Auto-generated method stub
		System.out.println("레이싱카는 경적을 울리지 않습니다. (조용)");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("레이싱카가 멈춥니다.");
	}
	
	
}
