package com.uni.section1.poly;

public class Application2 {

	public static void main(String[] args) {
		// 상위타입으로 객체 배열 5개 만들고 각 인덱스에 인스턴스 생성해서 대입 (랜덤하게 알아서)
		// cry 메소드 실행
		//각 클래스 별 고유 메소드 동작 instanceof 사용  토끼나, 호랑이가 아니면 "토끼나 호랑이가 아닙니다 출력"
		
		Animal[] animal = new Animal[5];
		
		animal[0] = new Rabbit();
		animal[1] = new Tiger();
		animal[2] = new Tiger();
		animal[3] = new Rabbit();
		animal[4] = new Tiger();
		
		for (int i = 0 ; i < animal.length ; i++) {
			animal[i].cry();
		}
		
		for (int i = 0 ; i < animal.length ; i++) {
			/*동물들아 너가 만약 토끼면 점프를 뛰고 호랑이면 물어라! 하는 느낌이다. */
		if (animal[i] instanceof Rabbit) { // 토끼가 맞다면
			((Rabbit) animal[i]).jump(); // 토끼가 점프 (다운캐스팅)
		} else if (animal[i] instanceof Tiger) { // 호랑이가 맞다면
			 ((Tiger) animal[i]).bite(); // 호랑이가 물기 (다운캐스팅)
		}else {
			System.out.println("토끼나 호랑이가 아닙니다.");
		}
	}

}

}

