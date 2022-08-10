package com.uni.section2.extend;

public class WildCardFarm {
	
	public void anyType(RabbitFarm<?> farm) {
		farm.getAnimal().cry();
	}
	
	//와일드 카드의 상한 제한
	public void extendsType(RabbitFarm<? extends Bunny> farm) {
		farm.getAnimal().cry();
	}
	
	//와일드 카드의 하한 제한
	public void superType(RabbitFarm<? super Bunny> farm) {
		farm.getAnimal().cry();
	}
	
}
