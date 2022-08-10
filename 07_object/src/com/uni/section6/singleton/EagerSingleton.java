package com.uni.section6.singleton;

public class EagerSingleton {
	// 클래스가 초기화 되는 시점에 인스턴스를 생성 , 즉 프로그램이 로딩될때 생성
	private static EagerSingleton eager = new EagerSingleton(); // 먼저 static으로 싱글톤 패턴의 객체를 생성하고 사용
	
	// 기본생성자를 private 선언을 함으로서 외부에서 인스턴스 생성을 제한한다.
	private EagerSingleton() {
	}
	
	public static EagerSingleton getInstance() { // public 메소드를 호출하면 인스턴스를 반환하도록 한다.
		return eager; // 생성된 인스턴스를 반환
	}
}
