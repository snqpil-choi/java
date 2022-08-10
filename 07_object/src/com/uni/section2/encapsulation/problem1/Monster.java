package com.uni.section2.encapsulation.problem1;

public class Monster {
	
	
	String name; // 몬스터 이름
	int hp;   // 몬스터 체력 (전역변수)
	
	
	
	public void setHp(int hp) { // hp: 지역변수 //메소드가 음수인지 감지한 후 입력하도록 해보자
		if (hp > 0) {
			System.out.println("양수값이 입력되어 몬스터의 체력을 입력한 값으로 변경합니다.");
			this.hp = hp;// this: 인스턴스 자신을 가리키는 참조변수, 인스턴스의 주소가 저장되어 있음
			// this에 객체의 주소가 저장되어 있다?
		} else {
			System.out.println("0보다 작거나 같은 값이 입력되어 몬스터의 체력을 0으로 변경합니다.");
			this.hp = 0;
		}
	}

}
