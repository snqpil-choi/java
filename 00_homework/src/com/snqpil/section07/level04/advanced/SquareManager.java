package com.snqpil.section07.level04.advanced;

public class SquareManager {
	
	public void calcPerimeter(ShapeVO shape) { // 사각형 둘레 구하기
		System.out.println("사각형의 둘레는 "+ (2*(shape.getHeight()+shape.getWidth()))+"입니다.");
	}
	
	public void calcArea(ShapeVO shape) { // 사각형 면적 구하기
		System.out.println("사각형의 면적은 "+ (shape.getHeight()*shape.getWidth())+"입니다.");
	}
	
	public void printShape(ShapeVO shape) { // 사각형 정보 출력
		System.out.println("도형 타입 : 사각형");
		System.out.println("높이 : " + shape.getHeight());
		System.out.println("너비 : " + shape.getWidth());
		System.out.println("색상 : " + shape.getColor());
		
	}
	
	public void paintColor(ShapeVO shape, String color) { // 사각형 색칠하기
		shape.setColor(color);
		System.out.println("선택하신 도형을 " + shape.getColor() + "로 색칠합니다.");
		
	}
	
}
