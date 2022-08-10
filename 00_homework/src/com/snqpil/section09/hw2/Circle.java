package com.snqpil.section09.hw2;

public class Circle extends Point {
	
	private int radius;

	public Circle() {
		super();
	}

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void draw() {
		super.draw();
		System.out.println("면적 : " + (3.14 * Math.pow(radius, 2)) ); // 소수첫째자리 반올림해야함
		System.out.println("둘레 : " + (2 * 3.14 * radius) );
	}
	
	

}
