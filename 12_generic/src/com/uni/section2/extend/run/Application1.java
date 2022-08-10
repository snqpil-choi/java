package com.uni.section2.extend.run;

import com.uni.section2.extend.Bunny;
import com.uni.section2.extend.DrunkenBunny;
import com.uni.section2.extend.Rabbit;
import com.uni.section2.extend.RabbitFarm;

public class Application1 {

	public static void main(String[] args) {
		/* 제네릭 클래스 작성 시 extends 키워드를 사용하면 특정 타입만 사용하도록 제한을 걸 수 있다. */
		// RabbitFarm<Animal> farm1 = new RabbitFarm<>(); // 상위타입으로 못 받는다

		// RabbitFarm<Mammal> farm1 = new RabbitFarm<>();

		// RabbitFarm<Snake> farm1 = new RabbitFarm<>();

		RabbitFarm<Rabbit> farm1 = new RabbitFarm<>();
		RabbitFarm<Bunny> farm2 = new RabbitFarm<>();
		RabbitFarm<DrunkenBunny> farm3 = new RabbitFarm<>();

		// farm1.setAnimal(new Snake());

		farm1.setAnimal(new Rabbit());
		farm1.getAnimal().cry();

		farm2.setAnimal(new Bunny());
		farm2.getAnimal().cry();

		farm3.setAnimal(new DrunkenBunny());
		farm3.getAnimal().cry();

	}

}
