package com.uni.section2.abstrat;

public abstract class Product {
	
	// 추상클래스도 필드를 가질 수 있다.
	private int nonStaticField;
	private static int staticField;

	// 생성자도 가질 수 있다. 하지만 직접적으로 인스턴스를 생성할 수 없다.
	public Product() {
			
	}
	
	public void nonStaticMethod() {
		System.out.println("nonStaticMethod 호출함");
	}
	
	public static void staticMethod() {
		System.out.println("staticMethod 호출함");
	}
	
	// 추가적으로 추상메소드 (미완성 메소드)를 만들 수 있다
	// 추상메소드가 0개 이상인 경우 클래스에 abstract 키워드를 작성해야한다.
	public abstract void abstMethod();
	
}
