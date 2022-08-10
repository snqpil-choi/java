package com.snqpil.section08.hw2;

import java.util.Scanner;

public class Run {
	
	

	public static void main(String[] args) {
		// 최대 10명의 학생 정보를 기록할 수 있게 배열을 할당한다.
		Student[] studentArr = new Student[10];
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0; // 학생 수를 나타내는 변수  한 명 추가 시 1씩 증가시켜줄꺼임
		
		// while(true)을 사용하여 학생들의 정보를 계속 입력 받고
		while(true) {
			System.out.print("학년 입력 : ");
			int grade = sc.nextInt();
//			studentArr[count].setGrade(grade);
			
			System.out.print("반 입력 : ");
			int classroom = sc.nextInt();
//			studentArr[count].setClassroom(classroom);
			
			System.out.print("이름 입력 : ");
			String name = sc.next();
//			studentArr[count].setName(name);
			
			System.out.print("국어점수 입력 : ");
			int kor = sc.nextInt();
//			studentArr[count].setKor(sc.nextInt());
			
			System.out.print("영어점수 입력 : ");
			int eng = sc.nextInt();
//			studentArr[count].setEng(sc.nextInt());
			
			System.out.print("수학점수 입력 : ");
			int math = sc.nextInt();
//			studentArr[count].setMath(sc.nextInt());
			
		
		
		// 입력 받은 정보들을 가지고 배열의 count 인덱스에 매개변수 생성자를 통해 객체 생성
//		studentArr[count] = new Student(studentArr[count].getGrade()
//				, studentArr[count].getClassroom()
//				, studentArr[count].getName()
//				, studentArr[count].getKor()
//				, studentArr[count].getEng()
//				, studentArr[count].getMath());
		
		studentArr[count] = new Student(grade, classroom, name, kor, eng, math);
			
			
		// 한 명씩 추가 되었기 때문에 count 1증가
		count = count + 1;
		
		// 계속 추가할 것인지 물어보고, ‘n’ 입력 시 반복문 빠져나감
		System.out.println("추가 입력할 학생이 있습니까? (y/n)");
		char answer = sc.next().charAt(0);
		if ( answer == 'n' ) {
			break; }
		}
		
		// 현재 배열에 담겨있는
		// 학생들의 정보를 모두 출력
		for (int i = 0 ; i < studentArr.length ; i++) {
			System.out.println(studentArr[i].information());
		}
	}

}
