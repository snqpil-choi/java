package com.snqpil.section07.level04.advanced;

public class TriangleManager {
	
	public void calcPerimeter(ShapeVO shape) { // 삼각형 둘레 구하기
		// shape.get이든 set이든 ShapeVO 클래스 내의 메소드를 선택
		double bit = Math.sqrt(Math.pow(shape.getWidth(), 2)+Math.pow(shape.getHeight(), 2) ) ;
		// 빗변 미리 계산
		System.out.println("삼각형의 둘레는 "+ (shape.getWidth() + shape.getHeight() + bit )+"입니다.");
	}
	
	public void calcArea(ShapeVO shape) { // 삼각형 면적 구하기
		
		System.out.println("삼각형의 면적은 " + ( (shape.getWidth() * shape.getHeight()) /2 ) );
	}
	
	public void printShape(ShapeVO shape) { // 삼각형 정보 출력
		System.out.println("도형 타입 : 삼각형");
		System.out.println("높이 : "+ (shape.getHeight()));
		System.out.println("너비 : "+ (shape.getWidth()));
		System.out.println("색상 : "+ (shape.getColor()));
	}
	
	public void paintColor(ShapeVO shape, String color) { // 삼각형 색칠하기
		shape.setColor(color);
		System.out.println("선택하신 도형을 " + shape.getColor() + "로 색칠합니다.");
		
	}

}
