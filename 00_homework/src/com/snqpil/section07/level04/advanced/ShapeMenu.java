package com.snqpil.section07.level04.advanced;

import java.util.Scanner;

public class ShapeMenu {

	private Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		
		
	

		// 반복문을 이용해 메뉴 실행

		while (true) {

			System.out.println("============ 도형계산기 ============");
			System.out.println("3. 삼각형");
			System.out.println("4. 사각형");
			System.out.println("9. 프로그램 종료");
			System.out.println("=================================");
			System.out.println("계산하려는 도형을 선택하세요 : ");

			int no = sc.nextInt();

			switch (no) {
			case 3:
				System.out.print("도형의 높이를 입력하세요 : ");
				double THeight = sc.nextDouble(); // 삼각형 높이값 입력 받음
				System.out.print("도형의 너비를 입력하세요 : ");
				double TWidth = sc.nextDouble(); // 삼각형 너비값 입력 받음
				ShapeVO shape1 = new ShapeVO(no, THeight, TWidth); // 삼각형 정보값 초기화
				triangleMenu(shape1); // 삼각형 메뉴 호출
				break;
			case 4:
				System.out.print("도형의 높이를 입력하세요 : ");
				double SHeight = sc.nextDouble(); // 사각형 높이값 입력 받음
				System.out.print("도형의 너비를 입력하세요 : ");
				double SWidth = sc.nextDouble(); // 사각형 너비값 입력 받음
				ShapeVO shape2 = new ShapeVO(no, SHeight, SWidth); // 사각형 정보값 초기화
				squareMenu(shape2); // 사각형 메뉴 호출
				break;
			case 9:
				System.out.println("프로그램을 종료합니다");
				return;
			default:
				System.out.println("계산할 수 없는 도형입니다. 다시 입력하세요");
				break;
			}
		}

		// 메뉴에 없는 번호 입력시 “계산할 수 없는 도형입니다. 다시 입력하세요” 출력 후 메뉴 다시 출력
		// 9번 입력시 “프로그램을 종료합니다” 출력 후 프로그램 종료
		// 3번 입력시 도형의 높이와 도형의 너비를 스캐너로 입력받고,
		// ShapeVO객체에 매개변수 있는 생성자를 통해 type, height, width 값 전달하여 객체 생성.
		// 동일 클래스의 triangleMenu(shape:ShapeVO)에 생성한 객체를 인자로 전달하여 메소드 호출
		// 4번 입력시 도형의 높이와 도형의 너비를 스캐너로 입력받고,
		// ShapeVO객체에 매개변수 있는 생성자를 통해 객체 생성.
		// 동일 클래스의 squareMenu(shape:ShapeVO))에 생성한 객체를 인자로 전달하여 메소드 호출

	}

	private void triangleMenu(ShapeVO shape) {
		// TriangleManager 객체 생성
		TriangleManager tri1 = new TriangleManager();
		
		
		while (true) {

			System.out.println("========= 삼각형 계산기 =========");
			System.out.println("1. 삼각형의 둘레 구하기");
			//TriangleManager의 calcPerimeter(shape:ShapeVO) 호출
			System.out.println("2. 삼각형의 면적 구하기");
			//TriangleManager의 calcArea(shape:ShapeVO)호출
			System.out.println("3. 선택한 도형 정보 출력하기");
			//TriangleManager의 printShape(shape:ShapeVO) 호출
			System.out.println("4. 도형의 색상 칠하기");
			//TriangleManager의 paintColor(shape:ShapeVO, color:String)
			System.out.println("9. 메인으로 돌아가기");
			//"메인으로 돌아갑니다“ 출력 후 메인메뉴로 돌아감

			int no = sc.nextInt();

			switch (no) {
			case 1: tri1.calcPerimeter(shape);
				break;
			case 2: tri1.calcArea(shape);
				break;
			case 3: tri1.printShape(shape);
				break;
			case 4: tri1.paintColor(shape, inputColor());
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다");
				return;
			default:
				System.out.println("잘못 선택하셨습니다. 메뉴를 다시 선택하세요");
				break;
			}
		}
	}
	

	private void squareMenu(ShapeVO shape) {
		// SquareManager 객체 생성
		SquareManager squ1 = new SquareManager();

		while (true) {

			System.out.println("========= 사각형 계산기 =========");
			System.out.println("1. 사각형의 둘레 구하기");
			// SquareManager의 calcPerimeter(shape:ShapeVO) 호출
			System.out.println("2. 사각형의 면적 구하기");
			// SquareManager의 calcArea(shape:ShapeVO)호출
			System.out.println("3. 선택한 도형 정보 출력하기");
			// SquareManager의 printShape(shape:ShapeVO) 호출
			System.out.println("4. 도형의 색상 칠하기");
			// SquareManager의 paintColor(shape:ShapeVO, color:String)
			System.out.println("9. 메인으로 돌아가기");
			// "메인으로 돌아갑니다“ 출력 후 메인메뉴로 돌아감

			int no = sc.nextInt();

			switch (no) {
			case 1:
				squ1.calcPerimeter(shape);
				break;
			case 2:
				squ1.calcArea(shape);
				break;
			case 3: squ1.printShape(shape);
				break;
			case 4: squ1.paintColor(shape, inputColor());
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다");
				return;
			default:
				System.out.println("잘못 선택하셨습니다. 메뉴를 다시 선택하세요");
				break;
			}
		}
	}

	private String inputColor() {
		// 어떤 색으로 도형을 칠할까요? : <- 색상을 영어로 입력
		System.out.print("어떤 색으로 도형을 칠할까요? : ");
		String color = sc.next();
		// 입력받은 색상값을 문자열 형태로 호출한 쪽으로 반환
		return color;
		
		
		
	}

}
