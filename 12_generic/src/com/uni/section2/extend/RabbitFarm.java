package com.uni.section2.extend;

public class RabbitFarm<T extends Rabbit> {
// T로 넘어올 수 있는 것들이 토끼여야 한다는 것

	private T animal;

	public RabbitFarm() {

	}

	public RabbitFarm(T animal) {
		super();
		this.animal = animal;
	}

	public T getAnimal() {
		return animal;
	}

	public void setAnimal(T animal) {
		this.animal = animal;
	}

}
