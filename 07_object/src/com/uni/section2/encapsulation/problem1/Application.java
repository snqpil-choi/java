package com.uni.section2.encapsulation.problem1;

public class Application {

	public static void main(String[] args) {

		/* 1번 몬스터 생성 */
		Monster monster1 = new Monster();

		monster1.name = "두치";
		monster1.hp = 200;

		/* 몬스터 정보 출력 */
		System.out.println("monster1 name : " + monster1.name);
		System.out.println("monster1 hp : " + monster1.hp);

		/* 2번 몬스터 생성 */

		Monster monster2 = new Monster();

		monster2.name = "뿌꾸";
		monster2.hp = -200; // 체력에 마이너스를 넣고 싶지 않을 땐? setHp 생성

		/* 몬스터 정보 출력 */
		System.out.println("monster2 name : " + monster2.name);
		System.out.println("monster2 hp : " + monster2.hp);

		/* 3번 몬스터 생성 */

		Monster monster3 = new Monster();
		monster3.name = "드라큘라";
		monster3.setHp(200);
		/*
		 * 메소드를 이용해서 객체의 hp값을 변경할 수 도 있다. 양수로 정상 입력된 경우
		 */
		System.out.println("monster3 name : " + monster3.name);
		System.out.println("monster3 hp : " + monster3.hp);

		/* 4번 몬스터 생성 */

		Monster monster4 = new Monster();
		monster4.name = "프랑켄슈타인";
		monster4.setHp(-1000);
		
		System.out.println("monster4 name : " + monster4.name);
		System.out.println("monster4 hp : " + monster4.hp);

	}

}
