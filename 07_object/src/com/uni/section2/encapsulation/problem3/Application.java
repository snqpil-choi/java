package com.uni.section2.encapsulation.problem3;

public class Application {

	public static void main(String[] args) {
		
		// 몬스터 4개 만들고 정보출력
		
		Monster monster1 = new Monster();
		monster1.setInfo("드라큘라"); // name 변수명 설정을 못하도록 간접적으로 접근
		monster1.setHp(200); // hp 변수명 변경을 못하도록 간접적으로 접근

		Monster monster2 = new Monster();
		monster2.setInfo("프랑켄슈타인");
		monster2.setHp(300);

		Monster monster3 = new Monster();
		monster3.setInfo("미이라");
		monster3.setHp(400);
		
		Monster monster4 = new Monster();
		monster4.setInfo("처녀귀신");
		monster4.setHp(500);

		System.out.println(monster1.getInfo());
		System.out.println(monster2.getInfo());
		System.out.println(monster3.getInfo());
		System.out.println(monster4.getInfo());
		
		Monster monster5 = new Monster();
		monster5.kinds = "두치";
		monster5.hp = -500;
		
		System.out.println("monster5 kinds : " + monster5.kinds);
		System.out.println("monster5 hp : " + monster5.hp);
		// monster5처럼 하지못하도록 접근제한을 걸어보자! (problem4)
		
	}

}