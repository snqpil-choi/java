package com.uni.section2.encapsulation.problem3;

public class Monster {
	
	String kinds; // 변수명을 name에서 kinds로 바꿔도 문제없음
	int hp;
	
	
	public void setInfo(String info) {
		this.kinds = info;
	}
	
	public void setHp(int hp) {
		
		if(hp > 0) {
			this.hp = hp;
		} else {
			this.hp = 0;
		}
	}
	
	public String getInfo() {
		return "몬스터의 이름은 "+ this.kinds + "이고, 체력은 " + this.hp + " 입니다.";
		
	}
	
}
