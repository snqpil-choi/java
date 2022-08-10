package com.snqpil.section07.level02.normal;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		//기본 생성자를 이용하여 인스턴스 생성 후 필드 값 출력
		BookVO book1 = new BookVO();
		book1.printInformation(); // JVM 초기값
		
		//필드 3가지를 초기화하는 생성자를 이용하여 인스턴스 생성 후 필드 값 출력
		BookVO book2 = new BookVO("자바의 정석", "도우출판", "남궁성");
		book2.printInformation();
		
		//모든 필드를 초기화하는 생성자를 이용하여 인스턴스 생성 후 필드 값 출력
		BookVO book3 = new BookVO("홍길동전", "활빈당", "허균", 5000000, 0.5);
		book3.printInformation();
		
		
		
		/* Normal 문제 2번*/
		
		//스캐너로 학생 정보를 모두 입력 받아 모든 필드를 초기화하는 생성자로 인스턴스 생성 후
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== 학생 정보 입력 ===");
		System.out.print("학년 입력 : ");
		int grade = sc.nextInt();
		System.out.print("반 입력 : ");
		int classroom = sc.nextInt();
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("키 입력 : ");
		double height = sc.nextDouble();
		System.out.print("성별 입력 : ");
		char gender = sc.next().charAt(0);
		
		StudentVO student1 = new StudentVO(grade, classroom, name, height, gender);
		
		//모든 필드 정보를 출력하는 printInformation() 메소드 호출하여 출력
		
		student1.printInformation();
		
				
		
	}

}
