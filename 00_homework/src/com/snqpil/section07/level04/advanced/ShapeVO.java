package com.snqpil.section07.level04.advanced;

public class ShapeVO {
	
	private int type; // 도형의 형식 (3:삼각형, 4:사각형)
	private double height; // 도형의 높이
	private double width; // 도형의 너비
	private String color; // 도형의 색상
	
	public ShapeVO(int type, double height, double width) {
		
		this.type = type; // 
		this.height = height;
		this.width = width;
		this.color = "white";
		
	} // 3개의 값을 초기화 시키는 생성자 생성

	public ShapeVO() {
		
	} // 기본 생성자 생성

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
